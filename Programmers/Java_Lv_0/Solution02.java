// 두 수의 몫
class Solution02 {
    public int solution(int num1, int num2) {
        if(num1>0 && num1<=100 && num2>0 && num2<=100){
            int answer = 0;
            answer = num1 / num2;
            return answer;
        }else{
            return 0;
        }
    }
}