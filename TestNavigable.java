import java.util.*;
class TestNavigable {
    public static void main(String[] args) {
        
           TreeSet<Integer> T=new TreeSet<Integer>(); 
           T.add(100);
           T.add(400);
           T.add(300);
           T.add(500);
           T.add(200);
           T.add(600);
           T.add(800);
           T.add(900);
           T.add(700);
           System.out.println(T);
           System.out.println(T.first());
           System.out.println(T.last());
        System.out.println(T.headSet(600)); //headSet na ki headFirst
        System.out.println(T.lower(500));
        System.out.println(T.higher(500));
        System.out.println(T.descendingSet());
        System.out.println(T.ceiling(500));
    }
}
