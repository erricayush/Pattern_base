import java.util.*;
class TestTreeSet{
    public static void main(String[] args){
        TreeSet T =new TreeSet() ;
        T.add("indore");
        T.add("data");
        T.add("flair");
        // T.add(32);  //it will generate class caste exception
         System.out.println((T));

        // USING STRING--------

        String s1="hello";
        String s2="ayush";
        String s3="kumar";
        T.add(s1);
        T.add(s2);
        T.add(s3);
        System.out.println(T);

        // USING STRING BUFFER----(this will generate class caste exception)

        // StringBuffer sb1=new StringBuffer("hello");
        // StringBuffer sb2=new StringBuffer("erric");
        // StringBuffer sb3=new StringBuffer("ayush");

        // T.add(sb1);
        // T.add(sb2);
        // T.add(sb3);
        // System.out.println(T);
    }
} 