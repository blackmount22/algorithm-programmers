package algorithm;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int[] arr = {1,2,3};
		int n = arr.length;
		int[] output = new int[n];
		boolean[] visited = new boolean[n];
		
		perm(arr, output, visited, 0, 3, 2);
	}
	
	public static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
		if(depth == r) {
			for(int i=0;i<r;i++) {
				System.out.print(output[i] + " ");
			}
			System.out.println("");
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(visited[i] != true) {
				visited[i] = true;
				output[depth] = arr[i];
				//System.out.println("output["+depth+"] : " +output[depth]);
				perm(arr, output, visited, depth+1,n,r);
				visited[i] = false;
			}
		}
	}
}
