class Solution {
    
    int answer = 0;
    
    public int solution(int k, int[][] dungeons) {
        int n = dungeons.length;
		int[][] output = new int[n][n];
		boolean[] visited = new boolean[n];
		
		perm(dungeons, output, visited, 0, n, n, k);
        
        return answer;
    }
    
    public void perm(int[][] dungeons, int[][] output, boolean[] visited, int depth, int n, int r, int k)   {
		
		if(depth == r) {
			int cnt = 0 ;
			
			for(int[] result : output) {
				if(k >= result[0]) {
					k-= result[1];
					cnt++;
				}
			}
			System.out.println();
			
			answer = Math.max(cnt, answer);
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(!visited[i]) {
				visited[i] = true;
				output[depth][0] = dungeons[i][0];
				output[depth][1] = dungeons[i][1];
				perm(dungeons, output, visited, depth+1, n, r, k);
				visited[i] = false;
			}
		}
	}
}
