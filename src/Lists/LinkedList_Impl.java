package Lists;

public class LinkedList_Impl extends Node{

    private Node head;

    public Node getHead() {
        return head;
    }

    public <T> LinkedList_Impl() {
        head = new Node<T>();
    }

    public <T> void add(T data){
        if(head.getData() == null){
            head.setData(data);
        }
        else{
            Node temp = new Node(data);
            temp.setNext(head);
            head = temp;
        }
    }

}
