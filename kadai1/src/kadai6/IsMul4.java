package kadai6;

public class IsMul4 {
	public static int isMul4(int num) {
		
		if( num % 4 == 0) {
			System.out.println("4の倍数です。");
		} else {
			System.out.println("4の倍数ではありません。");
		}
		
		return num;
	}
}