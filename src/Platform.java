import java.awt.*;

public class Platform {
    public int xpos;                //the x position
    public int ypos;                //the y position
    public int width;
    public int height;
    public double dx;                    //the speed of the hero in the x direction
    public double dy;                   //the speed of the hero in the y direction
    public Rectangle rec;
    public Image pic;

    public Platform (int pXpos, int pYpos) {

        xpos = pXpos;
        ypos = pYpos;
        width = 100;
        height = 40;
       rec = new Rectangle(xpos, ypos,width,height);

    }
}
