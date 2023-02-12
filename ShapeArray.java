package Main72;

public class ShapeArray<shape> {


    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(2, 3);
        shapes[2] = new Square(10);
        for (Shape shape : shapes){
            if (shape instanceof Circle) {
                System.out.println("The area of the circle is" + ((Circle) shape).getArea());
                ((Circle) shapes[0]).howToColor();
            } else if (shape instanceof Rectangle) {
                System.out.println("The area of the rectangle is" + ((Rectangle) shape).getArea());
                ((Rectangle) shapes[1]).howToColor();
            } else if (shape instanceof Square) {
                System.out.println("The area of square is " + ((Square) shape).getArea());
                ((Square) shapes[2]).howToColor();
            } else {
                System.out.println("No information");
            }

        }
    }
}
