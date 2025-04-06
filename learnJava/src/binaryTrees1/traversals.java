package binaryTrees1;

public class traversals {
    public static void preOrder(Node root){//root left right
        if(root==null )return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(Node root){//left root right
        if(root==null )return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void postOrder(Node root){//left right root
        if(root==null )return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }

    //reverse

    public static void reversePreOrder(Node root){//root left right
        if(root==null )return;
        System.out.print(root.val+" ");
        reversePreOrder(root.right);
        reversePreOrder(root.left);
    }
    public static void reverseInOrder(Node root){//left root right
        if(root==null )return;
        reverseInOrder(root.right);
        System.out.print(root.val+" ");
        reverseInOrder(root.left);
    }
    public static void reversepostOrder(Node root){//left right root
        if(root==null )return;
        reversepostOrder(root.right);
        reversepostOrder(root.left);
        System.out.print(root.val+" ");
    }
    public static void main(String[] args) {
        Node a = new Node(1);//a is root
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(4);
        Node e= new Node(5);
        Node f= new Node(6);
        Node g= new Node(7);
        Node h= new Node(20);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        e.right=h;

        System.out.println("preorder");
        preOrder(a);

        System.out.println();
        System.out.println("inorder");
        inOrder(a);

        System.out.println();
        System.out.println("postorder");
        postOrder(a);

        System.out.println();
        System.out.println("reverse Preorder");
        reversePreOrder(a);

        System.out.println();
        System.out.println("reverse inOrder");
        reverseInOrder(a);

        System.out.println();
        System.out.println("reverse postorder");
        reversepostOrder(a);
    }

}
