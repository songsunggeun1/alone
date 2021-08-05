package org.kh.library.controller;

import java.util.ArrayList;

import org.kh.library.model.service.LibraryServicel;
import org.kh.library.model.vo.Library;
import org.kh.library.view.LibraryView;

public class LibraryController implements LibraryControllerI{

	LibraryServicel lService = null;
	LibraryView lView = null;
	
	public LibraryController () {
		
		lService = new LibraryServicel();
		lView = new LibraryView();
		
	}
	
	
	@Override
	public ArrayList<Library> selectAll() {
		
		ArrayList<Library> lList = lService.selectAll();
		if(!lList.isEmpty()) {
			lView.displayLibraryList(lList);
		}else {
			lView.displayError("대여관리 조회 실패");
		}
		
		return lList;
	}

	@Override
	public void selectOne(String userId) {
		
		Library library = lService.selectOne(userId);
		if(library != null) {
			lView.displayLibraryList(library);
		}else {
			lView.displayError("아이디로 조회 실패");
		}
		
	}

	@Override
	public void selectOneByName(String bookName) {
		
		Library library = lService.selectOneByName(bookName);
		if(library != null) {
			lView.displayLibraryList(library);
		}else {
			lView.displayError("책 이름으로 조회 실패");
		}
		
	}
		


	@Override
	public void insertLibrary(Library library) {
		
		int result = lService.insertLibrary(library);
		if(result > 0) {
			lView.displaySucess("대여 정보 추가 완료");
		}else {
			lView.displayError("대여 정보 추가 실패");
		}
		
		
	}

}
