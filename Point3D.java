/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell-PC
 */
public class Point3D {
    
    private double xCoord;

    private double yCoord;

    private double zCoord; 

    public Point3D(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    public Point3D() {
        this (0, 0, 0);
    }

    public double getX() {
        return xCoord;
    }

    public double getY() {
        return yCoord;
    }

    public double getZ() {
        return zCoord;
    }

    public void setX(double val) {
        xCoord = val;
    }

    public void setY(double val) {
        yCoord = val;
    }

    public void setZ(double val) {
        zCoord = val;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Point3D) {

            Point3D other = (Point3D) obj;
            if (xCoord == other.getX() &&
                yCoord == other.getY() &&
                zCoord == other.getZ()) {
                return true;
            }
        }
        
        return false;
    }

    public double distanceTo(Point3D other_point) {
        return Math.sqrt(Math.pow(xCoord - other_point.getX(), 2) + 
        Math.pow(yCoord - other_point.getY(), 2) + 
        Math.pow(zCoord - other_point.getZ(), 2));
    }
    
}
