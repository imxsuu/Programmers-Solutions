# A로 B 만들기
#
# 문제 설명
# 문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.

# 1
import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] beforeCh = before.toCharArray();
        char[] afterCh = after.toCharArray();
        
        Arrays.sort(beforeCh);
        Arrays.sort(afterCh);

	before = new String(beforeCh);
        after = new String(afterCh);

        return (before.equals(after)) ? 1 :0;
    }
}

# 2
import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] b = before.toCharArray();
        char[] a = after.toCharArray();
        Arrays.sort(b);
        Arrays.sort(a);

        return new String(b).equals(new String(a)) ? 1 :0;
    }
}
