// HashMap_PairSum Optimal

// Success rate: 28.28%
// Given an array Arr of N positive integers and another number X. Determine whether or not there exist two elements in Arr whose sum is exactly X.

// Input Format:
// The first line contains size of array and required sum
// Second line contains the elements of the array.

// Output Format:
// Output Y for Yes or N for No

// Constraints:
// 1 ≤ N ≤ 10^5
// 1 ≤ Arr[i] ≤ 10^5

// Sample test cases
// Input

// 6 16
// 1 4 45 6 10 8
// Expected output
// Y



import java.util.HashMap;
import java.util.Scanner;
//t.c.O(n)       s.c.O(n)
public class HashMap3 {
	public static void main(String[] args) {
		// write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		

		int [] arr = new int[n];

		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}

		System.out.println(pairSumOptimal(arr,k));
	}

	public static char pairSumOptimal(int[]arr,int k){
		HashMap<Integer,Integer> hm = new HashMap<>();

		for(int i=0;i<arr.length;i++){
			if(hm.containsKey(arr[i])==false){
				hm.put(arr[i],1);
			}else{
				int temp= hm.get(arr[i]);
				hm.put(arr[i],temp+1);

			}
		}

		for(int i=0;i<arr.length;i++){
			int a = arr[i];
			int b = k-arr[i];

			if(a!=b && hm.containsKey(b)==true){
				return 'Y';
			}else if(a==b && hm.get(b)>=2){
				return 'Y';
			}
		}
		return 'N';
	}
}