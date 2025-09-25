package com;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Book> books = new ArrayList<>();
	private List<User> users = new ArrayList<>();

	public void addBook(Book book) { books.add(book); }
	public void addUser(User user) { users.add(user); }

	public void viewBooks() {
		if (books.isEmpty()) System.out.println("No books in library.");
		else books.forEach(System.out::println);
	}

	public void viewUsers() {
		if (users.isEmpty()) System.out.println("No users registered.");
		else users.forEach(System.out::println);
	}
	public void issueBook(int bookId, int userId) {
		Book book = findBook(bookId);
		User user = findUser(userId);

		if (book == null || user == null) {
			System.out.println("Invalid book or user ID!");
			return;
		}
		if (book.isIssued()) {
			System.out.println("Book is already issued.");
		} else {
			book.issue();
			System.out.println("Book '" + book.getTitle() + "' issued to " + user.getName());
		}
	}

	public void returnBook(int bookId) {
		Book book = findBook(bookId);
		if (book == null) {
			System.out.println("Book not found!");
			return;
		}
		if (!book.isIssued()) {
			System.out.println("This book was not issued.");
		} else {
			book.returnBook();
			System.out.println("Book '" + book.getTitle() + "' returned successfully.");
		}
	}

	private Book findBook(int id) {
		return books.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
	}

	private User findUser(int id) {
		return users.stream().filter(u -> u.getUserId() == id).findFirst().orElse(null);
	}
}
