import java.util.ArrayList;

public class Node 
{
     int data;
     Node next;
     Node left;
     Node right;
     
     Node() 
     {
    	 //empty constructor
     }
     
     Node(int data) 
     {
         this.data = data;
         left = null;
         right = null;
     }
     
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
     
     //Compare two linked lists A and B. Return 1 if they are identical and 0 if they are not.
     //https://www.hackerrank.com/challenges/compare-two-linked-lists
     public int CompareLists(Node headA, Node headB) 
     {
    	 int iMatch = 1;
    	 
    	 if(headA == null && headB == null) //if both are nulls they are equal
    	 {
    		 iMatch = 1;
    	 }
    	 else if((headA != null && headB == null) || (headA == null && headB != null)) //if only one of them is null then they are not equal
    	 {
    		 iMatch = 0;
    	 }
    	 else
    	 {
    		 while(headA != null && headB != null) //Compare lists
    		 {
    			 if(headA.data == headB.data)
    			 {
    				 headA = headA.next;
    				 headB = headB.next;
    				 
    				 if((headA != null && headB == null) || (headA == null && headB != null)) //If one list is shorter than the other
    		    	 {
    		    		 iMatch = 0;
    		    		 break;
    		    	 }
    			 }
    			 else
    			 {
    				 iMatch = 0;
    				 break;
    			 }
    		 }    		 
    	 }
    	 
    	 return iMatch;
     }
     
     
     //Merge two linked lists
     //https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists
     public Node mergeLists(Node headA, Node headB)
     {
    	 Node head = new Node();
    	 Node tempHead = head;
    	 head = null;
    	 
    	 if(headA == null && headB == null)
    	 {
    		 head = null;
    		 tempHead = head;
    	 }
    	 else if(headA != null && headB == null)
    	 {
    		 head = headA;
    		 tempHead = head;
    	 }
    	 else if(headA == null && headB != null)
    	 {
    		 head = headB;
    		 tempHead = head;
    	 }
    	 else
    	 {
    		 while(headA != null && headB != null)
    		 {
    			 if(headA.data < headB.data)
    			 {
    				 if(head == null)
    				 {
    					 head = headA;
    					 tempHead = head;
    					 headA = headA.next;
    				 }
    				 else
    				 {
    					 head.next = headA;
    					 head = head.next;
    					 headA = headA.next;
    				 }
    			 }
    			 else if(headA.data > headB.data)
    			 {
    				 if(head == null)
    				 {
    					 head = headB;
    					 tempHead = head;
    					 headB = headB.next;
    				 }
    				 else
    				 {
    					 head.next = headB;
    					 head = head.next;
    					 headB = headB.next;
    				 }
    			 }
    			 else if(headA.data == headB.data)
    			 {
    				 if(head == null)
    				 {
    					 head = headA;
    					 tempHead = head;
    					 head.next = headB;
    					 head = head.next;
    				 }
    				 else
    				 {
    					 head.next = headA;
    					 head.next.next = headB;
        				 head = head.next.next;
    				 }
    			 }
    			 
    		 }
    		 
    		 if(headA == null && headB != null)
    		 {
    			 head.next = headB;
    		 }
    		 else if(headA != null && headB == null)
    		 {
    			 head.next = headA;
    		 }
    		 
    	 }
    	 
    	 return tempHead;    	 
     }
     
     //Get Nth element from the end in a linked list of integers. Number of elements in the list will always be greater than N.
     //https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail
     public int GetNode(Node head,int n)
     {
    	 int iValue = 0;
    	 Node reversedListHead = Reverse(head);
    	 
    	 for(int i=0; i< n; i++)
    	 {
    		 reversedListHead = reversedListHead.next;
    	 }
    	 
    	 iValue = reversedListHead.data;
    	 return iValue;
    	 
     }
     
     //Delete duplicate nodes from a sorted list
     //https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list
     public Node RemoveDuplicates(Node head)
     {
    	 Node newHead = head;
    	 if(head != null)
    	 {
    		 int iNextValue = head.next.data;
    		 
    		 while(head != null)
        	 {
        		 if(head.data == iNextValue)
        		 {
        			 head.next = head.next.next;
        			 if(head.next != null)
        			 {
        				 iNextValue = head.next.data;
        			 }
        			 else
        			 {
        				 break;
        			 }
        		 }
        		 else
        		 {
        			 head = head.next;
        			 if(head.next != null)
        			 {
        				 iNextValue = head.next.data;
        			 }
        			 else
        			 {
        				 break;
        			 }
        		 }
        		 
        	 }
    	 }
    	 else
    	 {
    		 newHead = null;
    	 }
    	 
    	 return newHead;
     }
     
     //Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.
     //https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle
     public boolean hasCycle(Node head)
     {
    	 boolean bCycleFound = false;
    	 ArrayList<Integer> alElements = new ArrayList<Integer>();
    	 
    	 if(head == null || head.next == null)
    	 {
    		 bCycleFound = false;
    	 }
    	 else
    	 {
    		 while(head != null)
    		 {    			 
    			 if(alElements.contains(head.data))
    			 {
    				 bCycleFound = true;
    				 break;
    			 }
    			 else
    			 {
    				 alElements.add(head.data);
    				 head = head.next;
    			 }    			 
    		 }
    		 
    	 }
    	 
    	 return bCycleFound;
     }
     
}


















