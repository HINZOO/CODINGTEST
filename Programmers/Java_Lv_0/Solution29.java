//배열 만들기 3
//정수 배열 arr와 2개의 구간이 담긴 배열 intervals가 주어집니다.
// intervals는 항상 [[a1, b1], [a2, b2]]의 꼴로 주어지며 각 구간은 닫힌 구간입니다.
// 닫힌 구간은 양 끝값과 그 사이의 값을 모두 포함하는 구간을 의미합니다.
//이때 배열 arr의 첫 번째 구간에 해당하는 배열과 두 번째 구간에 해당하는 배열을
// 앞뒤로 붙여 새로운 배열을 만들어 return 하는 solution 함수를 완성해 주세요.
public class Solution29 {
    public int[] solution(int[] arr, int[][] intervals) {
        int length = 0;
        // 범위의 개수를 먼저 더해서 배열의 크기를 알아낸다
        for (int i = 0; i < intervals.length; i++) {
            int[] group = intervals[i];//이차원 배열에서 i번째 배열 ex)[1,2],[2.3]이 있다면 [1,2]나 [2,3]을 의미
            length += group[1] - group[0] + 1;//[1,2]라면 2-1+1 로하여 배열 크기를 구한다.
        }

        int[] answer = new int[length];
        int index = 0;
        // 범위에 맞는 데이터를 가져와서 증가되는 인덱스에 입력해준다
        for (int i = 0;i < intervals.length; i++) {
            int[] group = intervals[i];
            for (int j = group[0]; j <= group[1]; j++) {
                answer[index++] = arr[j];
            }
        }
        return answer;
    }
}
