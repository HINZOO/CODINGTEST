//나이 출력
//머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요
class Solution06 {
    public int solution(int age) {
        int answer = 0;
        if(age>0 && age<=120){
            answer = 2022 - age + 1;
        }
        return answer;
    }
}

//연도에 상관없이 나이 출력
//import java.time.*;
//class Solution {
//    public int solution(int age) {
//        LocalDate today = LocalDate.now();
//        return today.getYear() - age + 1;
//    }
//}
