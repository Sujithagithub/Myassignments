package org.student;

import org.college.College;

public class Student extends College {
	
	public void studentName()
	{
		System.out.println("Student name is S.Sujitha");
	}

	
	public void studentDept()
	{
		System.out.println("Student Dept is CSE");
	}
	
	public void studentId()
	{
		System.out.println("Student Id is CSE012");
	}
	
	public static void main(String[] args) {
Student det=new Student();
det.studentName();
det.studentId();
det.studentDept();
det.collegeName();
det.collegeRank();
det.collegeCode();
det.deptName();
}

}
/* Package   :org.student
Class        :Student
Methods   :studentName(),studentDept(),studentId()

Description:
create above 3 class and call all your class methods into the Student using multilevel inheritance.
*/
