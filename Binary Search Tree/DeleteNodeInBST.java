import java.util.LinkedList;
import java.util.Queue;

public class DeleteNodeInBST {
    public static class Node {
        int val;
        Node left;
        Node right;
         Node(int val) {
            this.val = val;
        }
    }
    public static Node constructBFS(String[] arr) {
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        int i = 1;
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (i < n-1) {
            Node temp = q.remove();
            Node left = new Node(10);
            Node right = new Node(10);
            if (arr[i].equals("")) {
                left = null;
            } else {
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if (arr[i+1].equals("")){
                right = null;
            } else {
                int r = Integer.parseInt(arr[i+1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i += 2;
        }
        return root;
    }
    public static void preOrder(Node root) {
        if (root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node deleteNode(Node root, int key) {
        if(root == null) return root;

        if(root.val == key) {
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            else {
                Node temp = root.right;
                while(temp.left != null) {
                    temp = temp.left;
                }
                temp.left = root.left;
                return root.right;
            }
        }
        if(root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {
            root.right = deleteNode(root.right, key);
        }
        return root;
    }
    public static void main(String[] args) {
        String[] arr = {"5","3","6","2","4","","7"};
        Node root = constructBFS(arr);
        preOrder(root);
        System.out.println();
        Node ans = deleteNode(root, 3);
        preOrder(ans);
    }
}