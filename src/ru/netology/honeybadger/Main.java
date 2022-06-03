package ru.netology.honeybadger;

public class Main {

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.printMe();
        System.out.println("\nДобавим 0");
        stack.push(0);
        stack.printMe();
        System.out.println("\nДобавим 1");
        stack.push(1);
        stack.printMe();
        System.out.println("\nДобавим 2");
        stack.push(2);
        stack.printMe();
        System.out.println("\nДобавим 3");
        stack.push(3);
        stack.printMe();
        System.out.println("\nДобавим 4");
        stack.push(4);
        stack.printMe();
        System.out.println("\nДобавим 5");
        stack.push(5);
        stack.printMe();
        System.out.println("\nСнимем со стека 5");
        stack.pop();
        stack.printMe();
        System.out.println("\nСнимем со стека 4");
        stack.pop();
        stack.printMe();
        System.out.println("\nСнимем со стека 3");
        stack.pop();
        stack.printMe();
        System.out.println("\nСнимем со стека 2");
        stack.pop();
        stack.printMe();
        System.out.println("\nСнимем со стека 1");
        stack.pop();
        stack.printMe();
        System.out.println("\nСнимем со стека 0");
        stack.pop();
        stack.printMe();
    }
}
