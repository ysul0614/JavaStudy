package practice0203.Uranai;

import java.util.Scanner;

public class Uranai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		Scanner inScan = new java.util.Scanner(System.in); //using scanner class instead of allocating a scanner on each read
		String name = inScan.nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = inScan.nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);
		fortune++;
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
		System.out.println("1:大吉2:中吉3:小吉4:凶");
		inScan.close();
		
		
	}

}
