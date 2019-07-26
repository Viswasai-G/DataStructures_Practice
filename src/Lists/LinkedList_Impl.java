package Lists;

public class LinkedList_Impl extends Node{

    private Node head;

    public Node getHead() {
        return head;
    }

    public <T> LinkedList_Impl() {
        head = new Node<T>();
    }

    public <T> void addToHead(T data){
        if(head.getData() == null){
            head.setData(data);
        }
        else{
            Node temp = new Node(data);
            temp.setNext(head);
            head = temp;
        }
    }

    public <T> void addToTail(T data){
        Node temp;
        temp = head;
        while(temp.getNext()!=null){
            temp= temp.getNext();
        }
        temp.setNext(new Node(data));
    }

    public <T> void delete(T data){
        Node temp = head;
        while(temp.getNext().getData() != data){
            temp = temp.getNext();
        }
        if(temp.getNext().getNext()!=null){
        temp.setNext(temp.getNext().getNext());}
        else temp.setNext(null);
    }

    public void deleteHead(){
        head = head.getNext();
    }

    public void printList() {
        System.out.print("[");
        Node iter = head;
        while (iter.getNext() != null){
            System.out.print(iter.getData());
            System.out.print(", ");
            iter = iter.getNext();
        }
        System.out.print(iter.getData());
        System.out.println("]");
    }

    public <T> Node search(T data){
        Node resultnode = head;
        while(resultnode.getData() != data){
            resultnode = resultnode.getNext();
        }

        return resultnode;
    }

}
