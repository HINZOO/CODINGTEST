// 배열의 평균값
// 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

class Solution10 {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        for(int i= 0; i< numbers.length; i++){
            sum += numbers[i];
        }
        answer= sum/ (numbers.length);
        return answer;
    }
}

// 배열은 0부터 시작함. for 문 작성시 헷갈리지 말자

//STREAM 사용법을 주로 익히기 .

//import java.util.Arrays;
//
//class Solution {
//    public double solution(int[] numbers) {
//        return Arrays.stream(numbers).average().orElse(0);
//    }
//}