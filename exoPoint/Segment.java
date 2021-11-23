package com.company.exoPoint;

public class Segment {
    private Point pointA;
    private Point pointB;

    public Segment(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    public Segment(double xA, double yA, double xB, double yB) {
        this.pointA = new Point(xA, yA);
        this.pointB = new Point(xB, yB);
    }

    public double calculLongueur() {

        double xx = Math.pow(pointA.getX() - pointB.getX(), 2);
        double yy = Math.pow(pointA.getY() - pointB.getY(), 2);
        double distance = Math.pow(xx + yy, 0.5);
        return distance;
    }

    public void deplaceOrigine(double dX, double dY) {
        this.pointA = new Point(dX, dY);
    }

    public void deplaceExtremite(double dX, double dY) {
        this.pointB = new Point(dX, dY);
    }

    public void xSymetrie() {
        this.pointA.setX(-pointA.getX());
        this.pointB.setX(-pointB.getX());
    }

    public void ySymetrie() {
        this.pointA.setY(-pointA.getY());
        this.pointB.setY(-pointB.getY());
    }

    public Segment symetrieCentrale() {
        xSymetrie();
        ySymetrie();
        return this;
    }


}

