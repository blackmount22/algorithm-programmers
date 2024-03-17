// Integer.toBinaryString(arr1[i] | arr2[i]);
// 함수 활용해서 푸는걸로 수정 필요

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[][] map = new String[n][n];
        String[][] map2 = new String[n][n];

        for(int i=0;i<arr1.length;i++){
            int number = arr1[i];
            int number2 = arr2[i];
            int x = n-1;
            int x2 = n-1;

            while(x >= 0){
                if(number % 2 == 0) map[i][x] = " ";
                else map[i][x] = "#";

                number = number /2;
                x--;
            }


            while(x2 >= 0) {
                if(number2 % 2 == 0) {
                    map2[i][x2] = " ";
                } else {
                    map2[i][x2] = "#";
                }

                number2 = number2 / 2 ;
                x2--;
            }
        }
        
        for(int i=0;i<n;i++){
            answer[i] = "";

            for(int j=0;j<n;j++){
                if(map[i][j].equals("#") || map2[i][j].equals("#")){
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }
        }
        
        return answer;
    }
}
