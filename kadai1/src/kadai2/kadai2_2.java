package kadai2;

import java.util.Scanner;

public class kadai2_2 {
	public static void main (String args[]) {
		
		System.out.println("入力された2数の四則演算の結果を出力します。");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("一つ目の数字を入力してください。");
		double input1 = scanner.nextDouble();
		
		System.out.println("二つ目の数字を入力してください");
		double input2 = scanner.nextDouble();
		
		//四則演算
		double plus = input1 + input2;
		double minus = input1 - input2;
		double times = input1 * input2;
		double divided = input1 / input2;
		
		//最大値を求める
		double max = Math.max(Math.max(plus, minus), Math.max(times, divided));
		
		//四則演算結果を出力
		System.out.println(input1 + "＋"+ input2 + "は" + plus + "です。");
		System.out.println(input1 + "-"+ input2 + "は" + minus + "です。");
		System.out.println(input1 + "×"+ input2 + "は" + times + "です。");
		System.out.println(input1 + "÷"+ input2 + "は" + divided + "です。");
		//最大値を出力
		System.out.println("一番大きい数字は" + max + "です。");
		
		scanner.close();
		
	}
}
