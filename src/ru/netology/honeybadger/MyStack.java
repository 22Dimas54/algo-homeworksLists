package ru.netology.honeybadger;

public class MyStack {

    private class Node {
        int value;
        Node prev;
    }

    Node head;

    public MyStack() {
        this.head = head;
    }

    public void push(int value) {
        Node node = new Node();
        if (head == null) {
            node.value = value;
            head = node;
        } else {
            node.value = value;
            node.prev = head;
            head = node;
        }
    }

    public void pop() {
        if (head == null) {
            System.out.printf("\nНет элементов!");
            return;
        } else {
            head = head.prev;
        }
    }

//    reverse():
//            if head пустая: return Stack()
//
//    reversed_head(node):
//    new_node = Node(value=node.value)
//      if node.prev пустая:
//            return (new_node, new_node)
//            else:
//    head, tail = reversed_head(node.prev)
//    tail.prev = new_node
//        return (head, new_node)
//    reversed_stack = Stack()
//    new_head, new_tail = reversed_head(self.head)
//    reversed_stack.head = new_head
//    return reversed_stack

//    public void reverse() {
//        if (head == null) {
//            //System.out.printf("\nEMPTY");
//            return;
//        } else {
//            reversedHead(head);
//        }
//    }
//
//    public void reversedHead(Node node) {
//        Node newNode = new Node();
//        newNode.value = node.value;
//        if (node.prev == null) {
//            return;
//        } else {
//            MyStack reversedStack = new MyStack();
//        }
//    }

    public void printMe() {
        if (head == null) {
            System.out.printf("\nEMPTY");
        } else {
            Node node = head;
            while (node != null) {
                if (node.prev == null) {
                    System.out.printf("%d", node.value);
                } else {
                    System.out.printf("%d->", node.value);
                }
                node = node.prev;
            }
        }
    }
}
