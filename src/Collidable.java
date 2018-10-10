import java.awt.*;

abstract public class Collidable{
    //x & y for map coordinates
    protected int x, y;
    //width and height of obj for collision detection
    protected int width, height;
    //the image of the object
    protected Image img;

    public Collidable(Image img, int x, int y) {
        this.img = img;
        this.x = x;
        this.y = y;
//        height = img.getHeight(null);
//        width = img.getWidth(null);
    }

    public int getX()
    {
        return this.x;
    }

    public int getY()
    {
        return this.y;
    }

    public int getWidth()
    {
        return this.width;
    }

    public int getHeight()
    {
        return this.height;
    }

    public Image getImg()
    {
        return this.img;
    }
}