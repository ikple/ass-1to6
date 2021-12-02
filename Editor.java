package edu.pnu.edit;

import java.util.ArrayList;
import java.util.List;
import edu.pnu.shape.Shape;

public class Editor{
    private final List<Shape> shapes = new ArrayList<>();

    public void add(Shape new_shape){shapes.add(new_shape);}
    public void clear(){shapes.clear();}
    public void list(){System.out.println(shapes);}
}
