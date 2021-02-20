package com.company;
public class Main
{
    public static void main(String[] args) {
		System.out.println("Welcome to the company 'BasJakt'");//Output 'Welcome to the company 'BasJakt''
		System.out.println("-------------------------------------------------------------------------------");//horizontal line
		System.out.println("Enter your password:");//inputting password
		Company company = new Company();//data type of Company
		company.app();//call function of app in class of Company
    }
}
