package ex1;

import java.awt.geom.Area;

public class Trapezoid implements Comparable<Trapezoid> {
    private double width1, width2,height,side1,side2;
   public Trapezoid(){}

    public Trapezoid(double width1, double width2, double height, double side1, double side2) {
        if(width1>0){
            this.width1=width1;
        }else {
            this.width1=1.0;
        }
        if(width2>0){
            this.width2=width2;
        }else {
            this.width2=1.0;
        }
        if(height>0){
            this.height=height;
        }else {
            this.height=1.0;
        }
        if(side1>0){
            this.side1=side1;
        }else {
            this.side1=1.0;
        }
        if(side2>0){
            this.side2=side2;
        }else {
            this.side2=1.0;
        }
    }

    public double getWidth1() {
        return width1;
    }

    public void setWidth1(double width1) {
       if(width1>0){
       this.width1 = width1;}
    }

    public double getWidth2() {
        return width2;
    }

    public void setWidth2(double width2) {
  if(width2>0){
        this.width2 = width2;}
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
       if(height>0){
       this.height = height;}
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
       if(side1>0){
       this.side1 = side1;}
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
       if(side2>0){
       this.side2 = side2;}
    }
    public double getArea(){
       return (width1+width2)/2*height;
    }
    public double getPerimeter(){
       return width1+width2+side1+side2;
    }

    @Override
    public int compareTo(Trapezoid o) {
        if(getArea()>o.getArea()){
            return 1;
        }else if(getArea()<o.getArea()){
            return -1;
        }
        return 0;
    }
}
