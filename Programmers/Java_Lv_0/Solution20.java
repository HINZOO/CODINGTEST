//머쓱이보다 키 큰 사람
//머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
// 머쓱이네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때,
// 머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요.
public class Solution20 {
    public int solution(int[] array, int height) {
        int answer = 0;
        if(array.length>=1 && array.length<=100 &height>=1 && height<=200){
            for (int arr : array){
                if(arr>=1 && arr<=200){
                    if(arr>height){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
//class Solution {
//    public int solution(int[] array, int height) {
//        int answer = 0;
//        for(int i: array){
//            answer += (i>height) ? 1 : 0;
//        }
//        return answer;
//    }
//}
//

//import java.util.Arrays;
//
//class Solution {
//    public int solution(int[] array, int height) {
//        return (int) Arrays.stream(array).filter(value -> value > height).count();
//    }
//}
