package kadai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kadai4_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<String> validNames = new ArrayList<>();
		validNames.add("A");
		validNames.add("B");
		validNames.add("C");
		
		List<String> effectiveSubjects = new ArrayList<>();
		effectiveSubjects.add("英語");
		effectiveSubjects.add("国語");
		effectiveSubjects.add("数学");
		effectiveSubjects.add("理科");
		effectiveSubjects.add("全教科");
		
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

		while (true) {
			System.out.println("名前を入力してください");
			String name = scanner.nextLine();

			if(validNames.contains(name)) {
				System.out.println(name + "さんですね。");
			
				System.out.println("教科を入力してください。");
				String subject = scanner.nextLine();
				
				if(effectiveSubjects.contains(subject)) {
					System.out.println(subject + "の点数を表示します。");
					
					int subjectIndex = effectiveSubjects.indexOf(subject);
					int studentIndex = validNames.indexOf(name);
					int score = 0;
					
					if(subjectIndex < 4) {  //個別教科の場合
						score = scores[studentIndex][subjectIndex];
						int highScore = -1;
						String highScorer = "";
						
						for(int i = 0; i < validNames.size(); i++) {
							if(scores[i][subjectIndex] > highScore) {
								highScore = scores[i][subjectIndex];
								highScorer = validNames.get(i);
							}
						}
						
						System.out.println(name + "さんの" + subject + "の点数は" + score + "点です。");
						
						if(name.equals(highScorer)) {
							System.out.println(name + "さんは最高得点者です。");
						} else {
							System.out.println("最高得点者との差は" + (highScore - score) + "点です。");
						}
					} else {  //全教科の場合
						int totalScore = 0;
						int highScore = -1;
						String highScorer = "";
						int[] studentTotalScores = new int[validNames.size()];
						
						for(int i = 0; i < 4; i++) {
							totalScore += scores[studentIndex][i];
							for(int n = 0; n < validNames.size(); n++) {
								studentTotalScores[n] += scores[n][i];
							}
						}
						
						for(int i = 0; i < validNames.size(); i++) {
							if(studentTotalScores[i] > highScore) {
								highScore = studentTotalScores[i];
								highScorer = validNames.get(i);
							}
						}
						
						System.out.println(name + "さんの全教科の合計点は" + totalScore + "点です。");
						
						if(name.equals(highScorer)) {
							System.out.println(name + "さんは最高得点者です。");
						} else {
							System.out.println("最高得点者との差は" + (highScore - totalScore) + "点です。");
						}
					}
					
					break;
				} else {
					System.out.println("入力された教科はリストにございません。");
					scanner.close();
					return;
				}
			}	else {
				System.out.println("名前がリストにございません。");
				scanner.close();
				return;
			}
		}
	}
}