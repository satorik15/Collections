import java.util.Stack;
import java.util.Scanner;
public class Task_1
{
    public static void main(String[] args)
    {
        Stack stack = new Stack();
        int[] myArray = new int[10];
        Scanner input= new Scanner(System.in);
        for (int i=0;i<10;i++)
        {
            int value=input.nextInt();
            stack.push(value);
        }
        for (int i=0;i<10;i++)
        {
            myArray[i]= (int) stack.pop();
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(myArray[i]);
        }

    }

}
