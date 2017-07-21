//https://www.hackerrank.com/challenges/tree-postorder-traversal

public class PostOrderTreeTraversal
{

	public void postOrder(Node root) 
	{		
		if(root.left != null)
		{
			postOrder(root.left);
		}
		
		if(root.right != null)
		{
			postOrder(root.right);
		}
		
		System.out.print(root.data + " ");
		
	}

}
