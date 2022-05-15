
public class DivisibleBy3 {
	 public static void main(String[] args) {
		System.out.println(DivisibleBy3.solution1("093"));
	}
	 public static int solution1(String S) {
		 long curr = System.currentTimeMillis();
		 int[] chars = new int[S.length()];
		 int sum = 0;
		for(int i=0;i<S.length();i++) {
			chars[i] = S.charAt(i)-'0';
			sum+=chars[i];
		}
		int count = 0;
		for(int  i=0;i<chars.length;i++) {
			int currSum = sum-chars[i];
			if(currSum%3==0 && sum%3!=0) {
				count+=4;
			}
			else{
				count+=3;
			}
		}
		System.out.println(System.currentTimeMillis()-curr);
		return count;
		}

}
