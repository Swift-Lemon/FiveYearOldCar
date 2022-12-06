import javax.swing.*;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.Random;

public class DrawPanel extends JPanel {

    //default constructor

    //start drawing shapes:
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); //prevents graphics errors
        Graphics2D g2d = (Graphics2D) g;
        Color myColor = new Color(255, 147, 147);
        Color myOtherColor = new Color(111,222,123);
        Color myThirdColor = new Color(105, 22, 83);

        Car myCar = new Car(myColor, 50,80, 50, 50);
        myCar.drawVehicle(g2d);

        Car myCar2 = new Car(myOtherColor, 100,200,150,120);
        myCar2.drawVehicle(g2d);

        Car myCar3 = new Car(myThirdColor, 120, 80, 200, 10);
        myCar3.drawVehicle(g2d);

    }
}