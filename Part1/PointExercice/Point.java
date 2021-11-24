package com.company.PointExercice;

public class Point {
    private int x;
    private int y;
    private static int count = 0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        Point.increment();
    }
    public Point (){
        this(0,0);
        Point.increment();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void translate(Point point){
        this.x = getX();
        this.y = getY();
    }


    public static double distance(Point pointfirst,Point pointsecond) {
        double xx = Math.pow(pointfirst.x - pointsecond.x, 2);
        double yy = Math.pow(pointfirst.y - pointsecond.y, 2);
        double distance = Math.pow(xx + yy, 0.5);
        return distance ;
    }

    public static void increment(){
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void symortho(){
        this.x = -x;
        this.y = -y;
    }

    public void symcentrale(){

    }


    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
