package com.cg.eis.exception;
import java.util.Scanner;
public class Emp {
private int eid;
private int sal;
public Emp(int eid, int sal) {
	super();
	this.eid = eid;
	this.sal = sal;
}
public Emp(){}
  public void Verify() throws EmployeeException{
	  if(sal<3000)
	  {
		  throw new EmployeeException("salary be greater then 3000");
	  }
	  else System.out.println("successfull");
  }
  public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter salary");
		int sal=sc.nextInt();
		Emp c2=new Emp(id,sal);
		try {
			
			c2.Verify();
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}




