package Lists;

//TO-DO: use project lombok annotations
public class Node<T> {
    private T data;
    private Node next;

    public Node(T data, Node next){
        this.data = data;
        this.next = next;
    }

    public Node(T data){
        this.data = data;
        this.next = null;
    }

    public Node(){
        this.data = null;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public T getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }
}

