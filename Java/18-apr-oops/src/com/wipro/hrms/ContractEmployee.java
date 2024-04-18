package com.wipro.hrms;

import com.wipro.hrms.entity.Employee;

public class ContractEmployee extends Employee 
{
	public static void main(String []args)
	{
		Employee emp=new Employee();
		emp.id=1;			//public
//		emp.name="Raja";	//protected	can be accessed from subclass
//		emp.department="IT";//default	different package
//		emp.dateOfBirth=new Date();		//NOT accessible (private)
		ContractEmployee d=new ContractEmployee();
		d.name="Siva";	//protected
		d.id=222;
		
				
	}
}
