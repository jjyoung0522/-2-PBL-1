import DataBase.*;
import myClass.*;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * 이용자와 책을 DB에 저장하고 이용자가 책을 대출할 때 해당 기록을 DB에 저장하는 클래스
 *
 * @author (2025320031 김단이 , 2023320040 이기웅, 2023320006 정준영)
 * @version (2026.10.03)
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

        Book book1 = new Book("홍길동", "B01", "ABC", "Java Programming", 2000);
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
     * DB에 있는 정보들 출력하는 제네릭 메소드
     *
     * @param  db : 출력할 DB
     */
    public static <T extends DB_Element> void printDB(LibDB db)
    {
        db.printAllElements();
    }

    /**
     * 대출 목록을 출력하는 메소드
     *
     * @param loanDB : 대출 목록이 저장되어 있는 DB
     */
    public static void printLoanList(HashMap<User,Book> loanDB)
    {
        for (User user : loanDB.keySet()){
            System.out.println(user + "===>" + loanDB.get(user));
        }
    }
}