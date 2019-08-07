package Trees;

public class Main {

    public static void main(String[] args) {
        Tree_Impl tree_ = new Tree_Impl(0);
        tree_.addrootchild(1);
        tree_.addrootchild(2);
        tree_.addrootchild(3);
        tree_.traversePrint(tree_.getRoot());
        tree_.deleterootChild(2);
        tree_.traversePrint(tree_.getRoot());

    }
}
