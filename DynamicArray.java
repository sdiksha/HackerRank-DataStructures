//https://www.hackerrank.com/challenges/dynamic-array
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class DynamicArray
{

	public static void main(String[] args) 
	{
        
		Scanner sc = new Scanner(System.in);
		int iSize = sc.nextInt();
		
		ArrayList<ArrayList<Integer>> lst = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i< iSize; i++)
		{
			ArrayList<Integer> temp = new ArrayList<Integer>();
			lst.add(temp);
		}
		
		int iLastAnswer = 0;
		int iQuery = sc.nextInt();
		
		for(int i=0; i< iQuery; i++)
		{
			int iQuery1 = sc.nextInt();
			int iQuery2 = sc.nextInt();
			int iQuery3 = sc.nextInt();
			
			if(iQuery1 == 1)
			{
				lst.get((iQuery2^iLastAnswer)%iSize).add(iQuery3);
			}
			else if(iQuery1 == 2)
			{
				int iSubSeqSize = lst.get((iQuery2^iLastAnswer)%iSize).size();
				iLastAnswer = lst.get((iQuery2^iLastAnswer)%iSize).get(iQuery3 % iSubSeqSize);
				System.out.println(iLastAnswer);
			}
			
		}
			
    }
	
}
