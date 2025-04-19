package kadai4;

public class kadai4_1 {
	public static void main(String args[]) {
		
		int scores[][] = new int[3][4];
		
		//Aさんの点数配列
		scores[0][0] = 92; //英語
		scores[0][1] = 89; //国語
		scores[0][2] = 98; //数学
		scores[0][3] = 99; //理科
		
		//Bさんの点数配列
		scores[1][0] = 78;
		scores[1][1] = 79;
		scores[1][2] = 94;
		scores[1][3] = 86;
		
		//Cさんの点数配列
		scores[2][0] = 95;
		scores[2][1] = 98;
		scores[2][2] = 89;
		scores[2][3] = 87;
		
		String[] students = {"Aさん","Bさん","Cさん"};
		String[] subjects = {"英語","国語","数学","理科"};
		
		for(int i = 0; i < subjects.length; i++) {
			int highScore = -1;
			int totalScore = 0;
			String highScorer = "";
			
			for(int n = 0; n < students.length; n++) {
				if(scores[n][i] > highScore) {
					highScore = scores[n][i];
					highScorer = students[n];
				}
				totalScore += scores[n][i];
			}
			double avarageScore = (double) totalScore / (double) students.length;  //平均点を計算 
			System.out.println(subjects[i] + "の最高得点:" + highScore + "点" + "最高得点者:" + highScorer + "平均点" + String.format("%.1f", avarageScore));
		}
	}
}
