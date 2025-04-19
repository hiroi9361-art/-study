package kadai3;

public class kadai3_1 {
	public static void main(String args[]) {
		
		System.out.println("九九の結果を表示します。");
		
		for(int i = 1; i <= 9; i++) {
			for(int n = 1; n <= 9; n++) {
				int num = i*n;
				System.out.println(i + "×" + n + "は" + num + "です。" );
			}
		}
    }
}
