import java.util.Scanner;
public class BinaryTree {
    public static class Node{
        int data ;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }
    static Scanner sc =  null;
    public static void main(String[] args) {
        Node root = null;
        sc = new Scanner(System.in);
        root = creatTree();
        System.out.print("preorder traversal ");
        PreOrderTraversal(root);
        System.out.print("inorder traversal ");
        inOrderTraversal(root);
        System.out.print(" postorder traversal");
        postOrderTraversal(root);
        int Height = height(root);
        System.out.println("the height of the tree : " + Height);
        int Size = size(root);
        System.out.println("the Size of the tree : " + Size);
        int max =maximum(root);
        System.out.println("the maximum of the tree : " + max);

    }

    static Node creatTree(){
        Node root = null ;
        System.out.println("Enter the data :");
        int data = sc.nextInt();
        if(data == -1){
        return null;
    }
    root = new Node(data);
    System.out.println("enter the left of :" + data);
    root.left = creatTree();

    System.out.println("enter the right of :" + data);
    root.right = creatTree();

    return root;
    }


    // traversal of binary tree
    static void PreOrderTraversal(Node root)
    {
        if(root == null) return ;
        System.out.print(root.data +"  ");
        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);
    }
    static void inOrderTraversal(Node root)
    {
        if(root == null) return ;

        inOrderTraversal(root.left);
        System.out.print(root.data +"  ");
        inOrderTraversal(root.right);
    }
    static void postOrderTraversal(Node root)
    {
        if(root == null) return ;

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data +"  ");
    }


    //height of binary tree
    static int height(Node root){
        if(root == null ){ return 0;}
        return Math.max(height(root.left),height(root.right) + 1);
    }

    //size of binary tree
    static int size(Node root){
        if(root == null) return 0;
        int left = size(root.left);
        int right = size(root.right);
        return (left+right+1);
    }

    //Maximum in binary tree
    static int maximum(Node root){
        if(root == null) return 0;
        return Math.max( root.data ,Math.max(maximum(root.left),maximum(root.right)));
    }

}
