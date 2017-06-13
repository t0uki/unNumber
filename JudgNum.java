package process;

import state.Number;

public class JudgeNum {
	private int hit;
	private int brow;
	private Number num;
	private String[] printNum = new String[3];

	// Number作成
	JudgeNum() {
		Number num = new Number();
		this.num = num;
	}

	// Hit&Brow判定メソッド
	void answerNum(int[] in) {
		// 答え
		int[] ans = num.getNum();
		hit = 0;
		brow = 0;
		// hit判定
		for (int i = 0; i < 3; i++) {
			// hit判定
			if (ans[i] == in[i]) {
				hit++;
				printNum[i] = Integer.toString(in[i]);
			} else {
				// hitが３の場合クリア
				if (hit == 3)
					return;
				// Brow判定
				for (int j = 0; j < 3; j++) {
					// 同一はHitのみなので処理しない
					if (ans[i] == in[j] && i != j) {
						brow++;
					}
				}
			}
		}
	}

	// 出力
	void printNum() {
		System.out.print("CPU > ");
		for (int i = 0; i < 3; i++) {
			if (null == printNum[i]) {
				printNum[i] = "■";
			}
			System.out.print(printNum[i] + " ");
		}
		System.out.println();
	}

	// Debug用
	void debugNum() {
		int[] debugNum = num.getNum();
		System.out.print("CPU > ");
		for (int i = 0; i < 3; i++) {
			System.out.print(debugNum[i] + " ");
		}
		System.out.println();
	}

	int getHit() {
		return this.hit;
	}

	int getBrow() {
		return this.brow;
	}
}
