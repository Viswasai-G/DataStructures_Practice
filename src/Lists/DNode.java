package Lists;


public class DNode<T> {
    private T data;
    private DNode next;
    private DNode prev;

    public DNode(){
        this.data = null;
        this.prev = null;
        this.next = null;
    }

    public DNode(T data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public DNode(T data, DNode prev){
        this.data = data;
        this.prev = prev;
        this.next = null;
    }

    public DNode(T data, DNode next, DNode prev){
        this.next = next;
        this.prev = prev;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }
}
