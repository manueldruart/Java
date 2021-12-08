package com.company.Part1.exoAbstractPoint;

public class Cercle extends Point{
    private double rayon;

    public Cercle(double x, double y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    public Cercle(Point orig, double rayon) {
        super(orig.getX(), orig.getY());
        this.rayon = rayon;
    }

    public void deplaceCentre(double newX, double newY){
        this.setX(newX);
        this.setY(newY);
    }

    public Point getCentre(){
        return this;
    }
}
