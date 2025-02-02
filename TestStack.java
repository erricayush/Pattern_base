import java.util.*;
public class TestStack{
    public static void main(String args[]){
        int choice;
        Scanner scan=new Scanner(System.in);
        MyStack M=new MyStack();
        do
        {
            System.out.println("--------Stack Menu---------");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            System.out.println("----------------------------");
            System.out.println("Enter your Choice:");
        choice=scan.nextInt();
        switch(choice){
            case 1:M.Push();break;
            case 2:M.Pop();break;
            case 3:M.Display();break;
            case 4:break;
            default:System.out.println("Invalid Choice");
        }
        }while(choice!=4);
         
        }
}