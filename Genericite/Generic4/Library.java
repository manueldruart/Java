package com.company.Genericite.Generic4;

import java.util.ArrayList;
import java.util.List;

public class Library<E> {
    private List<E> resources = new ArrayList<>();

    public void addMedia(E x) {
        resources.add(x);
    }

    public E retrieveLast() {
        int size = resources.size();
        if (size > 0) {
            return resources.get(size - 1);
        }
        return null;
    }
}
