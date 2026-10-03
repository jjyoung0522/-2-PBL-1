package myClass;

/**
 * 이용자 객체를 생성하고 생성된 이용자 객체의 여러가지 기능을 다루는 클래스
 *
 * @author (2025320031 김단이 , 2023320040 이기웅, 2023320006 정준영)
 * @version (2026.10.03)
 */
public class User extends DB_Element
{
    private String name;
    private Integer stID;

    /**
     * User클래스의 객체 생성자
     *
     * @param  stID : 이용자의 고유 ID 
     * @param  name : 이용자의 이름
     */
    public User(int stID, String name)
    {
        this.name = name;
        this.stID = stID;
    }

    /**
     * 이용자의 고유ID를 String으로 변환 후 반환하는 메소드
     *
     * @return  이용자의 고유ID
     */
    public String getID()
    {
        return String.valueOf(stID);
    }

    /**
     * 이용자에 대한 정보를 반환하는 메소드
     *
     * @return  이용자 고유ID, 이용자 이름을 형식에 맞게 출력
     */
    public String toString()
    {
        return "[" + stID + "] " + name;
    }
}