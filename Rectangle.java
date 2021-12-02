package edu.pnu.shape;

public class Rectangle extends Shape{
    private final int width;
    private final int height;
    public Rectangle(int point1_x, int point1_y, int point2_x, int point2_y){
        this.height = Math.abs(point2_y-point1_y);
        this.width = Math.abs(point2_x-point1_x);}

    @Override
    public float getArea() {
        return (float) this.height*this.width;}

    public String toString(){
        return String.format("[Rectangle %d %d %.2f]",this.width,this.height,getArea());
    }
}
