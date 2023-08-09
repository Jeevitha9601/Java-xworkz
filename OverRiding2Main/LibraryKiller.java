package OverRiding2Main;

import java.awt.print.Book;

import OverRiding2.Books;
import OverRiding2.Library;

public class LibraryKiller {

	public static void main(String[] args) {
		System.out.println("invoking main in Libraryrunner");

		Library library = new Library();
		library.displyaInfo();
		System.out.println("*********Child ref**********");
		Library book = new Books();
		book.displyaInfo();

	}
	}

