import java.util.*;

public class MyStack {

    
    private int top=-1;
    private int MAXSIZE=10;
    private int stack[]=new int[MAXSIZE];
    Scanner scan=new Scanner(System.in);

   public void Push(){
       if(top==MAXSIZE-1){
        System.out.println("Stack is overflow");

       }
       else{
        System.out.println("Enter an element for push");
        int  n=scan.nextInt();
        top++;
        stack[top]= n;
       }
    }
    void Pop(){
        if(top==-1)
        System.out.println("Stack is Empty");
        else{
            int n=stack[top];
            top--;
            System.out.println("Poped element is:"+n);
        }
    }
    void Display(){
       if(top== -1)
           System.out.println("Stack is empty");
        else{
            System.out.println("Elements of Stack");
            for(int i=top;i>=0;i--)
            {
                System.out.println(stack[i]);
            }
        }
    }

}
