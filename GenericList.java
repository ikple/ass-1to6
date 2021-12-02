package edu.pnu.collection;

import java.util.ArrayList;
import java.util.List;

public class GenericList<T> {
    public final List<T> data = new ArrayList<>();

    public void add(T newBeverage) {data.add(newBeverage);}

    public void clear() {data.clear();}

    public int size() { return data.size();}
    public boolean contains(T b) {
        return data.contains(b);
    }
}
