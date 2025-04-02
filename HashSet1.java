// HashMap_Count Distinct Elements

// Success rate: 48.03%
// Given an array arr[] of length N, The task is to count all distinct elements in arr[].

// Input Format:
// The first line contains size of array.
// Second line contains the elements of the array.

// Output Format:
// Output the count.

// Constraints:
// 1<=N<=10^5
// 1<=Arr[i]<=10^5

// Sample test cases
// Input

// 6
// 10 20 20 10 30 10
// Expected output
// 3





import java.util.HashSet;
import java.util.Scanner;

public class HashSet1 {
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		// write your code here

		int n = s.nextInt();

		int[] arr = new int[n];

		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}

		distinctElements(arr);
	}

	public static void distinctElements(int[]arr){
		HashSet<Integer> hs = new HashSet<>();

		for(int i=0;i<arr.length;i++){
			hs.add(arr[i]);//hashset doesnot store duplicate keys thats why here for this question hashset is important.
		}

		System.out.println(hs.size());
	}
}