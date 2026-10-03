package myClass;

/**
 * 책 객체를 생성하고 생성된 책 객체의 여러가지 기능을 다루는 클래스
 *
 * @author (2025320031 김단이 , 2023320040 이기웅, 2023320006 정준영)
 * @version (2026.10.03)
 */
public class Book extends DB_Element
{
    private String author;
    private String bookID;
    private String publisher;
    private String title;
    private int year;

    /**
     * Book클래스의 객체 생성자
     *
     * @param  author : 책의 저자
     * @param  bookID : 책의 고유ID
     * @param  publisher : 책의 출판사
     * @param  title : 책의 제목
     * @param  year : 책의 출판년도
     */
    public Book(String author, String bookID, String publisher, String title, int year)
    {
        this.author = author;
        this.bookID = bookID;
        this.publisher = publisher;
        this.title = title;
        this.year = year;
    }

    /**
     * 책의 고유ID를 반환하는 메소드
     *
     * @return 책의 고유ID
     */
    public String getID()
    {
        return bookID;
    }

    /**
     * 책에 대한 정보를 반환하는 메소드
     *
     * @return  책의 고유ID, 책 제목, 책의 저자, 책의 출판사, 책의 출판년도를 형식에 맞게 출력
     */
    public String toString()
    {
        return "(" + bookID + ") " + title + ", " + author + ", " + publisher + ", " + year;
    }
}