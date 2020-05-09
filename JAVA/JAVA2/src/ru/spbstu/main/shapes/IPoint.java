package ru.spbstu.main.shapes;

public class IPoint implements Point {
    private float x;
    private float y;

    public IPoint(float x, float y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public float getX() {
        return 0;
    }

    @Override
    public float getY() {
        return 0;
    }
}
