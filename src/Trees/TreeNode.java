package Trees;

import java.util.ArrayList;

public class TreeNode<T> {
    private TreeNode parent;
    private T data;
    private ArrayList<TreeNode> children = new ArrayList<>();

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public TreeNode(T data, TreeNode parent){
        this.data = data;
        this.parent = parent;
    }

    public TreeNode(T data, ArrayList<TreeNode> children, TreeNode parent) {
        this.data = data;
        this.children = children;
        this.parent = parent;
    }

    public TreeNode(T data) {
        this.data = data;
    }

    public TreeNode(){}

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ArrayList<TreeNode> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<TreeNode> children) {
        this.children = children;
    }

    public void addChild(TreeNode child){
        this.children.add(child);
    }
}
