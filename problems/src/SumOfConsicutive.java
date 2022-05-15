
public class SumOfConsicutive{
	public static void main(String[] args) {
		int[] arr = {1,2,3,0};
		int[] x = solution(arr);
		for(int i =0;i<x.length;i++) {
			System.out.println(x[i]);
		}
	}
	public static  int[] solution(int[] arr) {

		int prod = 1;
		boolean isZeroPresentv = false;
		int indexOfZero = 0;
		int[] result = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0 && !isZeroPresentv) {
				isZeroPresentv = true;
				indexOfZero = i;
				continue;
			}
			//condition if more than 1 zero exist result will be 0at all index
			else if(arr[i] == 0 && isZeroPresentv) {
				return result;
			}
			prod *= arr[i];
		}
		//if there is 1 zeor present  , just update value in reslt for that index and return
		if(isZeroPresentv) {
			result[indexOfZero] = prod;
			return result;
		}
		//in general scenario
		for(int i=0;i<arr.length;i++) {
			result[i] = prod/arr[i];	
		}
		return result;
	}
}