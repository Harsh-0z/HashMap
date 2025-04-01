// HashMap_FrequencyQueries

// Success rate: 31.71%
// Given N array elements and Q queries. For every query find frequency of element in array.

// Input Format:
// First line contains 2 integers N, M denoting size of the array and the number of queries.
// Second line contains the elements of the array.
// Third line contains M elements representin queries.

// Output Format:
// Output M integers in different lines denoting the frequency of each query.

// Constraints:
// 1 <= arr.length <= 10^5
// 1 <= arr[i], value <= 10^4
// 0 <= left <= right < arr.length

// Sample test cases
// Input
// Expected output
// 9 2
// 2 8 6 9 8 6 8 2 11
// 2 8
// 2
// 3


import java.util.Scanner;
import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {
		// write your code here
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();

		int[] arr = new int[N];
		int[] que = new int[M];


		for(int i =0;i<N;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<M;i++){
			que[i]=s.nextInt();
		}


		printFrequency(arr,que);
	}

	public static void printFrequency(int[]arr,int[]que){
		int arrlen = arr.length;
		int quelen = que.length;

		HashMap<Integer,Integer> h = new HashMap<>();

		for(int i=0;i<arrlen;i++ ){
			if(h.containsKey(arr[i])==false){
				h.put(arr[i],1);
			}else{
				int temp = h.get(arr[i]);
				h.put(arr[i],temp+1);
			}
		}
		for(int j=0;j<quelen;j++){
			
			if(h.containsKey(que[j])==true){
				System.out.println(h.get(que[j]));
			}else{
				System.out.println(0);
			}
		}
	}
}