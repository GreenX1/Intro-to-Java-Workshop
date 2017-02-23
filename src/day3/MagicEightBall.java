package day3;

import java.util.Random;

import javax.swing.JOptionPane;

public class MagicEightBall {
	public static void main(String[] args) {
		int ball = new Random().nextInt(7);
		System.out.println(ball);
		JOptionPane.showInputDialog("ask a question");
		if (ball == 0) {
			JOptionPane.showMessageDialog(null, "yes");
		}
		if (ball == 1) {
			JOptionPane.showMessageDialog(null, "No");
		}
		if (ball == 2) {
			JOptionPane.showMessageDialog(null, "Ask google");
		}
		if (ball == 3) {
			JOptionPane.showMessageDialog(null, "Go and ask the nearest dog.");
		}
		if (ball == 4) {
			JOptionPane.showMessageDialog(null, "?");
		}
		if (ball == 5) {
			JOptionPane.showMessageDialog(null, "The probibility of that is 0.");
		}
		if (ball == 6) {
			JOptionPane.showMessageDialog(null, "I refuse to tell.");
		}
	}
}
