public class Node 
{
     int data;
     Node next;
     
     //Print linked list elements one per line. Print nothing if list is empty.
     //https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list
     public void Print(Node head) 
     {
    	 if(head != null)
    	 {
    		 while(head.next != null)
        	 {
        		 System.out.println(head.data);
        		 head = head.next;
        	 }
    		 System.out.println(head.data);
    	 }
     }
     
     //Insert a node at the end of the linked list
     //https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list
     public Node InsertAtEndOfList(Node head,int data)
     {
    	Node UpdatedListhead = head;
    	
    	if(head != null)
    	{
    		while(head.next != null)
    		{
    			head = head.next;
    		}
    		Node insertedNode = new Node();
    		insertedNode.data = data;
    		insertedNode.next = null;
    		head.next = insertedNode;
    	}
    	else
    	{
    		UpdatedListhead.data = data;
    		UpdatedListhead.next = null;
    	}
    	
    	return UpdatedListhead;
     }
     
     //Insert a node at the head of the linked list
     //https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list
     public Node Insert(Node head,int x) 
     {
    	 Node newHead = new Node();
    	 newHead.data = x;
    	 newHead.next = head;
    	 return newHead;
    	 
     }
     
     //Insert Node at a given position in a linked list
     //https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list
     public Node InsertNth(Node head, int data, int position)
     {
    	 Node newNode = new Node();
    	 newNode.data = data;
    	 newNode.next = null;
    	 Node newHeadNode = head;
    	 
    	 if(position == 0 && head != null)
    	 {
    		 newNode.next = head;
    		 newHeadNode = newNode;
    	 }
    	 else
    	 {
    		 for(int i=0; i< position-1; i++)
        	 {
        		 head = head.next;
        	 }
    		 
    		 if(head.next == null)
    		 {
    			 head.next = newNode;
    		 }
    		 else
    		 {
    			 Node newNext = head.next;
    			 newNode.next = newNext;
    			 head.next = newNode;
    			 
    		 }    		 
    	 }
    	 
    	 return newHeadNode;
     }
     
     //Delete the node at the given position and return the head node.
     //https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list
     public Node Delete(Node head, int position)
     {
    	 Node newHeadNode = head;
    	 if(position == 0)
    	 {
    		 if(head.next != null)
    		 {
    			 newHeadNode = head.next;
    		 }
    		 else
    		 {
    			 newHeadNode = null;
    		 }
    	 }
    	 else
    	 {
    		 for(int i=0; i< position-1; i++)
    		 {
    			 head = head.next;
    		 }
    		 
    		 if(head.next.next == null)
    		 {
    			 head.next = null;
    		 }
    		 else
    		 {
    			 head.next = head.next.next;
    		 }
    	 }
    	 return newHeadNode;
     }
     
     //Print elements of a linked list in reverse order 
     //https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse
     public void ReversePrint(Node head)
     {
    	 if(head!= null)
    	 {
    		 Node newList = new Node();
    		 newList.next = null;
    		 while(head.next != null)
    		 {
    			 newList = Insert(newList, head.data);
    			 head = head.next;
    		 }
    		 newList = Insert(newList, head.data);
    		 
    		 PrintList(newList);
    	 }
    }
     
     public void PrintList(Node head) 
     {
    	 if(head != null)
    	 {
    		 while(head.next != null)
        	 {
        		 System.out.println(head.data);
        		 head = head.next;
        	 }
    	 }
     }
     
     //Reverse a linked list and return pointer to the head
     //https://www.hackerrank.com/challenges/reverse-a-linked-list
     public Node Reverse(Node head)
     {
    	 Node newList = new Node();
    	 if(head!= null)
    	 {
    		 newList = null;
    		 while(head.next != null)
    		 {
    			 newList = Insert(newList, head.data);
    			 head = head.next;
    		 }
    		 newList = Insert(newList, head.data);
    	 }
    	 else
    	 {
    		 newList = null;
    	 }
    	 return newList;
    	 
     }     
}