package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		Robot qwertyuiopasdfghjklzxcvbnm = new Robot();
		Robot qwerty = new Robot("");
		qwertyuiopasdfghjklzxcvbnm.setSpeed(10);
		qwertyuiopasdfghjklzxcvbnm.move(200);
		qwertyuiopasdfghjklzxcvbnm.turn(90);
		qwertyuiopasdfghjklzxcvbnm.move(200);
		qwertyuiopasdfghjklzxcvbnm.turn(90);
		qwertyuiopasdfghjklzxcvbnm.move(200);
		qwertyuiopasdfghjklzxcvbnm.turn(90);
		qwertyuiopasdfghjklzxcvbnm.move(200);
		qwertyuiopasdfghjklzxcvbnm.turn(90);
		qwerty.changeRobot(qwerty);
		qwerty.penDown();
		qwerty.setSpeed(10);
		qwerty.move(300);
		qwerty.turn(90);
		qwerty.move(300);
		qwerty.turn(90);
		qwerty.move(300);
		qwerty.turn(90);
		qwerty.move(300);
		qwerty.turn(90);

	}
}
