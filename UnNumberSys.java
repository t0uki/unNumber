package process;

public class UnNumberSys {
	private JudgNum judg = new JudgNum();
	private Action ac = new Action();
	private int[] userIn = new int[3];
	private int turn;

	public void play() {
		judg.printNum();
		// judg.debugNum(); // Debugプリント
		re: while (turn < 20) {
			turn++;
			// 全部Hitならクリア
			if (judg.getHit() == 3) {
				System.out.println("-------WIN-------");
				break;
			}
			System.out.println("-----" + turn + "ターン目-----");
			// 入力
			for (int i = 0; i < 3; i++) {
				System.out.print("" + (i + 1) + "桁目");
				userIn[i] = Integer.parseInt(ac.action());
			}
			System.out.println("-----------------");
			System.out.println(" OK ? > " + userIn[0] + " " + userIn[1] + " " + userIn[2]);
			System.out.println(" YES : Enter");
			System.out.println(" NO  : \"Enter something\"");
			// 入力やり直しは何か入力
			if (ac.enter()) {
				continue re;
			}
			System.out.println("-----------------");
			// 判定呼び出し
			judg.answerNum(userIn);
			// 現在のNum出力
			judg.printNum();
			// judg.debugNum(); //Debugプリント
			System.out.print("HIT : " + judg.getHit() + " | ");
			System.out.println("BROW : " + judg.getBrow());
			System.out.println("-----------------");
		}
		if (turn == 20)
			System.out.println("-------LOSE------");
	}
}
