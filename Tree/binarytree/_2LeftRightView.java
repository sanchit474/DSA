package binarytree;

public class _2LeftRightView {
        public static void leftView(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            if(root.left != null){
                leftView(root.left);
            }else{
                leftView(root.right);
            }
        }
        public static void rightView(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            if(root.right != null){
                rightView(root.right);
            }else{
                rightView(root.left);
            }
        }

        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
//            root.right.right = new Node(7);

            System.out.println("Left View:");
            leftView(root);

            System.out.println("\nRight View:");
            rightView(root);
        }
}
