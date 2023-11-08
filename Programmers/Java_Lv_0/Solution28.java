//문자열 잘라서 정렬하기
//문자열 myString이 주어집니다.
// "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후
// 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
import java.util.ArrayList;
import java.util.Arrays;

public class Solution28 {
    public String[] solution(String myString) {
        String[] array= myString.split("x");
        ArrayList<String> result= new ArrayList<>();
        for(String r : array){
            if(!r.isEmpty()){//x가 두번겹쳐지면 빈 배열이 생기는데 이를 제거한다.
                result.add(r);
            }
        }
        String[] answer=result.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;

    }
}
