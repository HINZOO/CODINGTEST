//ad 제거하기
//문자열 배열 strArr가 주어집니다.
// 배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고
// 남은 문자열을 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.
import java.util.ArrayList;
import java.util.List;

public class Solution27 {
    public String[] solution(String[] strArr) {
        List<String> answer = new ArrayList<>();

        for (String str : strArr) {
            if (!str.contains("ad")) {
                answer.add(str);
            }
        }
        return answer.toArray(new String[0]);//String[0]은 가변배열의 숫자를 담는다.
    }

}
