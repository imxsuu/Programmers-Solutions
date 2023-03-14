# 최댓값 만들기 (2)
#
# 문제 설명
# 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.

# 1
import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        if(numbers[0] * numbers[1] > numbers[numbers.length - 1] * numbers[numbers.length - 2]) {
            answer = numbers[0] * numbers[1];
        } else {
            answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        }
        return answer;
    }
}

# 2
import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[numbers.length - 1] * numbers[numbers.length - 2]);
    }
}
