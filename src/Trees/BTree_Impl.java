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
            findEmpty(templeft);
            findEmpty(tempright);
            return null;
        }
        else return node;
    }

    public boolean hasBoth(BinaryTreeNode node){
        if((node.getLeft()!=null) && (node.getRight()!=null)){
            return true;
        }
        else return false;
    }
}
