import java.awt.*;
import java.awt.image.BufferedImage;

public class Car {

    private Color bodyColor;
    private int height;
    private int width;
    private int xPosition;
    private int yPosition;

    public Car(Color bodyColor, int height, int width, int xPosition, int yPosition) {
        this.bodyColor = bodyColor;
        this.height = height;
        this.width = width;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void drawVehicle(Graphics2D g2d) {

        //variables
        double widthWindow = 0.3*this.width;
        double heightWindow = 0.2*this.height;
        double widthBody = this.width;
        double heightBody = 0.5*this.height;
        double wheelDiameter = 0.2*this.width;

        //keep the proportions consistent with passed-in variables
        double xWindow1 = this.xPosition + 0.5*this.width - widthWindow;
        double yWindow1 = this.yPosition;

        double xWindow2 = this.xPosition + 0.5*this.width;
        double yWindow2 = yWindow1;

        double xBody = this.xPosition;
        double yBody = this.yPosition + heightWindow;

        double xWheel1 = xWindow1 - wheelDiameter/2;
        double yWheel1 = yBody + heightBody-wheelDiameter/2;

        double xWheel2 = xWindow2 + widthWindow - wheelDiameter/2;
        double yWheel2 = yWheel1;

        g2d.setColor(this.bodyColor);
        //window 1
        g2d.drawRect((int) xWindow1, (int) yWindow1 , (int) widthWindow , (int) heightWindow);
        //window 2
        g2d.drawRect((int) xWindow2, (int) yWindow2 , (int) widthWindow , (int) heightWindow);
        //body
        g2d.fillRect((int) xBody, (int) yBody , (int) widthBody , (int) heightBody);

        g2d.setColor(Color.BLACK);
        //first wheel:
        g2d.fillOval((int) xWheel1, (int) yWheel1 , (int) wheelDiameter , (int) wheelDiameter);
        //second wheel
        g2d.fillOval((int) xWheel2, (int) yWheel2 , (int) wheelDiameter , (int) wheelDiameter);
    }
}
