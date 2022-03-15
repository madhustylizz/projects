package largestincreasingsubse;

import java.util.Scanner;

public class LIS {
    
    static int LargestIncreasingSubsequence(int arr[], int n)
    {
        int lis[] = new int[n];
        int i, j, max = 0;
 
        /* Initialize LIS values for all indexes */
        for (i = 0; i < n; i++)
            lis[i] = 1;
 
       
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;
 
        /* Pick maximum of all LargestIncreasingSub values */
        for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];
 
        return max;
    }
 
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        System.out.println("Length of Largest Increasing Subsequence is " + LargestIncreasingSubsequence(arr, n)
                           + "\n");
    }
}