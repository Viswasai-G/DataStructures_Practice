package Trees;

public class Tree_Impl<T> {
    private TreeNode<T> root;

    public Tree_Impl(T data){
        root.setData(data);
        root.setParent(null);
    }

}
