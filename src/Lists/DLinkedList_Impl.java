package Lists;

public class DLinkedList_Impl extends DNode {

    private DNode head = new DNode();

    public <T> DLinkedList_Impl(T data){
        head.setData(data);
        head.setNext(null);
        head.setPrev(null);
    }

    public <T> void add(T data){
        DNode temp = head;
        while(temp.getNext()!=null){temp = temp.getNext();}
        DNode node = new DNode(data, null, temp);
        temp.setNext(node);
    }

    public <T> void addhead(T data){
        DNode temp = head;
        head = new DNode(data, temp, null);
    }

    public void printList(){
        DNode temp = head;
        System.out.print("[");
        while(temp.getNext()!= null){
            System.out.print(temp.getData() + ",");
            temp = temp.getNext();
        }
        System.out.print(temp.getData() + "]");
    }

    public DNode getHead() {
        return head;
    }

    public void setHead(DNode head) {
        this.head = head;
    }
}
