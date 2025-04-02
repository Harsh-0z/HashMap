// HashMap_NonRepeatingElement

// Success rate: 26.50%
// Find the first non-repeating element in a given array arr of N integers.

// Input Format:
// The first line contains size of array.
// Second line contains the elements of the array.

// Output Format:
// Output the required element

// Constraints:
// 1 <= N <= 10^7
// -10^16 <= Ai <= 10^16
// Array consists of only positive and negative integers and not zero.

// Sample test cases
// Input

// 5
// -1 2 -1 3 2
// Expected output
// 3

import java.util.HashMap;
import java.util.Scanner;


public class HashMap2{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		//t.c=o(n)
		//s.c=o(n)

		long[] arr = new long[n];

		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}

		System.out.println(nonrepeatInArray(arr));

	}

	public static long nonrepeatInArray(long[] arr){
		HashMap<Long,Integer> hm = new HashMap<>();

		for(int i=0;i<arr.length;i++){
			if(hm.containsKey(arr[i])==false){
				hm.put(arr[i],1);
			}else{
				int temp = hm.get(arr[i]);
				hm.put(arr[i],temp+1);
			}

		}

		long returnvalue = 0;
		for(int i=0;i<arr.length;i++){
			if(hm.get(arr[i])==1){
				returnvalue = arr[i];
				return returnvalue;
			}
		}
		return -1;
	}
}