package BinaryTrees1;

class BinaryTree<T> {
    public BinaryTree(T data) {
        this.data = data;
    }
    
    T data;
    BinaryTree<T> left;
    BinaryTree<T> right;
}
