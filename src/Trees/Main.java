package Trees;

public class Main {

    public static void main(String[] args) {
        Tree_Impl tree_ = new Tree_Impl(0);
        tree_.addrootchild(1);
        tree_.addrootchild(2);
        tree_.addrootchild(3);
        tree_.traversePrint(tree_.getRoot());
        System.out.println();
        tree_.deleterootChild(2);

        tree_.traversePrint(tree_.getRoot());
        System.out.println();
        tree_.addNode(1, 4);
        tree_.addNode(1,8);
        tree_.addNode(3,6);
        System.out.println();
        tree_.deleteNode(8);
        tree_.addNode(1,7);
        tree_.deleteNode(6);
        tree_.traversePrint(tree_.getRoot());
        System.out.println();
        //BTree

        BTree_Impl bTree_ = new BTree_Impl(0);
        //Currently inserts only to the left side. To Do: balancing-add function to calculate level and then add.
        bTree_.add(1);
        bTree_.add(2);
        bTree_.add(3);
        bTree_.add(4);
        bTree_.add(5);
        bTree_.add(6);
        bTree_.printTree(bTree_.root);

    }
}
