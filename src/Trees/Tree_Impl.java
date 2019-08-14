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

    public void addNode(T parentData ,T data){
        if(parentData == root.getData()){
            TreeNode newChild = new TreeNode(data, root);
            root.addChild(newChild);
        }
        else {
            TreeNode parentNode = find(parentData, root);
            parentNode.addChild(new TreeNode(data, parentNode));
        }
    }

    public void deleteNode(T data){
        if(data == root.getData()){
            root.setData(null);
        }
        else{
            TreeNode node = find(data, root);
            TreeNode parent = node.getParent();
            ArrayList<TreeNode> children = parent.getChildren();
            children.remove(node);
            parent.setChildren(children);
            node.setParent(null);
        }
    }

    public TreeNode find(T findernode, TreeNode searcherNode){
       ArrayList<TreeNode> children = searcherNode.getChildren();
       TreeNode result = new TreeNode();
        for(TreeNode child:children){
            if(result.getData()==null){
            if(findernode ==child.getData()){
                result = child;
                break;
            }
            else {
                result = find(findernode, child);
            }
        }}
        return result;
    }


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
