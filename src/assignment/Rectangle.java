package assignment;

public class Rectangle {
    private double width;
    private double height;
    private int id;
    private static int idGen = 1;
    Rectangle(){
        width = 1.0;
        height = 1.0;
        id = idGen++;
    }
    public Rectangle(double width, double height){
        this();
        setWidth(width);
        setHeight(height);
    }
    public void setWidth(double width){
        if (width <= 0)
            throw new IllegalArgumentException("Width must be greater than 0.");
        else
            this.width = width;
    }
    public void setHeight(double height){
        if (height <= 0)
            throw new IllegalArgumentException("Height must be greater than 0.");
        else
            this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public double area(){
        return width * height;
    }
    public double perimeter(){
        return 2*(width + height);
    }
    @Override
    public String toString(){
        return "Rectangle [id=" + id + ", height=" + height + ", width=" + width + "]";
    }
}