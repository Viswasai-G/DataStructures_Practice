package Lists;

public class DLinkedList_Impl extends DNode {

    private DNode head;

    public <T> DLinkedList_Impl(T data){
        head.setData(data);
        head.setNext(null);
        head.setPrev(null);
    }

    public <T> void add(T data){
        DNode temp = head;
        while(temp.getNext()!=null){temp = temp.getNext();}
        DNode node = new DNode(data, null, temp);
    }

    public <T> void addhead(T data){
        DNode temp = head;
        head = new DNode(data, temp, null);
    }

    public DNode getHead() {
        return head;
    }

    public void setHead(DNode head) {
        this.head = head;
    }
}
