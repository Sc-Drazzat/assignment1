class Solution {
    public static void main(String[] args) {
        Rectangle square = new Rectangle(5, 5);
        square.print();
    }
}


public  class Rectangle {
    private double width;
    private double height;
    private int id;
    private static int idGen = 1;
    Rectangle{
        this.width = 1.0;
        this.height = 1.0;
        this.id = idGen++;
    }
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    void print(){
        System.out.println("Rectangle ID: " + this.id);
        System.out.println("Rectangle width: " + this.width);
        System.out.println("Rectangle height: " + this.height);
    }
}