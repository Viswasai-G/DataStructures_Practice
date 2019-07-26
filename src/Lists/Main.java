package Lists;

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
        Node searcher = linkl.search("fifth");
        System.out.println(searcher.getData());

        //DLinkedList
        DLinkedList_Impl dlinkl = new DLinkedList_Impl(1);
        dlinkl.add(2);
        dlinkl.add(3);
        dlinkl.add(4);
        dlinkl.addhead(0);
        dlinkl.printList();

    }
}