package kadai3;

public class kadai3_2 {
	public static void main(String args[]) {
		
		System.out.println("0～100までの数字で、3の倍数または5の倍数であるが15の倍数でない数字を表示します。");
		
		for(int i = 0; i <= 100; i++) {
			if((i % 3 == 0 || i % 5 == 0) && i % 15 != 0) { //&&の方が優先順位が高い
				System.out.println(i);
			}
		}
	}
}
