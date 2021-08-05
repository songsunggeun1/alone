package org.kh.library.run;

import org.kh.library.view.LibraryView;

public class Run {
	public static void main(String [] args) {
		
		LibraryView lView = new LibraryView();
		
		while(true) {
			int choice = lView.mainMenu();
			switch(choice) {
			case 1:
				lView.bookMenu();
				break;
			case 2:
				lView.customerMenu();
				break;
			case 3:
				lView.libraryMenu();
				break;
			}
		}
		
	}
}
