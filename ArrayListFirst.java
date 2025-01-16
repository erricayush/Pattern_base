import java.util.*;
class ArrayListFirst
{
    public static void main(String args[])
    {
        // non generic collection 

        // ArrayList mylist=new ArrayList();
        // mylist.add("ayush");
        // mylist.add(23);
        // mylist.add(true);
        // mylist.add(44.34);
        // mylist.add('a');
        // System.out.println(mylist);
         
        //  non generic collection

         ArrayList<String> A=new ArrayList<String>(5);
         System.out.println(A.size());
         A.add("ayush");
         A.add("sulabh");
         A.add("shalini");
         A.add("rishabh");
         A.add("ashu");
         A.add("ayush");
         A.add("bidi");
         System.out.println(A.add("ashu"));
         System.out.println(A);
         System.out.println(A.size());

         System.out.println("-----------------------------------------------");
         System.out.println(A.remove("ayush")); //ayush will remove here  
         System.out.println(A);
         System.out.println(A.remove(3));  //ashu will remove here
         System.out.println(A);


    }
}