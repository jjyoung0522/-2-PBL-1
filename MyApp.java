import DataBase.*;
import myClass.*;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * MyApp 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class MyApp
{
    public static void main(String[] args)
    {
        LibDB<User> userDB = new LibDB<>();
        LibDB<Book> bookDB = new LibDB<>();
        HashMap<User,Book> loanDB = new HashMap<>();
        
        User user1 = new User(2025320001,"Kim" );
        User user2 = new User(2025320002,"Lee" );
        User user3 = new User(2025320003,"Park");

        userDB.addElement(user1);
        userDB.addElement(user2);
        userDB.addElement(user3);
        
        System.out.println("----- 이용자 목록 출력 -----");
        printDB(userDB);
        
        Book book1 = new Book("홍길동", "B02", "ABC", "Java Programming", 2000);
        Book book2 = new Book("profsHwang", "B02", "SMU", "Software Analysis and Design", 2023);
        Book book3 = new Book("황기태", "B03", "생능출판", "명품 자바프로그래밍", 2025);
        Book book4 = new Book("profsHwang", "B04", "SMU", "소프트웨어테스트", 2024);

        bookDB.addElement(book1);
        bookDB.addElement(book2);
        bookDB.addElement(book3);
        bookDB.addElement(book4);
    
        System.out.println("----- 책 목록 출력 -----");
        printDB(bookDB);

        loanDB.put(userDB.findElement("2025320001"),bookDB.findElement("B02"));
        loanDB.put(userDB.findElement("2025320002"),bookDB.findElement("B03"));
        loanDB.put(userDB.findElement("2025320003"),bookDB.findElement("B04"));
        
        System.out.println("----- 대출 현황 -----");
        printLoanList(loanDB);
        System.out.println("--------------------");

    }
    
    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public static <T extends DB_Element> void printDB(LibDB db)
    {
        db.printAllElements();
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public static void printLoanList(HashMap<User,Book> loanDB)
    {
        for (User user : loanDB.keySet()){
            System.out.println(user + "===>" + loanDB.get(user));
        }
    }
}