# 모스부호(1)
#
# 문제 설명
# 머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다. 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다. 문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
모스부호는 다음과 같습니다.

import java.util.*;

class Solution {
    public String solution(String letter) {
        String morse = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f','--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l','--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r','...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x','-.--':'y','--..':'z'";
        String[] split1 = morse.split(",");
        Map<String, String> map = new HashMap<>();
        
        for(String s1 : split1){
            String[] split2 = s1.split(":");
            map.put(split2[0].replaceAll("\'", ""), split2[1].replaceAll("\'", ""));
        }

        String answer = "";
        String[] str = letter.split(" ");

        for(String s2 : str){
            answer += map.get(s2);
        }

        return answer;
    }
}
