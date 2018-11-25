package strings_and_dialogs;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
String color;
color=JOptionPane.showInputDialog("What is your favortie color?");
JOptionPane.showMessageDialog(null, color+ " is also my favorte color");
Robot walle=new Robot();
walle.penDown();
walle.setSpeed(10);
walle.setRandomPenColor();
walle.setPenWidth(10);
for (int i = 0; i < 3; i++) {
walle.move(200);
walle.turn(120);
}
}
}
