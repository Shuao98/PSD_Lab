package Lab7;

public interface Figure {
    public double calculatePerimeter();
    public double calculateArea();
}
public class Circle implements Figure{
    public double radius;
    public Circle(double r){
        this.radius = r;
    }
    public double calculatePerimeter(){
        return 2* Math.PI *this.radius;
    }
    public double calculateArea(){
        return Math.PI *this.radius * this.radius;
    }
}
public class Triangle implements Figure{
    public double side;
    public Triangle(double s){
        this.side = s;
    }
    public double calculatePerimeter(){
        return 3* this.side;
    }
    public double calculateArea(){
        return (Math.sqrt(3)/4)*side*side;
    }
}
public class Rectangle implements Figure{
    public double width;
    public double height;
    public Rectangle(double w, double h){
        this.width =w;
        this.height =h;
    }
    public double calculatePerimeter(){
        return 2*(width+height);
    }
    public double calculateArea(){
        return width*height;
    }
}