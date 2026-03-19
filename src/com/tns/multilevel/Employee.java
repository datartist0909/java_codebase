package com.tns.multilevel;
import java.sql.*;
public class Employee extends Person
{
	private String deptName;
	private double baseSalary;
	public Employee()
	{
		
	}
	
	public Employee(String name, long conatctNo, Date dateOfBirth,String deptName,double baseSalary) 
	{
		super(name, conatctNo, dateOfBirth);
		
	}

	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	@Override
	public String toString() {
		return "Employee [deptName=" + deptName + ", baseSalary=" + baseSalary + ", getName()=" + getName()
				+ ", getConatctNo()=" + getConatctNo() + ", getDateOfBirth()=" + getDateOfBirth() + "]";
	}
	
	

}