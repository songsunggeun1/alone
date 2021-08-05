package org.kh.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import org.kh.library.controller.BookController;
import org.kh.library.controller.CustomerController;
import org.kh.library.controller.LibraryController;
import org.kh.library.model.service.CustomerServicel;
import org.kh.library.model.vo.Book;
import org.kh.library.model.vo.Customer;
import org.kh.library.model.vo.Library;

public class LibraryView implements LibraryViewI{
	
	

	@Override
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 메인메뉴 ======");
		System.out.println("1. 책관리");
		System.out.println("2. 회원관리");
		System.out.println("3. 대여관리");
		System.out.print("입력 : ");
		return sc.nextInt();
	}

	@Override
	public void bookMenu() {
		Scanner sc = new Scanner(System.in);
		BookController bCtrl = new BookController();
		종료 :
		while(true) {
			System.out.println("====== 책 관리 서브메뉴 ======");
			System.out.println("1. 전체 책 조회");
			System.out.println("2. 책 코드로 조회");
			System.out.println("3. 책 추가하기");
			System.out.println("4. 책 삭제하기");
			System.out.println("5. 메인 메뉴로 이동");
			System.out.print("번호 입력 : ");
			int input = sc.nextInt();
			switch(input) {
			case 1:
				bCtrl.selectAllBook();
				break;
			case 2:
				int bookNum = inputBookNo();
				bCtrl.selectBookOne(bookNum);
				break;
			case 3:
				Book book = inputBook();
				bCtrl.insertBook(book);
				break;
			case 4:
				int deleteBook = inputBookNo();
				bCtrl.deleteBook(deleteBook);
				break;
			case 5:
				break 종료;
			default :
				System.out.println("번호를 잘못 입력하셨습니다.");
				break;
			}
		}
	}

	@Override
	public void customerMenu() {
		CustomerController CustomerCtrl = new CustomerController();
		CustomerServicel cService = new CustomerServicel();
		Scanner sc = new Scanner(System.in);
		종료 :
		while(true) {
			System.out.println("=== 회원관리 서브메뉴 ===");
			System.out.println("1. 회원 전체 조회");
			System.out.println("2. 회원 이름으로 조회");
			System.out.println("3. 회원 아이디로 조회");
			System.out.println("4. 회원 가입");
			System.out.println("5. 회원 정보 수정");
			System.out.println("6. 회원 탈퇴");
			System.out.println("7. 메인메뉴로 이동");
			System.out.print("번호 입력 : ");
			int input = sc.nextInt();
			switch(input) {
			case 1:
				CustomerCtrl.selectAllCustomer();
				break;
			case 2:
				String searchName = inputCName();
				CustomerCtrl.selectNameSearch(searchName);
				break;
			case 3:
				String searchId = inputCId();
				CustomerCtrl.selectIdSearch(searchId);
				break;
			case 4:
				Customer inputCustomer = inputCustomer();
				CustomerCtrl.insertCustomer(inputCustomer);
				break;
			case 5:
				String updateId = inputCId(); // update 매개변수가 String이 아니라 Customer 객체?? interface 매개변수를 임의로 바꿨다
				CustomerCtrl.updateCustomer(updateId);
				break;
			case 6:
				String deleteId = inputCId();
				CustomerCtrl.deleteCustomer(deleteId);;
				break;
			case 7:
				break 종료;
				default:
					System.out.println("번호를 잘못 입력하셨습니다.");
					break;
			}
		}
	}

	@Override
	public void libraryMenu() {
		
		LibraryController lCtrl = new LibraryController();
		Scanner sc = new Scanner(System.in);
		
		종료:
		while(true) {
			System.out.println("====== 대여관리 서브메뉴 ======");
			System.out.println("1. 대여 관리 전체 조회");
			System.out.println("2. 회원 아이디로 조회");
			System.out.println("3. 책 이름으로 대여 조회");
			System.out.println("4. 대여정보 추가");
			System.out.println("5. 메인 메뉴로 이동");
			System.out.print("번호 입력 : ");
			int input = sc.nextInt();
			switch(input) {
			case 1:
				lCtrl.selectAll();
				break;
			case 2:
				String inputId = inputUserId();
				lCtrl.selectOne(inputId);
				break;
			case 3:
				String bookName = inputBookName();
				lCtrl.selectOneByName(bookName);
				break;
			case 4:
				Library inputLibrary = insertLibrary();
				lCtrl.insertLibrary(inputLibrary);
				break;
			case 5:
				break 종료;
			}
		}
	}

	@Override
	public void displayLibraryList(ArrayList<Library> list) {
		
		for(Library l : list) {
			System.out.println("====== 대여 관리 전체 조회 ======");
			System.out.println("대여번호 : " + l.getLeaseNo());
			System.out.println("책 번호 : " + l.getBookNo());
			System.out.println("회원 아이디 : " + l.getUserId());
			System.out.println("대여일 : " + l.getLeaseDate());
			System.out.println("반납일 : " + l.getReturnDate());
			System.out.println("===========================");
		}
		
	}

	@Override
	public void displayLibraryList(Library library) {
		
		System.out.println("====== 회원이름으로 대여 조회 ======");
		System.out.println("대여 번호 : " + library.getLeaseNo());
		System.out.println("회원 아이디 : " + library.getUserId());
		System.out.println("회원 이름 : " + library.getUserName());
		System.out.println("책 이름 : " + library.getBookName());
		System.out.println("==============================");
		
	}

	@Override
	public void displaySucess(String string) { // 성공 메세지
		System.out.println("서비스 요청 처리 성공 : " + string);
		
	}
	
	@Override
	public void displayError(String message) { // 성공 메세지
		System.out.println("서비스 요청 처리 실패 : " + message);
	}

	@Override
	public String inputUserId() { // 회원 아이디 조회
		System.out.print("회원 아이디를 입력해주세요 : ");
		return new Scanner(System.in).next();
	}

	@Override
	public String inputBookName() { // 책 이름 조회
		System.out.print("책 이름을 입력해주세요 : ");
		return new Scanner(System.in).nextLine();
	}
//		Library library = new Library();

	@Override
	public Library insertLibrary() { 
		Scanner sc = new Scanner(System.in);
		System.out.print("회원 아이디를 입력해주세요 : ");
		String customerId = sc.next();
		sc.nextLine();
		System.out.print("책 이름을 입력해주세요 : ");
		String bookName = sc.nextLine();
		System.out.println("1");
		Library library = new Library(customerId, bookName);
		
		return library;
	}

	@Override
	public void displayMessage(String message) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void dispalyBookList(ArrayList<Book> list) {
		for(Book b : list) {
			System.out.println("====== 책 전체 조회 ======");
			System.out.println("책 번호 : " + b.getBookNo());
			System.out.println("책 제목 : " + b.getBookName());
			System.out.println("책 글쓴이 : " + b.getBookWriter());
			System.out.println("책 가격 : " + b.getBookPrice());
			System.out.println("출판사 : " + b.getPublisher());
			System.out.println("장르 : " + b.getGenre());
			System.out.println("======================");
		}
		
	}



	@Override
	public void dispalyCustomerList(ArrayList<Customer> list) { // 회원 전체 출력
		
		for(Customer c : list) {
			System.out.println("====== 회원 전체 조회 ======");
			System.out.println("고객번호 : " + c.getUserNo());
			System.out.println("고객아이디 : " + c.getUserId());
			System.out.println("고객이름 : " + c.getUserName());
			System.out.println("고객주소 : " + c.getAddr());
			System.out.println("고객성별 : " + c.getGender());
			System.out.println("가입일 : " + c.getEnrollDate());
			System.out.println("========================");
		}
		
	}

	@Override
	public void diplayCutomerOne(Customer customer) { // 회원 조회
		System.out.println("====== 회원 조회 ======");
		System.out.println("고객번호 : " + customer.getUserNo());
		System.out.println("고객아이디 : " + customer.getUserId());
		System.out.println("고객이름 : " + customer.getUserName());
		System.out.println("고객주소 : " + customer.getAddr());
		System.out.println("고객성별 : " + customer.getGender());
		System.out.println("가입일 : " + customer.getEnrollDate());
		System.out.println("====================");
	}

	@Override
	public void displayBook(Book b) {
		System.out.println("====== 번호로 책 조회 ======");
		System.out.println("책 번호 : " + b.getBookNo());
		System.out.println("책 제목 : " + b.getBookName());
		System.out.println("책 글쓴이 : " + b.getBookWriter());
		System.out.println("책 가격 : " + b.getBookPrice());
		System.out.println("출판사 : " + b.getPublisher());
		System.out.println("장르 : " + b.getGenre());
		System.out.println("======================");
	}

	@Override
	public String inputCName() {
		System.out.print("이름을 입력해 주세요 : ");
		return new Scanner(System.in).next();
	}

	@Override
	public String inputCId() {
		System.out.print("아이디를 입력해주세요 : ");
		return new Scanner(System.in).next();
	}

	@Override
	public Customer inputCustomer() { // 회원가입
		Scanner sc = new Scanner(System.in);
		System.out.print("번호를 입력해주세요 : ");
		int userNo = sc.nextInt();
		System.out.print("아이디를 입력해주세요 : ");
		String userId = sc.next();
		System.out.print("이름을 입력해주세요 : ");
		String userName = sc.next();
		System.out.print("나이를 입력해주세요 : ");
		int userAge = sc.nextInt();
		sc.nextLine();
		System.out.print("주소를 입력해주세요 : ");
		String addr = sc.nextLine();
		System.out.print("성별을 입력해주세요 : ");
		String gender = sc.next();
		Customer customer = new Customer(userNo, userId, userName, userAge, addr, gender);
		
		return customer;
	}

	@Override
	public Customer modifyCustomer(String cId) {
		Scanner sc = new Scanner(System.in);
		System.out.print("번호를 입력해주세요 : ");
		int userNo = sc.nextInt();
		sc.nextLine();
		System.out.print("주소를 입력해주세요 : ");
		String addr = sc.nextLine();
		
		Customer customer = new Customer(userNo, addr, cId);
		return customer;
	}

	@Override
	public int inputBookNo() {
		System.out.print("책 번호를 입력해주세요 : ");
		return new Scanner(System.in).nextInt();
	}

	@Override
	public Book inputBook() {
		Scanner sc = new Scanner(System.in);
		System.out.print("책 이름을 입력해주세요 : ");
		String bookName = sc.nextLine();
		System.out.print("책 글쓴이를 입력해주세요 : ");
		String bookWriter = sc.nextLine();
		System.out.print("책 가격을 입력해주세요 : ");
		int bookPrice = sc.nextInt();
		sc.nextLine();
		System.out.print("책 출판사를 입력해주세요 : ");
		String publisher = sc.nextLine();
		System.out.print("책 장르를 입력해주세요 : ");
		String genre = sc.nextLine();
		Book book = new Book(bookName, bookWriter, bookPrice, publisher, genre);
		return book;
	}

}
