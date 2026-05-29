package binarytree;


import java.util.LinkedList;
import java.util.Queue;

public class _1Traversals {
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node current = queue.poll();
            System.out.print(current.data+" ");
            if(current.left != null){
                queue.add(current.left);
            }
            if(current.right != null){
                queue.add(current.right);
            }
        }
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Pre-order Traversal:");
        preOrder(root); // Output: 1 2 4 5 3 6 7

        System.out.println("\nIn-order Traversal:");
        inOrder(root); // Output: 4 2 5 1 3 6 7

        System.out.println("\nPost-order Traversal:");
        postOrder(root); // Output: 4 5 2 6 7 3 1

        System.out.println("\nLevel-order Traversal:");
        levelOrder(root); // Output: 1 2 3 4 5
    }
}
