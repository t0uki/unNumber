package state;

import java.util.Random;

public class Number {
	private int answer[] = new int[3]; // 答え
	private Random ran = new Random();

	// Number生成
	public Number() {
		for (int i = 0; i < 3; i++) {
			answer[i] = ran.nextInt(9) + 0;
		}
	}

	public int[] getNum() {
		return answer;
	}

}
