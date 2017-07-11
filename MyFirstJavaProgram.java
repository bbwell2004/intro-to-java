package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE
		Robot r2d2 = new Robot();
		for (int i = 0; i < 2; i++) {
			r2d2.setPenColor();
			r2d2.penDown();
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
		}
	}
}
