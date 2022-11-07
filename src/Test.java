import file1.Shape;

public class Test {
    public static void main(String[]args){
        Shape undefinedShape = new Shape();
        Shape circle = new Shape(30);
        Shape square = new Shape(10,22);
        Shape rectangle = new Shape(54, 59, 65);
        Shape triangle = new Shape(26, 15, 22, 22);

        undefinedShape.getShapeDetails();
        circle.getShapeDetails();
        square.getShapeDetails();
        rectangle.getShapeDetails();
        triangle.getShapeDetails();
    }
}
