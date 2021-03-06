/**
 * The World class sets the valid region for rectangles. 
 * It provides methods such as search, insert, remove, print, 
 * find intersections, and find rectangles in a given region.
 * j
 */

import java.awt.Rectangle;

public class World {
    //set up the range and points for the whole world
    public static final  int WORLD_WIDTH = 1024;
    public static final int WORLD_HEIGHT = 1024;
    public static final int ORIGIN_X = 0;
    public static final int ORIGIN_Y = 0;
    public static final Rectangle WORLD_REC = new Rectangle(0, 0, 1024, 1024);
    protected BST<MyRectangle> tree;
    public World(){
        tree = new BST<>();
    }

    //check if the rectangle is inside the range of the World
    public boolean validRegion(Rectangle rect){
    }

    //region search for rectangle
    public void regionSearch(Rectangle region) {

    }

    //check the intersection
    public void intersections() {
    }


    //remove by the content of the rectangle
    public MyRectangle remove(Rectangle rect) {
    }


    //remove by the name of the rectangle
    public MyRectangle remove(String name) {
    }

}
