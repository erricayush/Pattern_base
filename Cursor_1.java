import java.util.*;
public class Cursor_1 {
    public static void main(String[] args){
        ArrayList<Integer> per=new ArrayList<Integer>();
        per.add(76);
        per.add(105);
        per.add(96);
        per.add(-7);
        per.add(56);
        per.add(89);
        per.add(100);
        per.add(109);
        Iterator I=per.iterator();
        while(I.hasNext()){
            int p=(int)I.next();
            if(p<0 || p>100){
                I.remove();
            }
            else{
                System.out.println(p);
            }
        }
    }
    
}
