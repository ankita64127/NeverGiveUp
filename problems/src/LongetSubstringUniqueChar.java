import java.util.HashSet;
import java.util.Set;

public class LongetSubstringUniqueChar {
	public static void main(String[] args) {
		System.out.println(		LongetSubstringUniqueChar.lengthOfLongestSubstring("au"));;
	}
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();
        StringBuilder sb = new StringBuilder();
        int l = 0;
        if(s.length() == 1)
        	return 1;
        for(int i =0;i<s.length();i++){
            Character c = s.charAt(i);
            if(!set.contains(c)){
                sb.append(c);
                set.add(c);            
                }
            else{
                if(sb.length() > l){
                    l = sb.length();
                }
                set.remove(sb.charAt(0));
                i--;
                sb.deleteCharAt(0);
            }
        }
        return l;
    }
}

