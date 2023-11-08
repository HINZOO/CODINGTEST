// 두 수의 차 https://school.programmers.co.kr/learn/courses/30/lessons/120803
// 정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
class Solution01 {
    public int solution(int num1, int num2) {
        if(num1 >=-50000 && num1<=50000 && num2>=-50000 && num2<=50000){
            int answer = num1-num2;
            return answer;
        }else{
            int answer = 0;
            return 0;
        }
    }
}