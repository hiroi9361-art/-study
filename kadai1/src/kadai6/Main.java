package kadai6;

import java.util.List;

public class Main {
	public static void main (String[] args) {
		List numberList = GetNum.getNum();

		Cal calculator = new Cal();
		int sum = calculator.cal(numberList);

		IsMul4 isMul4 = new IsMul4();
		int judgement = isMul4.isMul4(sum);
	}
}
