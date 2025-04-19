package kadai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetNum {
	public static List<Integer> getNum() {

		Scanner scanner = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<>();
		int maxInput = 5;

		System.out.println(maxInput + "回以下の整数を入力してください。excute と入力すると実行します。");

		int count = 0;
		while(count < maxInput && scanner.hasNext()) {
			String input = scanner.next();

			if(input.equalsIgnoreCase("excute")) {
				System.out.println("入力ありがとうございます。");
				break;
			}

			try {
				int num = Integer.parseInt(input);
				numbers.add(num);
				count++;
			} catch(NumberFormatException e) {
				System.out.println("無効な入力です。");
			}
		}
		return numbers;
	}
}
