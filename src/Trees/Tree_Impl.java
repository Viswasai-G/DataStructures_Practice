package Trees;

import java.util.ArrayList;

//Assuming there are no duplicates in the tree
public class Tree_Impl<T> {
    private TreeNode<T> root;

    public Tree_Impl(T data){
        root.setData(data);
        root.setParent(null);
    }

    public void addrootchild(TreeNode child){
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

}
