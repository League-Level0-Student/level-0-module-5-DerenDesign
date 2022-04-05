package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class Rob_Robot {
	public static void main(String[] args) {
	
		drawSquare();
		drawTriangle();
		
		
		
		
	}

	private static void drawTriangle() {
		Robot rob = new Robot();
		rob.setSpeed(50);
		rob.penDown();
		rob.turn(45);
		rob.move(100);
		rob.turn(350);
		rob.move(100);
		rob.turn(350);
		rob.move(100);
		
	}

	private static void drawSquare() {
		Robot rob = new Robot();
		rob.setSpeed(50);
		rob.penDown();
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		
	}
}

