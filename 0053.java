# 7의 개수
#
# 문제 설명
# 머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.

#1
import java.util.*;

class Solution{
    public int solution(int[] array){
       int answer = 0;
       String str = Arrays.toString(array);
       for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '7'){
                answer++;
            }
       }
       return answer;
    }
}

#2
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int a : array){
            while(a != 0){
                if(a % 10 == 7){
                    answer++;
                }
                a /= 10;
            }
        }
        return answer;
    }
}
