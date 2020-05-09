package ru.spbstu.main.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon {

    private Point a;
    private Point b;
    private Point center;
    private int ugl;

    public Rectangle(Point a, Point b){
        this.a = a;
        this.b = b;
    }

    public Point getCenter(){
        return center;
    }

    public int getRotation(){
        return ugl;
    }

    @Override
    public float getPerimeter() {
        return 2*(Math.abs(a.getX()-b.getX())+Math.abs(a.getY()-b.getY()));
    }

    public float getArea(){
        return Math.abs(a.getX()-b.getX())*Math.abs(a.getY()-b.getY());
    }

    public void rotate(int rotationAngle) {
        int angle = this.ugl + rotationAngle;
        double angleInRads = Math.toRadians(angle);

        float x1 = (float) (center.getX() + (a.getX() - center.getX()) * Math.cos(angleInRads) -
                (b.getY() - center.getY()) * Math.sin(angleInRads));
        float y1 = (float) (center.getY() + (a.getY() - center.getY()) * Math.cos(angleInRads) +
                (b.getX() - center.getX()) * Math.sin(angleInRads));
        float x2 = (float) (center.getX() + (a.getX() - center.getX()) * Math.cos(angleInRads) -
                (b.getY() - center.getY()) * Math.sin(angleInRads));
        float y2 = (float) (center.getY() + (a.getY() - center.getY()) * Math.cos(angleInRads) +
                (b.getX() - center.getX()) * Math.sin(angleInRads));

        a = new IPoint(x1, y1);
        b = new IPoint(x2, y2);

        this.ugl = angle;
    }





    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
}
