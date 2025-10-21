package ua.opnu;

import java.awt.*;

public class Point3D extends Point {

    int z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    @Override
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public void setLocation(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point3D p) {
        int dx = (p.x - this.x) * (p.x - this.x);
        int dy = (p.y - this.y) * (p.y - this.y);
        int dz = (p.z - this.z) * (p.z - this.z);
        return Math.sqrt(dx + dy + dz);
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + "," + this.z + ")";
    }

    public double distanceFromOrigin() {
        int dx = this.x * this.x;
        int dy = this.y * this.y;
        int dz = this.z * this.z;
        return Math.sqrt(dx + dy + dz);
    }

}
