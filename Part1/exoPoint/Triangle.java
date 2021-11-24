package com.company.exoPoint;

public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Triangle(double xA, double yA, double xB, double yB, double xC, double yC) {
        this.pointA = new Point(xA, yA);
        this.pointB = new Point(xB, yB);
        this.pointC = new Point(xC,yC);
    }

    public Segment[] cotes(){
      return new Segment[] {
              new Segment(pointA,pointB),
              new Segment(pointA,pointC),
              new Segment(pointB,pointC)
        };
    }

    public double calculPerimetre(){
        double total = 0;
        for (Segment cote : cotes()){
            total += cote.calculLongueur();
        }
        return total;
    }


}
