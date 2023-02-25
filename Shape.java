abstract class Shape {
    String color;

    Shape(String color) {
        this.color = "blue";

    }
    void getArea() {

    }
}
class Rectangle extends Shape {
    int width;
    int height;

    Rectangle(int width, int height, String color){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    void getArea() {
        System.out.println("The area for the shape is " + width * height);
    }
}
class Main {
    public static void main(String[] args) {
        Rectangle Area = new Rectangle(60,80,"blue");
        Area.getArea();
    }
}
