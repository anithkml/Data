package org.college;

public class Colleg extends Student {
	private void collegeName(){
		System.out.println("clg name is DCE");
	}
	private void collegeCode() {
		System.out.println("clg code is 4207");
	}
	private void collegeRank() {
		System.out.println("clg rank is 2");
	}
	public static void main(String[] args) {
		Colleg c=new Colleg();
		c.collegName();
		c.collegRank();
		c.collegCode();
		c.deptName();
		c.HostelName();
	    c.studentName();
		c.stuId();
	
		c.studentDept();}
	

	
	
	
	}

	
