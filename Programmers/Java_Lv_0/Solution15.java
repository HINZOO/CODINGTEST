//중복된 숫자 개수
//정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.
public class Solution15 {
    public int solution(int[] array, int n) {
        int answer = 0;
        if(array.length>=1 && array.length<=100){
            for(int i : array){
                if(i>=0 && i<=1000){
                    if(i==n){
                        answer+=1;
                    }
                }
            }
        }
        return answer;
    }
}

//STREAM
// import java.util.*;
//class Solution {
//    public int solution(int[] array, int n) {
//        return (int) Arrays.stream(array)
//                .filter(e -> e == n)
//                .count();
//    }
//}