package Oops;

import java.util.Scanner;


public class Main extends Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		Model_s var=new Model_s();
		
		System.out.println("Enter Java Marks");
		var.setJava(sc.nextInt());
		
		System.out.println("Enter JavaScript Marks");
		var.setJs(sc.nextInt());
		
		System.out.println("Enter DataBase Marks");
		var.setDb(sc.nextInt());
		
		Main mr=new Main();
		mr.Java(var.getJava());
		mr.JavaScript(var.getJs());
		mr.DataBase(var.getDb());
	}

}
