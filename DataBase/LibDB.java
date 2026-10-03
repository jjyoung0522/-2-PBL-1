package DataBase;

import myClass.*;
import java.util.ArrayList;

/**
 * LibDB 클래스의 설명을 작성하세요.
 *
 * @author (2025320031 김단이 , 2023320040 이기웅, 2023320006 정준영)
 * @version (2026.10.03)
 */
public class LibDB<T>
{
    private ArrayList<T> db;

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public LibDB()
    {
        this.db = new ArrayList<>();
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public void addElement(T element)
    {
        db.add(element);
    }

    /**
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
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
     * 메소드 예제 - 사용자에 맞게 주석을 바꾸십시오.
     *
     * @param  y  메소드의 샘플 파라미터
     * @return    x 와 y의 합
     */
    public void printAllElements()
    {
        for(int i = 0 ; db.size() > i ; i++){
            System.out.println(db.get(i));
        }
    }

}