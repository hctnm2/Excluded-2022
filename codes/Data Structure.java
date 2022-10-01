
import java.util.Scanner;
class st_back
{
    Scanner sn=new Scanner(System.in);
    int top=-1,len;
    int arr[];
    public st_back(int size)
    {
        arr=new int[size];
        len=size;
    }
    void push()
    {
        System.out.println("Enter the element to be pushed");
        int value=sn.nextInt();
        if(top==len-1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            top++;
            arr[top]=value;
            System.out.println("Data pushed successfully");
        }
    }
    void pop(){
        if(top==-1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            top--;
            System.out.println("Value deleted successfully");
        }

    }
    int display()
    {
        if(top==-1) System.out.println("Stack is Empty");
        else
        {
            for(int i=0;i<=top;i++){
                System.out.print(arr[i]+"\t");
            }
        }
        System.out.println();
        return 0;
    }

}

public class STACK {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter the sixe for array");
        int size= sn.nextInt();
        st_back stb=new st_back(size);
       int k =1;
       while(k==1)
       {
           System.out.println("Press 1 for push");
           System.out.println("Press 2 for pop");
           System.out.println("Press 3 for display");
           int choice=sn.nextInt();
           switch (choice)
           {
               case 1:
                   stb.push();
                   break;
               case 2:
                   stb.pop();
                   break;
               case 3:
                   stb.display();
                   break;
               default:
                   System.out.println("Please enter a valid value");

           }
           System.out.println("Press 1 to continue or 0 to exit");
           k= sn.nextInt();

       }

    }
}
