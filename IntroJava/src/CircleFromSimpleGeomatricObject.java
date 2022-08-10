public class CircleFromSimpleGeomatricObject extends SimpleGeometricObject {
    private double radius;

    public CircleFromSimpleGeomatricObject() {
    }

    public CircleFromSimpleGeomatricObject(double radius){
        this.radius = radius;
    }

    public CircleFromSimpleGeomatricObject(double radius, String color, boolean filled){
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getDiameter(){
        return 2*radius;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    public void printCircle(){
        System.out.println("The cirlce is created " + getDateCreated() + " and the radius is " + radius);
    }
}
