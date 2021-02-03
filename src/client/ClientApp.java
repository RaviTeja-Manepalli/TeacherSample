package client;

import java.util.HashSet;
import java.util.Scanner;

import business.ClientOperations;

import Entity.Teacher;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ClientOperations operate = new ClientOperations();
		HashSet<Teacher> teacher = new HashSet<Teacher>();
		int choice = 0;
		do {
			System.out.println("1. Add Teacher details");
			System.out.println("2. Display details");
			System.out.println("3. Exit");
			System.out.println("Enter ur choice");
			choice = operate.validInteger();
			switch (choice) {
			case 1:
				teacher = operate.addTeacher(teacher);
				break;
			case 2:
				operate.display(teacher);
				break;
			case 3:
				System.out.println("Thank you");
				break;
			default:
				System.out.println("Invalid input");
			}

		} while (choice != 3);
		sc.close();

	}

}
