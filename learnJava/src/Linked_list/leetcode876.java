package Linked_list;

public class leetcode876 {
         public static  Listnode middleNode(Listnode head) {
            Listnode slow =head;  
            Listnode fast =head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            } 
            return slow;
        }
        public static void main(String[] args) {
            Listnode node5 = new Listnode(5);
            Listnode node4 = new Listnode(4, node5);
            Listnode node3 = new Listnode(3, node4);
            Listnode node2 = new Listnode(2, node3);
            Listnode head = new Listnode(1, node2);
            Listnode.display(head);
    
            // System.out.println(head.length());
            // Listnode ans =  middleNode( head);
            // Listnode.display(ans);
            // System.out.println("Middle Node Value: " + ans.val);

            // Display the list before finding the middle
         System.out.print("Linked list: ");
         Listnode.display(head); // Output: 5 10 20 30 40 50

         // Call the static method to find the middle node
        Listnode middle = middleNode(head); // Passing the head of the list
        System.out.println("Middle Node: " + middle.val); // Output: 30

        // idsplay node
        Listnode.display(middle);

    }

}
