package Lists;

public class DLinkedList_Impl extends DNode{

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

    public <T> void delete(T data){
        DNode temp = head;
        if(temp.getData()==data){
            deleteHead();
        }
        else{
            while(temp.getNext().getData()!= data){
                temp = temp.getNext();
            }
            temp.setNext(temp.getNext().getNext());
            temp.getNext().getNext().setPrev(temp);
        }
    }

    public void deleteHead(){
        head = head.getNext();
        head.setPrev(null);
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

    public void convertToCircular(){
        DNode temp = head;
        while(temp.getNext()!=null){
            temp = temp.getNext();
        }
        temp.setNext(head);
        head.setPrev(temp);
    }

    public void printCircular(){
        DNode temp = head;
        System.out.print("[" +temp.getData() + ", ");
        boolean complete = false;
        while (!complete){
            temp = temp.getNext();
            if(temp.getNext() == head) {
                complete = true;
                break;
            }
            else System.out.print(temp.getData() +", ");
        }
        System.out.print(temp.getData()+"]");
    }
}
