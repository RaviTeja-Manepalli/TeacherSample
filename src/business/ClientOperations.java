package business;

import java.util.HashSet;
import java.util.Scanner;

import Entity.Teacher;

public class ClientOperations {
	static Scanner sc = new Scanner(System.in);

	public HashSet<Teacher> addTeacher(HashSet<Teacher> teacher) {
		sc.nextLine();
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println("Enter subject");
		String subject = sc.nextLine();
		Teacher t = new Teacher(name, subject);
		teacher.add(t);
		return teacher;

	}

	public void display(HashSet<Teacher> teacher) {
		// TODO Auto-generated method stub
		for (Teacher t : teacher) {
			System.out.println(t.getName() + " " + t.getSubject());
		}

	}

	public int validInteger() {
		// TODO Auto-generated method stub
		int input = 0;
		boolean run = true;
		while (run == true) {
			try {
				input = sc.nextInt();
				run = false;
			} catch (Exception e) {
				System.out.println("Invalid Integer enter again");
				sc.next();
			}
		}

		return input;
	}

}
