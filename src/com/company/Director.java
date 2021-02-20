package com.company;
import java.sql.*;
public class Director extends Company
{
    private String user = "postgres";//login for PostgreSQL
    private String password = "020716";//password
    private String connection = "jdbc:postgresql://localhost:5432/Director";//domain
    private Connection con;//statement for connecting with PostgreSQL
    private ResultSet res;//statement for write in Query Tool
    private Statement stmt;//statement for inputting in PostgreSQL (Query Tool)
    public void OutputDB()//function for show all information in table for Director
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connection,user,password);
            stmt = con.createStatement();
            res = stmt.executeQuery("select * from employee");//query tool
            while(res.next())
            {
                System.out.println(res.getInt("id") + " " + res.getString("name") + " " + res.getString("surname") + " " + res.getString("position") + " " + res.getInt("salary"));
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
    public void InputDB(String id, String name, String surname, String position, String salary)//function for inputting
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connection,user,password);
            stmt = con.createStatement();
            res = stmt.executeQuery("insert into employee(id,name,surname,position,salary)  " +
                    "                   values(" + id + ", '" + name + "', '" + surname + "', '" + position + "', " + salary + ")");//query tool
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
    public void UpdateDB(String id,String name,String surname,String position,String salary)//function for updating
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(connection,user,password);
            stmt = con.createStatement();
            res = stmt.executeQuery("update employee set name = " + "'" + name + "'" +
                                        ", surname = " + "'" + surname + "'" +
                                        ", position = " + position +
                                        ", salary = " + salary +
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
            res = stmt.executeQuery("delete from employee where id = " + id);//query tool
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
