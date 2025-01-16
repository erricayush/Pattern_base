import java.util.*;
class VectorMain
{
    public static void main(String args[])
    {
        Vector<Integer> V=new Vector<Integer>();
        // System.out.println(V.capacity());
        V.add(10);
        V.add(20);
        V.add(30);
        V.add(40);
        V.add(50);
        V.add(60);
        V.add(2,150); //list class method
        V.addElement(300); //vecotr class method
        System.out.println(V);

    }
}