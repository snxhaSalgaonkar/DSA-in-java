package binaryTrees1;


class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }

}

public class nodeClassOfTrees {
    public static void display(Node root){
        if(root==null )return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    public static int sum(Node root ){
        if(root==null)return 0;
        int ans = root.val + sum(root.left)+ sum(root.right);
        return ans;   
    }
    public static int product(Node root){
        if(root==null)return 1;
        int ans =  root.val * product(root.left) * product(root.right);
        return ans;
    }
    public static int productofNonZeros(Node root){
        if(root==null||root.val==0)return 1;
        int ans =  root.val * productofNonZeros(root.left) * productofNonZeros(root.right);
        return ans;
    }
    public static int maxVal(Node root){
        if(root==null)return Integer.MIN_VALUE;
        int maxL=maxVal(root.left);
        int maxR=maxVal(root.right);
        return Math.max(root.val,Math.max(maxL,maxR));

    }
    public static int size(Node root){
        if(root==null) return 0;
        return 1+ size(root.left)+ size(root.right);
    }
    public static int level(Node root){
        if(root==null) return 0;
        int a =level(root.left);
        int b= level(root.right);
        return 1 + Math.max(a, b);

    }
    public static boolean ifExist(Node root, Node find){
        if(root==null){
            return false;
        }
        if(root==find) return true;
        return ifExist(root.left,find) || ifExist(root.right,find);
        
    }

    public static void main(String[] args) {
        Node a = new Node(1);//a is root
        Node b= new Node(41);
        Node c= new Node(3);
        Node d= new Node(2);
        Node e= new Node(6);
        Node f= new Node(5);
        Node g= new Node(10);
        Node h= new Node(20);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=g; c.right=f;
        e.right=h;
        display(a);
        System.out.println();
        System.out.println("sum: " + sum(a));
        System.out.println("product: "+ product(a));
        System.out.println("product of Non zeros: "+ productofNonZeros(a));
        System.out.println("max: "+ maxVal(a));
        System.out.println("size: "+ size(a));
        System.out.println("level: "+ level(a));
        System.out.println(ifExist(a, e));
        //height= level-1;
        
    }
    

}
