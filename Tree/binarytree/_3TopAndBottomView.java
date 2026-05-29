package binarytree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class _3TopAndBottomView {
     static class Pair{
        int hd;
        Node node;
        public Pair(int hd, Node node) {
            this.hd = hd;
            this.node = node;
        }
    }
     public static void topView(Node root){
         if(root == null) return;
         Map<Integer, Integer> map = new HashMap<>();
         Queue<Pair> queue = new LinkedList<>();
         queue.add(new Pair(0, root));
         while(!queue.isEmpty()){
             Pair current = queue.poll();
             int hd = current.hd;
             Node node = current.node;
             if(!map.containsKey(hd)){ // Only add the first node encountered at each horizontal distance (top view)
                 map.put(hd, node.data);
             }
             if(node.left != null){
                 queue.add(new Pair(hd - 1, node.left));
             }
             if(node.right != null) {
                 queue.add(new Pair(hd + 1, node.right));
             }
         }
         for(Map.Entry<Integer, Integer> entry : map.entrySet()){
             System.out.print(entry.getValue()+" ");
         }
     }
    public static void bottomView(Node root){
        if(root == null) return;
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(0, root));
        while(!queue.isEmpty()){
            Pair current = queue.poll();
            int hd = current.hd;
            Node node = current.node;

            map.put(hd, node.data);// Update the value for the horizontal distance (bottom view)

            if(node.left != null){
                queue.add(new Pair(hd - 1, node.left));
            }
            if(node.right != null) {
                queue.add(new Pair(hd + 1, node.right));
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.print(entry.getValue()+" ");
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

            System.out.println("Top View:");
            topView(root);

            System.out.println("\nBottom View:");
            bottomView(root);
    }
}
