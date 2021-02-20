package com.company;
import java.sql.*;
public class Employee extends Company
{
    private String user = "postgres";//login for PostgreSQL
    private String password = "020716";//password
    private String connection = "jdbc:postgresql://localhost:5432/Employee";//domain
    private Connection con;//statement for connecting with PostgreSQL
    private ResultSet res;//statement for write in Query Tool
    private Statement stmt;//statement for inputting in PostgreSQL (Query Tool)
    public void OutputDB()//function for show all information in table for Employee
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connection,user,password);
            stmt = con.createStatement();
            res = stmt.executeQuery("select * from data_of_compony");//query tool
            while(res.next())
            {
                System.out.println(res.getInt("id") + " " + res.getString("product_name") + " " + res.getString("type_of_product") + " " + res.getInt("product_cost"));
            }
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (Exception e) {
            //e.printStackTrace();
            System.out.println();
        }
    }
    public void InputDB(String id,String name,String type,String cost)//function for inputting
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connection,user,password);
            stmt = con.createStatement();
            res = stmt.executeQuery("insert into data_of_compony(id,product_name,type_of_product,product_cost)" +
                                        "values(" + id + ",'" + name + "','" + type + "'," + cost + ")");//query tool
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            //e.printStackTrace();
            System.out.println();
        }
    }
    public void UpdateDB(String id, String name, String type, String cost)//function for updating
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connection,user,password);
            stmt = con.createStatement();
            res = stmt.executeQuery("update data_of_compony set product_name = " + "'" + name + "'" +
                                        ", type_of_product = " + "'" + type + "'" +
                                        ", product_cost = " + cost +
                                        " where id = " + id);//query tool
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            //e.printStackTrace();
            System.out.println();
        }
    }
    public void DeleteDB(String id)//function for deleting via id
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connection,user,password);
            stmt = con.createStatement();
            res = stmt.executeQuery("delete from data_of_compony where id = " + id);//Query tool
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            //e.printStackTrace();
            System.out.println();
        }
    }
}