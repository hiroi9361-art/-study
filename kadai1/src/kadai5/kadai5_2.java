package kadai5;

public class kadai5_2 {
	public static void main(String[] args) {
		
		int[] num = {10,3,100,90,54};
		
		calculation(num);
	}
	
	public static void calculation(int[] num) {
		
		if(num == null || num.length == 0) {
			System.out.println("配列がnullです。");
		}
		
		int sum = 0;
		int max = num[0];
		int min = num[0];
		
		for(int value : num) {
			sum += value;
			if(value > max) {
				max = value;
			}
			if(value < min) {
				min = value;
			}
		}
		
		double average = (double) sum / num.length;
		
		System.out.println("合計値は" + sum);
		System.out.println("平均値は" + average);
		System.out.println("最大値は" + max);
		System.out.println("最小値は" + min);
	}
}