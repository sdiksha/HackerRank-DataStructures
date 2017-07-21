//https://www.hackerrank.com/challenges/binary-search-tree-insertion

public class BSTInsertion
{

	static Node Insert(Node root,int value) 
	{
		if(root != null)
		{
			Node temp = root;
			if(root.data < value)
			{
				if(root.right != null)
				{
					Insert(root.right, value);
				}
				else
				{
					Node newNode = new Node();
					newNode.data = value;
					root.right = newNode;
				}
				
			}
			else if(root.data > value)
			{
				if(root.left != null)
				{
					Insert(root.left, value);
				}
				else
				{
					Node newNode = new Node();
					newNode.data = value;
					root.left = newNode;
				}
			}
			return temp;
		}
		else
		{
			Node newNode = new Node();
			newNode.data = value;
			return newNode;
		}
	       
    }
	
}
