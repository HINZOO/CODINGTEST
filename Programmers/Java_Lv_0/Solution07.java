// 두 수의 나눗셈
// 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
class Solution07 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1>0 && num1<=100 && num2>0 && num2<=100){
            double result = ((double) num1/num2 )* 1000;
            answer = (int) result;
        }
        return answer;
    }
}

// 정수의 나눗셈은 정수로 반환되기 때문에 실수로 고쳐준다. 다시 answer에 그 값을 넣기 위해 int 값으로 변환.

//참고 풀이
//class Solution {
//    public int solution(int num1, int num2) {
//        int answer = 0;
//        return num1 * 1000 / num2;
//    }
//}