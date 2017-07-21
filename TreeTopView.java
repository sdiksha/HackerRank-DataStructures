//https://www.hackerrank.com/challenges/tree-top-view

public class TreeTopView
{
	void topView(Node root) 
	{
		String output = "";
		if(root != null)
		{
			output = String.valueOf(root.data);
			
			Node temp = root.left;
			while(temp != null)
			{
				output = temp.data + " " + output;
				temp = temp.left;
			}
			
			temp = root.right;
			
			while(temp != null)
			{
				output = output + " " + temp.data;
				temp = temp.right;
			}
		}
		else
		{
			System.out.print("");
		}
		
		System.out.println(output);
    }
	
}
