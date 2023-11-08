//외계행성의 나이
//우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다.
// 입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는
// 나이를 알파벳으로 말하고 있습니다.
// a는 0, b는 1, c는 2, ..., j는 9입니다.
// 예를 들어 23살은 cd, 51살은 fb로 표현합니다.
// 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
public class Solution26 {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String s = String.valueOf(age);//나이를 String 값으로 변환
        String[] arr = s.split(""); //배열로 바꿈

        for (String value : arr) { //숫자 하나하나의 값을 char로 변경 97='A' 아스키코드.
            answer.append((char) ((Integer.parseInt(value)) + 97));
        }

        return answer.toString();//문자열로 변환하여 리턴.
    }
}
