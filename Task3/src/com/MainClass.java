package com;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Library library = new Library();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== LIBRARY MANAGEMENT ===");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Add User");
            System.out.println("4. View Users");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
            case 1:
                System.out.print("Enter Book ID: ");
                int bId = sc.nextInt(); sc.nextLine();
                System.out.print("Enter Title: ");
                String title = sc.nextLine();
                System.out.print("Enter Author: ");
                String author = sc.nextLine();
                library.addBook(new Book(bId, title, author, false));
                break;
            case 2:
                library.viewBooks();
                break;

            case 3:
                System.out.print("Enter User ID: ");
                int uId = sc.nextInt(); sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                library.addUser(new User(uId, name));
                break;
            case 4:
                library.viewUsers();
                break;

            case 5:
                System.out.print("Enter Book ID to issue: ");
                int ibId = sc.nextInt();
                System.out.print("Enter User ID: ");
                int iuId = sc.nextInt();
                library.issueBook(ibId, iuId);
                break;

            case 6:
                System.out.print("Enter Book ID to return: ");
                int rbId = sc.nextInt();
                library.returnBook(rbId);
                break;

            case 7:
                System.out.println("Exiting... Goodbye!");
                break;

            default:
                System.out.println("Invalid choice! Try again.");
        }
    } while (choice != 7);

    sc.close();
	}

}
