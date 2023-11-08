//배열 두 배 만들기
//정수 배열 numbers가 매개변수로 주어집니다.
// numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
public class Solution13 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];//배열의 크기를 정해주는 것을 잊지말자.
        if(numbers.length >= 1 && numbers.length<=1000){
            for (int i=0; i<numbers.length; i++){
                if(numbers[i]>=(-10000) && numbers[i]<=10000){
                    answer[i] = numbers[i]*2;
                }
            }
        }
        return answer;
    }
}

//import java.util.Arrays;
//
//class Solution {
//    public int[] solution(int[] numbers) {
//        return Arrays.stream(numbers).map(i -> i * 2).toArray();
//    }
//}