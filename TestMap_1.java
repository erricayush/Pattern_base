import java.util.*;
public class TestMap_1 {
    public static void main(String[] args){
        // Map m=mew HashMap();
        // m.put(1,"amit" );
        // m.put(2,"ram" );
        // m.put(3,"amit" );
        // m.put(7.3,"amit" );
        // m.put("four",4.4 );
        // m.put(true,false );
        // System.out.println(m);

        Map<Integer,String> m=new HashMap<Integer,String>();
        m.put(1,"limica" );
        m.put(2,"lemon water" );
        m.put(3,"ocean water" );
        m.put(41,"real-fruit" );
        m.put(15,"water" );
       
        System.out.println(m);
        // Map<Integer,String>m1=new HashMap<Integer,String>();
        // m1.putAll(m);
        // System.out.println(m1);

        // replace method----

         m.replace(3, "sjfsfsd");
         System.out.println(m);

         // remove method------

        // m.remove(3);
        // System.out.println(m);
        // m.remove(41,"real-fruit");
        // System.out.println(m);

        //contains------
       if(m.containsValue("lemon water")) 
       {
        System.out.println("searching success");
       }
       else{
        System.out.println("searching is not success ");
       }
    }
}
 