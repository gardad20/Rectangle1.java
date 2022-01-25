/**
 * This class implement the rectangle node with standard getters and setters
 * Note that compareTo method should be designed here.
 */

import java.awt.*;

public class MyRectangle implements Comparable<MyRectangle> {
    //instance variabeles for the MyRectangle class representing the upper left corner coordinates,
    //width, height, and name
    private int x;
    private int y;
    private int w;
    private int h;
    private String name;

    //constructor method
    MyRectangle(x,y,width,height,name){
        this.x = x;
        this.y = y;
        this.w = width;
        this.h = height;
        this.name = name;
    }

    //setter methods for MyRectangle class
    public void setX(int x2){
        this.x = x2;
    }

    public void setY(int y2){
        this.y = y2;
    }

    public void setW(int w2){
        this.w = w2;
    }

    public void setH(int h2){
        this.h = h2;
    }

    public void setName(Sring name2){
        this.name = name2;
    }

    //getter methods for MyRectangle class
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getW(){
        return w;
    }

    public int getH(){
        return h;
    }

    public String getName(){
        return name;
    }

    //gets the area of a rectangle using A=w*h
    public int getArea(){
        return w*h;
    }

    //Overrides the Comparable interface compareTo method
    @Override public int compareTo(MyRectangle check){
        return name.compareTo(check.name());
    }
}