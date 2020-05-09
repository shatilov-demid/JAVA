package ru.spbstu.main.shapes;
import static java.lang.Math.cos;

public class Triangle implements Polygon {
    private Point a;
    private Point b;
    private Point c;
    private Point center;
    private int corner;

    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
        setCenter();
    }

    public Point getCenter(){
        return center;
    }

    private void setCenter() {
        this.center = new IPoint((a.getX() + b.getX() + c.getX()) / 3, (a.getY() + b.getY() + c.getY()) / 3);
    }
    public int getRotation() {
        return corner;
    }

    @Override
    public float getPerimeter() {
        float p1 = getSize(a,b);
        float p2 = getSize(a,c);
        float p3 = getSize(b,c);
        return p1 + p2 + p3;
    }
    @Override
    public float getArea() {
        float s = this.getPerimeter();
        s /= 2;
        float s1 = getSize(a, b);
        float s2 = getSize(a, c);
        float s3 = getSize(b, c);
        return (float) (Math.sqrt(s - s1) * (s - s2) * (s - s3));
    }

    public void rotate(int rotationCorner) {
        int corn = this.corner + rotationCorner;
        float сornInRads = (float) Math.toRadians(corn);

        float x1 = (float) (center.getX() + (a.getX() - center.getX()) * cos(сornInRads) -
                (a.getY() - center.getY()) * Math.sin(сornInRads));
        float y1 = (float) (center.getY() + (a.getY() - center.getY()) * cos(сornInRads) +
                (a.getX() - center.getX()) * Math.sin(сornInRads));
        float x2 = (float) (center.getX() + (b.getX() - center.getX()) * cos(сornInRads) -
                (b.getY() - center.getY()) * Math.sin(сornInRads));
        float y2 = (float) (center.getY() + (b.getY() - center.getY()) * cos(сornInRads) +
                (b.getX() - center.getX()) * Math.sin(сornInRads));
        float x3 = (float) (center.getX() + (c.getX() - center.getX()) * cos(сornInRads) -
                (c.getY() - center.getY()) * Math.sin(сornInRads));
        float y3 = (float) (center.getY() + (c.getY() - center.getY()) * cos(сornInRads) +
                (c.getX() - center.getX()) * Math.sin(сornInRads));


        a = new IPoint (x1, y1);
        b = new IPoint (x2, y2);
        c = new IPoint (x3, y3);

        this.corner = corn;
    }
}
