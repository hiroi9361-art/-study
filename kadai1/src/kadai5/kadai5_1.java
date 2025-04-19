package kadai5;

import java.util.Arrays;

public class kadai5_1 {
	public static void main (String[] args) {
	
		int[] num = {10,3,100,90,54};
		
		array_sort(num);
	}
	public static void array_sort(int[] num) {
		
		if(num == null || num.length == 0) {
			System.out.println("配列がnullです。");
			return;
		}
		
		// Arrays.sort() メソッドを使用して配列を昇順に並び替える
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(num));
	}
}