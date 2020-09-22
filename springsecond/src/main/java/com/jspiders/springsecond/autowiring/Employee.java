package com.jspiders.springsecond.autowiring;

public class Employee {

	private int empno;
	private String ename;
	private Company company;

	public Employee(int empno, String ename, Company company) {
		this.empno = empno;
		this.ename = ename;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", company=" + company + "]";
	}

}
