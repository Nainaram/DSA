import java.util.LinkedList;
import java.util.Queue;

import javax.naming.LinkException;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left =null;
        this.right = null;
    }
}
class Tree{
    static void  inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    static void  preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    static void  postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    static int heightOf(Node root){
        if(root==null){
            return 0;
        }
        else{
            int lh = heightOf(root.left);
            int rh = heightOf(root.right);
            return (lh>rh?lh:rh)+1;
        }
    }
    static void printKdistane(Node root , int k){
        if(root!=null){
            if(k==0){
                System.out.print(root.data+" ");
            }
            else{
                printKdistane(root.left, k-1);
                printKdistane(root.right, k-1);
            }
        }
    }
        static int sizeOfTree(Node root){
                if(root==null){
                    return 0;
                }
                else{
                    int s1 = sizeOfTree(root.left);
                    int s2 = sizeOfTree(root.right);
                    return s1+s2+1;
                }
        }
    
    static void BreadthFirstSearch(Node root){
                Queue<Node> q = new LinkedList<Node>();
                if(root!=null){
                    q.add(root);
                    while(q.size()>0){
                        Node currNode  = q.poll();
                        System.out.print (currNode.data+" ");
                        if(currNode.left!=null){
                            q.add(currNode.left);
                        }
                        if(currNode.right!=null){
                            q.add(currNode.right);
                        }
                    }

                }

    }
}

public class Binary {
        public static void main(String[] args) {
            Node root = null;
            root =new Node(10);
            root.left  = new Node(20);
            root.left.left = new Node(25);
            root.left.right = new Node(35);
            root.left.right.left = new Node (55);
            root.left.right.right = new Node(60);
            root.right = new Node(30);
            root.right.left = new Node(45);
            root.right.left.right = new Node(65);
            root.right.right = new Node(50);
            root.right.right.left = new Node(80);
              System.out.println(Tree.sizeOfTree(root));

        }

}
