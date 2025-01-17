// package Collection.ArrayList;
import java.util.*;
 class Cursor_2 {
    public static void main(String[] args){
        
        Vector V=new Vector();
        System.out.println("------ Enumeration starts form here------");
        V.add("dataflair");
        V.add(123);
        V.add(45.12);
        V.add(true);
        System.out.println();
        V.add("dataflair123");
        V.add(943);
        V.add(233.12);
        V.add(true);
        System.out.println();
        V.add("dataflair12345");
        V.add(9093);
        V.add(45.099);
        V.add(false);
        Enumeration e=V.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        //ITERATOR-----
        System.out.println("------Iterator starts form here------");
        ArrayList<Integer> per=new ArrayList<Integer>();
        per.add(93);
        per.add(123);
        per.add(-123);
        per.add(123);
        per.add(90);
        per.add(70);
        per.add(99);
        per.add(89);
        per.add(-234);
        Iterator I=per.iterator();
        while(I.hasNext())
        {
            int p=(int)I.next();
            if(p<0 || p>100)
            {
                I.remove();
            }
            else
            {
                System.out.println(p);
            }
        }

        //LIST ITERATOR-------
        System.out.println("------ListIterator starts form here------");
        ArrayList city=new ArrayList<>();
        city.add("indore") ;
        city.add("Bhopal");
        city.add("Delhi");
        city.add("Raipur");
        city.add("Bombay");
        city.add("rajsthan");
        city.add("manali");
        city.add("Lucknow");
        city.add("Barabanki");

        ListIterator lt=city.listIterator();
        // while (lt.hasPrevious()) {
        //     System.out.println(lt.previous());
        // }
        while (lt.hasNext()) {
            String s=lt.next().toString();
            if(s.equals("Bombay"))
            {
                lt.set("Mumbai");
            }
            else
            {
                if(s.equals("Bhopal"))
                {
                    lt.remove();
                }
              
            }
        }
        ListIterator lt1=city.listIterator();
        while (lt1.hasNext()) {
            System.out.println(lt1.next());
        }
    }
}
