# 가까운 수
#
# 문제 설명
# 정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.

import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int idx = 0;
        int minDiff = Math.abs(array[0] - n);
        for (int i = 0; i < array.length ; i++) {
            if (Math.abs(array[i] - n) < minDiff) {
                minDiff = Math.abs(array[i] - n);
                idx = i;
            }
        }

        return array[idx];
    }
}
