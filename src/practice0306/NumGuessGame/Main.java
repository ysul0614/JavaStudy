package practice0306.NumGuessGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(10);
		Scanner inScan = new java.util.Scanner(System.in);
		
		for (int i = 0; i < 5; i++){ // repeat the game 5 times
			System.out.println("0〜9の数字を入力してください");
			int num = inScan.nextInt();
			if (num == ans){
				System.out.println("アタリ！");
				inScan.close();
				break;
			}
			else{
				System.out.println("違います。");
			}
		}
		System.out.println("ゲームを終了します。");
		inScan.close();
	}

}
