//https://www.hackerrank.com/challenges/arrays-ds
import java.io.*;
import java.util.*;

public class Arrays1D
{

	public static void main(String[] args) 
	{
		//Generating reverse order of array elements
		Scanner sc = new Scanner(System.in);
		int iSize = sc.nextInt();
		int[] iArr = new int[iSize];
		for(int i=0; i< iSize; i++)
		{
			iArr[i] = sc.nextInt();
		}

		for(int i=iSize-1; i>=0; i--)
		{
			System.out.print(iArr[i] + " ");
		}
	}

}
