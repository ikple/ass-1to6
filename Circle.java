package edu.pnu.shape;
import java.lang.Math;

public class Circle extends Shape{
    private final int radius;
    private final Point center;
    public Circle(Point center, int r){
        this.center = center;
        this.radius = r;}

    public float getArea(){
        float float_radius = (float)radius*radius;
        float pi = (float) Math.PI;
        return float_radius*pi;}

    public String toString(){
        int center_x = this.center.getX();
        int center_y = this.center.getY();
        return String.format("[Circle [%d, %d], radius: %d area: %.2f]",center_x,center_y,this.radius, getArea());
    }
}
