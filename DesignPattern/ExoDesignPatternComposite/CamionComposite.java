package com.company.DesignPattern.ExoDesignPatternComposite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CamionComposite implements Composant{

    private Collection children;

    public CamionComposite(){
        children = new ArrayList();
    }

    public void add(Composant composant){
        children.add(composant);
    }

    public void remove(Composant composant){
        children.remove(composant);
    }

    public Iterator getChildren(){
        return children.iterator();
    }



    @Override
    public int getPoids() {
        int result = 0;
        for(Iterator i = children.iterator(); i.hasNext();){
            Object object = i.next();

            Composant composant = (Composant) object;
            result += composant.getPoids();
        }
        return result;
    }
}
