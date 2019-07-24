package Lists;

import Lists.LinkedList_Impl;

public class Main {
    public static void main(String[] args) {

        //Linked List impl
        LinkedList_Impl linkl = new LinkedList_Impl();
        linkl.addToHead("first node");
        linkl.addToHead("second");
        linkl.addToTail("third");
        linkl.addToHead("fourth");
        linkl.addToTail("fifth");
        linkl.delete("second");
        linkl.deleteHead();
        linkl.printList();

    }
}