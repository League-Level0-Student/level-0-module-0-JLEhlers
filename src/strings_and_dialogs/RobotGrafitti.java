package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGrafitti {
public static void main(String[] args) {
	Robot walle= new Robot();
	walle.setSpeed(100);
	walle.setPenWidth(5);
	walle.penDown();
	walle.turn(90);
	walle.move(50);
	walle.turn(-90);
	walle.move(100);
	walle.penUp();
	walle.turn(-90);
	walle.move(50);
	walle.turn(180);
	walle.penDown();
	walle.move(90);
	walle.penUp();
	walle.move(25);
	walle.turn(90);
	walle.move(100);
	walle.turn(180);
	walle.penDown();
	walle.move(100);
	walle.turn(90);
	walle.move(50);
	walle.turn(90);
	walle.move(100);
	walle.turn(180);
	walle.move(50);
	walle.turn(-90);
	walle.move(50);
	walle.turn(-90);
	walle.penUp();
	walle.move(50);
	walle.turn(-90);
	walle.move(100);
	walle.turn(-90);
	walle.penDown();
	walle.move(100);
	walle.turn(90);
	walle.move(25);
	walle.turn(90);
	walle.move(100);
	walle.turn(180);
	walle.move(100);
	walle.turn(90);
	walle.move(25);
	walle.turn(90);
	walle.move(100);
	walle.turn(-90);
	walle.penUp();
	walle.move(25);
	

}
}
