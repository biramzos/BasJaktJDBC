package com.company;
import java.util.*;
public class Company implements Interface
{
    private String password;
    private Scanner sc = new Scanner(System.in);//Scanner for inputting
    @Override
    public void app()//function of app
    {
        String server;//variable server for choose server(Employees or Director) only for director of company
        password = sc.nextLine();//input password
        System.out.println("-------------------------------------------------------------------------------");//horizontal line
        String comand;//statement
        if(password.equals("director")) //if director are logging in
        {
            System.out.println("Choose server please: ");
            System.out.println("1.Director.");//first server called 'Director'
            System.out.println("2.Employee.");//second server called 'Employee'
            server = sc.nextLine();//choose server only for director
            System.out.println("-------------------------------------------------------------------------------");//horizontal line
            if(server.equals("Director") || server.equals("1"))//server of Director
            {
                Director user = new Director();//data type of Director called user
                String id;//variable of id of employees
                String name;//variable of name of employee
                String surname;//variable of surname of employee
                String position;//variable of position of employees
                String salary;//variable of salary of employees
                String var;//variable called variant(var)
                String comp;//variabe for identifying (start or finish)
                System.out.println("If you wanna start please press 'start', else 'stop'!");
                comp = sc.nextLine();//inputting
                System.out.println("-------------------------------------------------------------------------------");//horizontal line
                while (comp.equals("start")) //while loop for repeating actions
                {
                    System.out.println("Enter command:");//inputting command
                    System.out.println("1.insert");
                    System.out.println("2.update");
                    System.out.println("3.delete");
                    System.out.println("4.show");
                    comand = sc.nextLine();//inputting
                    if (comand.equals("insert") || comand.equals("1")) //command of insert(add)
                    {
                        System.out.println("Enter id:");//inputting id
                        id = sc.nextLine();
                        System.out.println("Enter name:");//inputting name
                        name = sc.nextLine();
                        System.out.println("Enter surname:");//inputting surname
                        surname = sc.nextLine();
                        System.out.println("Enter position:");//inputting position
                        position = sc.nextLine();
                        System.out.println("Enter salary($):");//inputting salary
                        salary = sc.nextLine();
                        user.InputDB(id, name, surname, position, salary);//call function of Input
                        System.out.println("Successfully!");
                        System.out.println("Could I show?");
                        var = sc.nextLine();
                        if (var.equals("yes"))//if variant yes, it shows data about employees
                        {
                            System.out.println("Data about employees in company 'BasJakt'.");
                            System.out.println();
                            user.OutputDB();//call function of output
                        }
                        else if (var.equals("no")) //if variant no, it shows just 'ok!'
                        {
                            System.out.println("Ok!");
                        }
                        else {//if otherwise, shows 'Error!'
                            System.out.println("Error!");
                        }
                    }
                    else if (comand.equals("update") || comand.equals("2")) //command of update
                    {
                        System.out.println("Enter id:");//inputting id
                        id = sc.nextLine();
                        System.out.println("Enter name:");//inputting name
                        name = sc.nextLine();
                        System.out.println("Enter surname:");//inputting surname
                        surname = sc.nextLine();
                        System.out.println("Enter position:");//inputting postion
                        position = sc.nextLine();
                        System.out.println("Enter salary($):");//inputting salary
                        salary = sc.nextLine();
                        user.UpdateDB(id, name, surname, position, salary);//call function of update
                        System.out.println("Successfully!");
                        System.out.println("Could I show?");
                        var = sc.nextLine();
                        if (var.equals("yes"))//if variant yes, it shows updated data
                        {
                            System.out.println("Data about employees in company 'BasJakt'.");
                            System.out.println();
                            user.OutputDB();//call function of output
                        }
                        else if (var.equals("no")) //if variant no, it shows just 'ok!'
                        {
                            System.out.println("Ok!");
                        }
                        else {//if otherwise, it shows 'Error!'
                            System.out.println("Error!");
                        }
                    }
                    else if (comand.equals("delete") || comand.equals("3")) //command of delete
                    {
                        System.out.println("Enter id:");//inputting only id
                        id = sc.nextLine();
                        user.DeleteDB(id);//call function of delete
                        System.out.println("Successfully!");
                        System.out.println("Could I show?");
                        var = sc.nextLine();
                        if (var.equals("yes"))//if variant yes, it shows updated data
                        {
                            System.out.println("Data about employees in company 'BasJakt'.");
                            System.out.println();
                            user.OutputDB();//call function  of output
                        }
                        else if (var.equals("no"))//if variant no, it shows just 'ok!'
                        {
                            System.out.println("Ok!");
                        }
                        else {//if otherwise, it shows 'Error!'
                            System.out.println("Error!");
                        }
                    }
                    else if (comand.equals("show") || comand.equals("4")) //command of show
                    {
                        System.out.println("Data about employees in company 'BasJakt'.");
                        System.out.println();
                        user.OutputDB();//call function of output
                    }
                    else {//otherwise ,if shows 'Error command!'
                        System.out.println("Error command!");
                    }
                    System.out.println("-------------------------------------------------------------------------------");//horizontal line
                    System.out.println("If you have not finished please press 'start', else 'stop'!");
                    comp = sc.nextLine();//choose continue or finish
                }
            }
            else if(server.equals("Employee") || server.equals("2"))//server of Employees
            {
                Employee worker = new Employee();//data type of employee
                String id;//variable of id
                String name;//variable of product name
                String type;//variable of product type
                String cost;//variable of product cost
                String var;////variable called variant(var)
                String comp;//variabe for identifying (start or finish)
                System.out.println("If you wanna start please press 'start', else 'stop'!");
                comp = sc.nextLine();//inputting comp
                System.out.println("-------------------------------------------------------------------------------");//horizontal line
                while (comp.equals("start"))//while loop for repeating actions
                {
                    System.out.println("Enter command:");//inputting command
                    System.out.println("1.insert");
                    System.out.println("2.update");
                    System.out.println("3.delete");
                    System.out.println("4.show");
                    comand = sc.nextLine();
                    if (comand.equals("insert") || comand.equals("1"))//command of insert
                    {
                        System.out.println("Enter id:");//inputting id
                        id = sc.nextLine();
                        System.out.println("Enter product name:");//inputting product name
                        name = sc.nextLine();
                        System.out.println("Enter product type:");//inputting product type
                        type = sc.nextLine();
                        System.out.println("Enter product cost($):");//inputting product cost
                        cost = sc.nextLine();
                        worker.InputDB(id, name, type, cost);//call function of input in class of Employee
                        System.out.println("Successfully!");
                        System.out.println("Could I show?");
                        var = sc.nextLine();//choose variant
                        if (var.equals("yes"))//if yes, it shows all data about all products
                        {
                            System.out.println("Data about products which company 'BasJakt' created");
                            System.out.println();
                            worker.OutputDB();//call function of output
                        }
                        else if (var.equals("no"))//if no, it shows just 'ok!'
                        {
                            System.out.println("Ok!");
                        }
                        else {//if otherwise, it shows 'Error!'
                            System.out.println("Error!");
                        }
                    }
                    else if (comand.equals("update") || comand.equals("2"))//command of update
                    {
                        System.out.println("Enter id:");//inputting id
                        id = sc.nextLine();
                        System.out.println("Enter product name:");//inputting product name
                        name = sc.nextLine();
                        System.out.println("Enter product type:");//inputting product type
                        type = sc.nextLine();
                        System.out.println("Enter product cost($):");//inputting product cost
                        cost = sc.nextLine();
                        worker.UpdateDB(id, name, type, cost);//call function of update
                        System.out.println("Successfully!");
                        System.out.println("Could I show?");
                        var = sc.nextLine();//choose variant
                        if (var.equals("yes"))//if yes, it shows updated data
                        {
                            System.out.println("Data about products which company 'BasJakt' created");
                            System.out.println();
                            worker.OutputDB();//call function of output
                        }
                        else if (var.equals("no"))//if no, it shows just 'ok!'
                        {
                            System.out.println("Ok!");
                        }
                        else {//if otherwise, it shows 'Error!'
                            System.out.println("Error!");
                        }
                    }
                    else if (comand.equals("delete") || comand.equals("3")) //command of delete via id
                    {
                        System.out.println("Enter id:");//inputting id
                        id = sc.nextLine();
                        worker.DeleteDB(id);//call function of delete in Employee
                        System.out.println("Successfully!");
                        System.out.println("Could I show?");
                        var = sc.nextLine();//choose variant
                        if (var.equals("yes"))//if yes,it shows updated data
                        {
                            System.out.println("Data about products which company 'BasJakt' created");
                            System.out.println();
                            worker.OutputDB();//call fucntion of output
                        }
                        else if (var.equals("no"))//if no, it shows just 'ok!'
                        {
                            System.out.println("Ok!");
                        }
                        else {//if otherwise, it shows 'Error!'
                            System.out.println("Error!");
                        }
                    }
                    else if (comand.equals("show") || comand.equals("4"))//command of show
                    {
                        System.out.println("Data about products which company 'BasJakt' created");
                        System.out.println();
                        worker.OutputDB();//call function of output
                    }
                    else {//if other command,it show 'Error command!'
                        System.out.println("Error command!");
                    }
                    System.out.println("-------------------------------------------------------------------------------");//horizontal line
                    System.out.println("If you have not finished please press 'start', else 'stop'!");
                    comp = sc.nextLine();//choose continue or finish
                }
            }
            else{
                System.out.println("Error server!");
            }

        }
        else if(password.equals("employee"))//log in for employees of company
        {
            Employee worker = new Employee();//data type of Employee
            String id;//variable of id
            String name;//variable of product name
            String type;//variable of product type
            String cost;//variable of product cost
            String var;//variable called variant(var)
            String comp;//variabe for identifying (start or finish)
            System.out.println("If you wanna start please press 'start', else 'stop'!");
            comp = sc.nextLine();//inputting comp variable
            System.out.println("-------------------------------------------------------------------------------");//horizontal line
            while (comp.equals("start")) //while loop for repeating actions
            {
                System.out.println("Enter command:");//inputting command
                System.out.println("1.insert");
                System.out.println("2.update");
                System.out.println("3.delete");
                System.out.println("4.show");
                comand = sc.nextLine();
                if (comand.equals("insert") || comand.equals("1"))//command of insert
                {
                    System.out.println("Enter id:");//inputting id
                    id = sc.nextLine();
                    System.out.println("Enter product name:");//inputting product name
                    name = sc.nextLine();
                    System.out.println("Enter product type:");//inputting product type
                    type = sc.nextLine();
                    System.out.println("Enter product cost($):");//inputting product cost
                    cost = sc.nextLine();
                    worker.InputDB(id, name, type, cost);//call function of input
                    System.out.println("Successfully!");
                    System.out.println("Could I show?");
                    var = sc.nextLine();//choose variant
                    if (var.equals("yes"))//if yes, it shows updated data
                    {
                        System.out.println("Data about products which company 'BasJakt' created");
                        System.out.println();
                        worker.OutputDB();//call function of output
                    }
                    else if (var.equals("no")) //if no, it shows just 'ok!'
                    {
                        System.out.println("Ok!");
                    }
                    else {//if otherwise, it shows 'Error command!'
                        System.out.println("Error command!");
                    }
                }
                else if (comand.equals("update") || comand.equals("2"))//command of update
                {
                    System.out.println("Enter product id:");//inputting id
                    id = sc.nextLine();
                    System.out.println("Enter product name:");//inputting product name
                    name = sc.nextLine();
                    System.out.println("Enter product type:");//inputting product type
                    type = sc.nextLine();
                    System.out.println("Enter product cost($):");//inputting product cost
                    cost = sc.nextLine();
                    worker.UpdateDB(id, name, type, cost);//call function of update
                    System.out.println("Successfully!");
                    System.out.println("Could I show?");
                    var = sc.nextLine();//choose variant
                    if (var.equals("yes"))//if yes, it shows updated data
                    {
                        System.out.println("Data about products which company 'BasJakt' created");
                        System.out.println();
                        worker.OutputDB();//call function of output in Employee
                    }
                    else if (var.equals("no"))//if no, it shows just 'ok!'
                    {
                        System.out.println("Ok!");
                    }
                    else {//if otherwise,it shows 'Error!'
                        System.out.println("Error!");
                    }
                }
                else if (comand.equals("delete") || comand.equals("3"))//command of delete via id
                {
                    System.out.println("Enter id:");//inputting id
                    id = sc.nextLine();
                    worker.DeleteDB(id);//call function of delete in Employee
                    System.out.println("Successfully!");
                    System.out.println("Could I show?");
                    var = sc.nextLine();//choose variant
                    if (var.equals("yes"))//if yes, it shows updated data
                    {
                        System.out.println("Data about products which company 'BasJakt' created");
                        System.out.println();
                        worker.OutputDB();//call fucntion of output
                    }
                    else if (var.equals("no"))//if no, it shows just 'ok!'
                    {
                        System.out.println("Ok!");
                    }
                    else {//if otherwise, it shows 'Error!'
                        System.out.println("Error!");
                    }
                }
                else if (comand.equals("show") || comand.equals("4")) //command of show
                {
                    System.out.println("Data about products which company 'BasJakt' created");
                    System.out.println();
                    worker.OutputDB();//call function of output
                }
                else { //if other command,it show 'Error command!'
                    System.out.println("Error command!");
                }
                System.out.println("-------------------------------------------------------------------------------");//horizontal line
                System.out.println("If you have not finished please press 'start', else 'stop'!");
                comp = sc.nextLine();//choose continue or finish
            }
        }
        else {//if password is invalid, it shows 'Invalid password!'
            System.out.println("Invalid password!");
        }
    }
}