//특별한 이차원 배열 2
public class Solution23 {
    public int solution(int[][] arr) {
        int answer = 1;
        for (int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                if(arr[i][j]!=arr[j][i]) answer=0;
            }//이차원 배열을 모두 돌려
            // 조건의 대우가 되는 부분의 값을 0 으로 설정
            //나머지는 자연스레 1이 된다.

        }
        return answer;
    }
}
