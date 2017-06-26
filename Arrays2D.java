//https://www.hackerrank.com/challenges/2d-array?h_r=next-challenge&h_v=zen
import java.util.Scanner;

public class Arrays2D
{

	public static void main(String[] args) 
	{
		// Calculating the maximum sum of all hour glasses in a 6x6 matrix
		Scanner sc = new Scanner(System.in);
		
		int[][] iArr = new int[6][6];
		for(int i=0; i< 6; i++)
		{
			for(int j=0; j< 6; j++)
			{
				iArr[i][j] = sc.nextInt();
			}
		}

		int iMaxSum = Integer.MIN_VALUE;
		for(int i=0; i< 4; i++) //for rows
		{
			for(int k = 0;k < 4; k++) //for hour glass in a certain row
			{
				int iSum = 0;
				for(int j=k; j< k+3; j++) //for columns
				{
					iSum = iSum + iArr[i][j]; //add row 1 of hour glass
				}
				iSum = iSum + iArr[i+1][k+1]; //add the center row of hour glass
				for(int j=k; j< k+3; j++) //for columns
				{
					iSum = iSum + iArr[i+2][j]; //add last row of hour glass
				}
				
				if(iSum >iMaxSum)
				{
					iMaxSum = iSum;
				}
			}
		}
		
		System.out.println(iMaxSum);
	}

}
