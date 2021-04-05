/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author Dell-PC
 */

public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static double getDouble(String message) {

        System.out.println(message);

        try {
            
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));


            String s = br.readLine();


            try {
                double d = Double.parseDouble(s);
                return d;
            }
            catch (NumberFormatException e) {
                return 0.0;
            }
        }
        catch (IOException e) {
            return 0.0;
        }
    }


    public static void main(String [] args) {
        

        Point3D point0 = new Point3D(getDouble("Координата X точки 0"), 
        getDouble("Координата Y точки 0"), getDouble("Координата Z точки 0"));

        Point3D point1 = new Point3D(getDouble("Координата X точки 1"), 
        getDouble("Координата Y точки 1"), getDouble("Координата Z точки 1"));
       
        Point3D point2 = new Point3D(getDouble("Координата X точки 2"), 
        getDouble("Координата Y точки 2"), getDouble("Координата Z точки 2"));

        if (point0.equals(point1) || point1.equals(point2) || point0.equals(point2)) {
            System.out.println("Ошибка. Две точки равны");
            System.exit(0);
    }
        double area = computeArea(point0, point1, point2);
        System.out.printf("Площадь треугольника: %.4f\n", area);
    }
	
	public static double computeArea(Point3D pointA, Point3D pointB, Point3D pointC)
	{
            double sideA = pointA.distanceTo(pointB);
            double sideB = pointA.distanceTo(pointC);
            double sideC = pointB.distanceTo(pointC);
            double p = (sideA + sideB + sideC) / 2;

            return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
	}
    
}
