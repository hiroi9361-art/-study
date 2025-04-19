package kadai6;

import java.util.List;

public class Cal {
	public int cal(List<Integer> numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		
		System.out.println("合計：" + sum);
		return sum;
	}
}