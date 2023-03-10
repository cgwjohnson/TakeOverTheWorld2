
import java.awt.*;

public class Villain {


    public double xpos;                //the x position
    public double ypos;                //the y position
    public int width;
    public int height;
    public boolean isAlive;            //a boolean to denote if the hero is alive or dead.
    public double dx;                    //the speed of the hero in the x direction
    public double dy;                   //the speed of the hero in the y direction
    public double ddy;
    public Rectangle rec;
    public Image pic;

    //movement booleans
    public boolean right;
    public boolean left;
    public boolean down;
    public boolean up;


    public Villain(double pXpos, double pYpos, double dxParameter, double dyParameter, Image picParameter) {

        xpos = pXpos;
        ypos = pYpos;
        width = 100;
        height = 130;
        dx = dxParameter;
        dy = dyParameter;
        pic = picParameter;
        isAlive = true;
        rec = new Rectangle((int)xpos,(int)ypos, width, height);

    } // constructor

    //move( ) method for a keyboard controlled character
    public void move() {
        xpos = xpos + dx;
        ypos = ypos + dy;

        if(right == true){
           dx = 2;
        } else if (left == true) {
            dx = -2;
        } else { // (right == false && left == false)
            dx = 0;
        }

        if(down == true){
            dy = 2;
        } else if (up == true) {
            dy = -2;
        } else {
            dy = 0;
        }

        if(xpos>1000-width){ // right
            xpos = 1000-width;
        }
        if(xpos < 0) { // left
            xpos = 0;
        }
        if(ypos>630-height){ // down
            ypos = 630-height;
        }
        if(ypos < 0) { // up
            ypos = 0;
        }


        //always put this after you've done all the changing of the xpos and ypos values
        rec = new Rectangle((int)xpos, (int)ypos, width, height);

    }

    public void Jump(){
        //boolean/if conditions
        dy=-20;
        dy=dy+ddy;
        //need to make dx like a boolean about if jump, can't change
    }

    public void move2() {
        xpos = xpos + dx;
        ypos = ypos + dy;

        if(right == true){
            dx = 2;
        } else if (left == true) {
            dx = -2;
        } else { // (right == false && left == false)
            dx = 0;
        }

        if(down == true){
            dy = 2;
        } else if (up == true) {
            ypos = ypos+50;
        } else {
            dy = 0;
        }


        if(xpos>1000-width){ // right
            xpos = 1000-width;
        }
        if(xpos < 0) { // left
            xpos = 0;
        }

        if(ypos>630-height){ // down
            ypos = 630-height;
        }
        if(ypos < 0) { // up
            ypos = 0;
        }
    }

}
