package kadai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetNum {
	public static List<Integer> getNum() {
		
		Scanner scanner = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		int maxInput = 5;
		
		System.out.println(maxInput + "回以下の整数を入力してください。");
		
		int count = 0;
		while(count < maxInput && scanner.hasNextInt()) {
			numbers.add(scanner.nextInt());
			count++;
		}
		
		if(count > maxInput && scanner.hasNextInt()) {
			System.out.println("入力回数が上限の" + maxInput + "回に達しました。");
			
			while(scanner.hasNextInt()) {
				scanner.nextInt(); // 読み飛ばす
			}
		}
		
		return numbers;
	}
}
