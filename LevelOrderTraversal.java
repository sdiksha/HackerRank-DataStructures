//https://www.hackerrank.com/challenges/tree-level-order-traversal

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal
{
	
	void levelOrder(Node root) 
	{
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(q.size() > 0)
		{
			Node temp = q.remove();
			System.out.print(temp.data);
			
			if (temp.left != null)
			{
				q.add(temp.left);
			}
			if (temp.right != null)
			{
				q.add(temp.right);
			}
		}
		
	      
    }

}
