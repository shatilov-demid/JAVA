package ru.spbstu.main;
import ru.spbstu.main.shapes.Shape;
import ru.spbstu.main.shapes.Triangle;
import ru.spbstu.main.shapes.Rectangle;
import ru.spbstu.main.shapes.Circle;
import ru.spbstu.main.shapes.IPoint;


import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];

        shapes[0] = new Circle(new IPoint(10, 20), 9);
        shapes[1] = new Triangle(new IPoint(32, 4), new IPoint(4, 45), new IPoint(11, 34));
        shapes[2] = new Rectangle(new IPoint(43,12), new IPoint(11,22));
        shapes[3] = new Circle(new IPoint(2, 2), 13);
        shapes[4] = new Triangle(new IPoint(23, 10), new IPoint(2, 20), new IPoint(1, 3));
        shapes[5] = new Rectangle(new IPoint(14,30), new IPoint(12,12));
        shapes[6] = new Circle(new IPoint(25, 7), 9);
        shapes[7] = new Triangle(new IPoint(5, 6), new IPoint(1, 28), new IPoint(3, 34));
        shapes[8] = new Rectangle(new IPoint(11,12), new IPoint(15,22));
        shapes[9] = new Rectangle(new IPoint(9,3), new IPoint(5,2));

        System.out.println("Наибольшая плошадь = " + maxArea(shapes));
    }
    public static float maxArea(Shape[] shapes) {
        float max = 0;
        for (int i=0; i <= 9;i++){
            if (max < shapes[i].getArea() ){
                int index = i;
                max = shapes[i].getArea();
            }
        }
        return  max;
    }
}
