package Trees;

import java.util.ArrayList;

//Assuming there are no duplicates in the tree
public class Tree_Impl<T> {
    private TreeNode<T> root;

    public TreeNode<T> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

    public Tree_Impl(T data){
        this.root = new TreeNode(data);
    }

    public Tree_Impl(TreeNode<T> root) {
        this.root = root;
    }


    public void addrootchild(T data){
        TreeNode child = new TreeNode(data, root);
        root.addChild(child);
    }

    public void deleterootChild(T data){
        ArrayList<TreeNode> children = root.getChildren();
        for(TreeNode child:children){
            if(child.getData() == data){
                children.remove(child);
                break;
            }
        }
    }

//    public void addNode(TreeNode parent ,T data){
//        if(parent == root){
//            TreeNode newChild = new TreeNode(data);
//            addrootchild(newChild);
//        }
//        else {
//
//        }
//    }
//

    public void traversePrint(TreeNode node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            ArrayList<TreeNode> children = node.getChildren();
            for (TreeNode child : children) {
                traversePrint(child);
            }
        }
    }

}
