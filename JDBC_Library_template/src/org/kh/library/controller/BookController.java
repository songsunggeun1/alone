package org.kh.library.controller;

import java.util.ArrayList;

import org.kh.library.common.JDBCTemplate;
import org.kh.library.model.service.BookServiceImpl;
import org.kh.library.model.vo.Book;
import org.kh.library.view.LibraryView;

public class BookController implements BookControllerI{
	
	BookServiceImpl bService = null;
	LibraryView lView = null;
	
	public BookController() {
		bService = new BookServiceImpl();
		lView = new LibraryView();
	}

	@Override
	public void selectAllBook() {
		
		ArrayList<Book> printBook = bService.selectAllBook();
		if(!printBook.isEmpty()) {
			lView.dispalyBookList(printBook);
		}else {
			lView.displayError("책 전체조회 실패");
		}
		
	}

	@Override
	public void selectBookOne(int bookNo) {
		
		Book book = bService.selectBookOne(bookNo);
		if(book != null) {
			lView.displayBook(book);
		}else {
			lView.displayError("책 조회 실패");
		}
		
		
	}

	@Override
	public void insertBook(Book book) {
		
		int result = bService.insertBook(book);
		if(result > 0){
			lView.displaySucess("책 입력 성공");
		}else {
			lView.displayError("책 입력 실패");
		}
		
	}

	@Override
	public void deleteBook(int bookNo) {

		int result = bService.deleteBook(bookNo);
		if(result > 0) {
			lView.displaySucess("책 삭제 성공");
		}else {
			lView.displayError("책 삭제 실패");
		}
		
	}

}
