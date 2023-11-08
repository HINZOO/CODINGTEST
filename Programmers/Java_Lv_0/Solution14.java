public class Solution14 {
    public int solution(int[] dot) {
        int answer = 0;
        boolean start = false;
        if (dot.length == 2){
            for (int j : dot) {
                if (j != 0 && j >= -500 && j <= 500) {
                    start = true;
                    break;
                }
            }
        }
        if(start){
            if(dot[0]>0 && dot[1]>0) answer=1;
            else if(dot[0]<0 && dot[1]>0) answer=2;
            else if(dot[0]<0 && dot[1]<0) answer=3;
            else if(dot[0]>0 && dot[1]<0) answer=4;
        }

        return answer;
    }
}
//class Solution {
//    public int solution(int[] dot) {
//        int answer = 0;
//
//        int x = dot[0];
//        int y = dot[1];
//
//        if(x>0){
//            if(y>0) answer = 1;
//            else answer = 4;
//        }else {
//            if(y>0) answer = 2;
//            else answer = 3;
//        }
//
//        return answer;
//    }
//}