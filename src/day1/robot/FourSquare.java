package day1.robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot a2 = new Robot("mini");

	void go() {
		// 4. Make the robot move as fast as possible
		a2.setSpeed(10);
		// 5. Set the pen width to 5
		a2.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...

		// 7. Set the pen color to random

		a2.setRandomPenColor();
		a2.turn(90);
		a2.setRandomPenColor();
		a2.turn(90);
		a2.setRandomPenColor();
		a2.turn(90);

		a2.turn(90);
		// 1. Call the drawSquare() method
		drawSquare();
		// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		a2.penDown();
		for (int i = 0; i < 999999988; i++) {
			a2.move(300);
			a2.turn(90);
			a2.setRandomPenColor();
		}

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
