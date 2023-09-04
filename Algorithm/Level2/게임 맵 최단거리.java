import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[][] maps) {
      int[][] visit = new int[maps.length][maps[0].length];
        
  		Queue<GameMapLoc> q = new LinkedList<>();
  		q.add(new GameMapLoc(0,0,0));
  		
  		while(q.size() > 0) {
  			int x = q.peek().x;
  			int y = q.peek().y;
  			int answer = q.poll().moveCnt;
  			
  			if(x == maps.length-1 && y == maps[0].length-1) {
  				return answer += 1;
  			}
  			
  			int[] xx = {-1, 0, 1, 0};
  			int[] yy = {0, -1, 0, 1};
  			
  			for(int i=0;i<4;i++) {
  				int ax = x+xx[i];
  				int ay = y+yy[i];
  				
  				if(ax>=0 && ay>=0 && ax<maps.length && ay<maps[0].length) {
  					if(maps[ax][ay] == 1 && visit[ax][ay] == 0) {
              visit[ax][ay] = 1;
  						q.add(new GameMapLoc(ax, ay, answer+1));
  					}					
  				}
  			}
  		}
          
          return -1;
    }
}

class GameMapLoc{
	int x;
	int y;
	int moveCnt;
	
	public GameMapLoc(int x, int y, int moveCnt) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
		this.moveCnt = moveCnt;
	}
}
