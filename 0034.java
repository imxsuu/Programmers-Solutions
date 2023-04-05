# 약수 구하기
#
# 문제 설명
# 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

# 1 
class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                cnt++;
            }
        }
        
        int[] answer = new int[cnt];
        for(int i = n; i >= 1; i--) {
            if(n % i == 0) {
                answer[--cnt] = i;
            }
        }
        return answer;
    }
}

# 2
import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i = 1; i <= n; i++){
            if(n % i == 0) answer.add(i);
        }

        return answer;
    }
}
