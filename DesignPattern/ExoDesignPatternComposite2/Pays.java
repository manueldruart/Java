package com.company.DesignPattern.ExoDesignPatternComposite2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Pays implements Benefice{


    Collection children ;

    public Pays(){
        children = new ArrayList();

    }

    public void add(Province composant){
        children.add(composant);
    }

    public void remove(Province composant){
        children.remove(composant);
    }

    public Iterator getChildren(){
        return children.iterator();
    }

    @Override
    public double getBenefice() {
        double result = 0;
        for(Iterator i = children.iterator(); i.hasNext();){
            Object object = i.next();

            Benefice composant = (Benefice) object;
            result += composant.getBenefice();
        }
        return result;
    }
}
