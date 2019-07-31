package Lists;

public class Main {
    public static void main(String[] args) {

        //Linked List impl
        LinkedList_Impl linkl = new LinkedList_Impl();
        linkl.addHead("first node");
        linkl.addHead("second");
        linkl.add("third");
        linkl.addHead("fourth");
        linkl.add("fifth");
        linkl.delete("second");
        linkl.deleteHead();
        linkl.printList();
        Node searcher = linkl.search("fifth");
        System.out.println(searcher.getData());
        System.out.println();
        linkl.printList();
        linkl.convertToCircular();
        linkl.printCircular();

        //DLinkedList
        DLinkedList_Impl dlinkl = new DLinkedList_Impl(1);
        dlinkl.add(2);
        dlinkl.add(3);
        dlinkl.add(4);
        dlinkl.addHead(0);
        dlinkl.printList();
        dlinkl.deleteHead();
        dlinkl.addHead(-1);
        dlinkl.add(5);
        dlinkl.delete(3);
        dlinkl.printList();
        System.out.println();
        dlinkl.convertToCircular();
        dlinkl.printCircular();

    }
}