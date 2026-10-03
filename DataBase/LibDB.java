package DataBase;

import myClass.*;
import java.util.ArrayList;

/**
 * 제네릭한 DB객체를 생성하고 생성된 DB의 여러기능을 다루는 제네릭클래스
 *
 * @author (2025320031 김단이 , 2023320040 이기웅, 2023320006 정준영)
 * @version (2026.10.03)
 */
public class LibDB<T>
{
    private ArrayList<T> db;

    /**
     * LibDB의 객체 생성자
     *
     */
    public LibDB()
    {
        this.db = new ArrayList<>();
    }

    /**
     * 객체를 DB에 추가하는 메소드
     *
     * @param  DB에 추가할 객체
     */
    public void addElement(T element)
    {
        db.add(element);
    }

    /**
     * 고유ID가 주어졌을 때 해당 객체를 반환하는 제네릭 메소드
     *
     * @param  findID : 찾을 객체의 고유ID
     * @return 고유ID에 해당하는 객체
     */
    public T findElement(String findID)
    {
        for(int i = 0 ; db.size() > i ; i++){
            DB_Element element = (DB_Element) db.get(i);
            if(element.getID().equals(findID)){
                return db.get(i);
            }
        }
        return null;
    }

    /**
     * DB에 들어있는 모든 객체를 출력하는 메소드
     *
     */
    public void printAllElements()
    {
        for(int i = 0 ; db.size() > i ; i++){
            System.out.println(db.get(i));
        }
    }

}