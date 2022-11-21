package Task2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class UserIterator implements Iterator
{
    private String inputString;
    int current = 0;
    public UserIterator(String inputString) {
        this.inputString = inputString;
    }
    public boolean hasNext() {
        if (current == inputString.length()) { // простая проверка - если текущий элемент равен количеству символов в строке, то есть
            // указвает на последний символ в строке, значит следущий элемент отсутствует и вернём false
            return false;
        }
        return true;
    }

    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return inputString.charAt(current++);
    }

}
