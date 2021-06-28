package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String studentName;
	private int gradeYear;
	private String courses;
	private int studentID;
	private int courseCost = 600;
	private int tuitionBalance;
	
	// TODO: Constructor prompt user to enter student's name and year
	
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student full name: ");
		this.studentName = in.nextLine();
		
		System.out.println("1 - Freshman\n2 - for Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		System.out.println(studentName + " " + gradeYear);
	}
	
	// Generate an ID
	
	// Enroll in courses
	
	// View balance
	
	// Pay tuition
	
	// Show status of the student
}

