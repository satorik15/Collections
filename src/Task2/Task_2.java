package Task2;

public class Task_2
{
    public static void main(String[] args)
    {
        for (UserIterator it = new UserIterator("Hello world!"); it.hasNext(); ) {
            Object character = it.next();
            System.out.print(character + " ");
        }
    }
}
