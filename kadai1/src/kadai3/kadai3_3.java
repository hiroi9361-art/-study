package kadai3;

public class kadai3_3 {
	public static void main(String args[]) {

		System.out.println("0～100までの整数で2数の和が3の倍数になる組み合わせを表示します。");

		for (int i = 0; i <= 100; i++) {
			for (int n = 0; n <= 100; n++) {
				int num = i + n;

				if (num % 3 == 0) {
					System.out.println(i + "＋" + n + "=" + num);
				}
			}
		}
	}
}