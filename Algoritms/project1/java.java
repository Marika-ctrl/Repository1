#Массив
№Найдите сумму элементов массива.
public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Сумма элементов: " + sum);
    }
}
#В Java массив — это объект фиксированной длины.
#Удобно использовать цикл for-each для перебора элементов.

  #Стек
  #Реализовать стек через встроенный класс Stack.
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Верхний элемент: " + stack.peek());
        System.out.println("Извлекаем: " + stack.pop());
        System.out.println("Стек сейчас: " + stack);
    }
}
#В Java есть готовый класс Stack, наследующий Vector.
#Методы: push(), pop(), peek().

  #Список
  #Реализовать список через LinkedList из стандартной библиотеки.
  import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Список: " + list);
    }
}
#В Java есть встроенный класс LinkedList, реализующий двусвязный список.
#В отличие от массива (ArrayList), LinkedList удобен для частых вставок/удалений.
