package BinaryTrees1;

import java.util.Scanner;

public class BTreeUse {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // BinaryTree<Integer> root = new BinaryTree<Integer>(4);
        // BinaryTree<Integer> child1 = new BinaryTree<Integer>(1);
        // BinaryTree<Integer> child2 = new BinaryTree<Integer>(13);
        // BinaryTree<Integer> child3 = new BinaryTree<Integer>(9);
        // BinaryTree<Integer> child4 = new BinaryTree<Integer>(10);
        // BinaryTree<Integer> child5 = new BinaryTree<Integer>(15);
        // root.left = child1;
        // root.right = child2;
        // child1.left= child3;
        // child2.right = child4;
        // child4.left = child5;
        int k = s.nextInt();

        BinaryTree<Integer> root = takeInput(s);

        print(root);
        System.out.println(countNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(findNode(root,k));

        System.out.println(root.data);

    }

    private static boolean findNode(BinaryTree<Integer> root, int k) {
        if(root==null){
            return false;
        }
        if(root.data==k){
            return true;
        }
        return (findNode(root.left, k) || findNode(root.right,k));
        
    }

    private static int sumOfNodes(BinaryTree<Integer> root) {
         if(root==null){
            return 0;
         }
         return root.data+sumOfNodes(root.left)+sumOfNodes(root.right);
    }

    private static int countNodes(BinaryTree<Integer> root) {
        if(root==null){
            return 0;
        }
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return 1+leftCount+rightCount;
    }

    private static BinaryTree<Integer> takeInput(Scanner s) {
        System.out.println("Enter the root data");
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
    
        BinaryTree<Integer> root = new BinaryTree<Integer>(rootData);

        root.left = takeInput(s);
        root.right = takeInput(s);
        
        return root;
    }
    


    private static void print(BinaryTree<Integer> root) {
        if(root == null){
            return;

        }
        System.out.print(root.data + ": ");
        if(root.left!=null){
            System.out.print("L: " + root.left.data + " ,");
        }else{
            System.out.print("L: " + "-1" + " ,");
        }
        if(root.right!=null){
            System.out.println("R: "+ root.right.data);
        }else{
            System.out.println("R: " + "-1");
        }
        print(root.left);
        print(root.right);
    }
}
