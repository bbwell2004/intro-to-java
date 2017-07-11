package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot chicken = new Robot("batman");

	void go() {

		// 6. Make the robot go as fast as possible
		chicken.setSpeed(10);
		// 4. make a variable to hold the length of the triangle and set it to
		int length = 50;
		// 50

		// 7. Do the following (up to step 10) 60 times
		for (int i = 0; i < 60; i++) {

			// 9. Change the color of the pen to a random color
			chicken.setRandomPenColor();
			// 8. Increase the length of the side by 10 pixels
			length = length + 10;
			// 5. call your drawTriangle() method using your length variable
			drawTriangle(length);
			// 10. Turn the tortoise 6 degrees to the right
			chicken.turn(6);
		}
	}

	/*
	 * 2. fill in the method below to draw a triangle. Use the length variable
	 * for the size of the triangle.
	 * 
	 */
	private void drawTriangle(int length) {
		chicken.setPenWidth(20);
		chicken.penDown();
		for (int i = 0; i < 3; i++) {
			chicken.move(length);
			chicken.turn(360 / 3);
		}
	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
