package file1;

public class Shape {
    public String shapeName;
    public int numberOfEdges;

    public Shape(){
        shapeName = "Undefined shape";
        System.out.println("ATTENTION: a new Shape has been created! - " + shapeName );
    }

    public Shape(double radius){
        shapeName = "Circle";
        System.out.println("ATTENTION: a new Shape has been created! - " + shapeName );
    }
    public Shape(int edges, double edgeLength){
        shapeName = "Square";
        numberOfEdges = 4;
        System.out.println("ATTENTION: a new Shape has been created! - " + shapeName );
    }
    public Shape( int edges, double e1, double e2){
        shapeName = "Rectangle";
        numberOfEdges = 7;
        System.out.println("ATTENTION: a new Shape has been created! - " + shapeName );
    }
    public Shape(int edges, double e1, double e2, double e3){
        shapeName = "Triangle";
        numberOfEdges = 2;
        System.out.println("ATTENTION: a new Shape has been created! - " + shapeName );
    }

    public void  getShapeDetails(){
        System.out.println("Shape name - " + shapeName + " -- Number of edges - " + numberOfEdges);
    }
}
