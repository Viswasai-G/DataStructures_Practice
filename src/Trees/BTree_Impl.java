package Trees;

public class BTree_Impl<T> {
    BinaryTreeNode root;

    public BTree_Impl(T data) {
        this.root = new BinaryTreeNode(data);
    }

    public void add(T data){
        if(root.data == null){
            root.data = data;
        }
        else{
            BinaryTreeNode<T> temp = findEmpty(root);
            if(temp.getLeft()==null){
                temp.setLeft(new BinaryTreeNode(data, temp));
            }
            else temp.setRight(new BinaryTreeNode(data, temp));
        }
    }

    public BinaryTreeNode findEmpty(BinaryTreeNode node){
        if(hasBoth(node)){
            BinaryTreeNode templeft = node.getLeft();
            BinaryTreeNode tempright = node.getRight();
            BinaryTreeNode left = findEmpty(templeft);
            BinaryTreeNode right = findEmpty(tempright);
            if(node.getLeft() != null){
                return left;
            }
            else return right;
        }
        else return node;
    }

    public boolean hasBoth(BinaryTreeNode node){
        if((node.getLeft()!=null) && (node.getRight()!=null)){
            return true;
        }
        else return false;
    }

    public void printTree(BinaryTreeNode node){
        printNode(node);
        if(node.getLeft()!=null && node.getRight()!=null){
            printTree(node.getLeft());
            printTree(node.getRight());
        }
        else if(node.getLeft()!=null){printTree(node.getLeft());}
    }

    public void printNode(BinaryTreeNode node){
        System.out.print(" "+node.getData());
    }
}
