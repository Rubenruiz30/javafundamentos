package BASICS;

import oopmodeling.Celestialbody;
import oopmodeling.Planet;
import oopmodeling.Star;

public class ConversionTest {

    public static void main(String[] args) {
        primitiveConversion();
        // objectconversion();  // si quieres probarlo
    }

    private static void polymorphisMethod(Object cb) {      
    }

    private static void objectconversion() {
        Planet p1 = new Planet();

        Celestialbody cb1 = new Planet();

        Object obj1 = new Planet();

        Planet p2 = (Planet) obj1;
        Object[] plantesObjects = new Planet[20];

        System.out.println(p2);
        System.out.println(p2 == obj1);  // true

        Object[] ej = new Object[20];
        ej[0] = new Planet();
        polymorphisMethod(p2);
        polymorphisMethod(ej[0]);

        for (int i = 0; i < ej.length; i++) {
            ej[i] = new Planet();
        }

        // after the conversion of the object, now we can use the methods of "Planet"
        Planet[] ej2 = (Planet[]) ej;
        ej2[0].getName();
    }

    private static void primitiveConversion() {

        int num = 2312124;
        byte num2 = 127;
        float num3 = 324.4f;
        double num4 = 3434.434343f;

        num = num2;
        System.out.println(num);

        num2 = (byte) num;
        System.out.println(num2);
        num = 123;
        System.out.println(num);

        num2 = (byte) num;
        System.out.println("Number 2 is: " + num2);

        int[] nums1 = new int[23];
        byte[] nums2 = new byte[23];
        // nums1 = (int[]) nums2;   
        // nums2 = (byte[]) nums1; 
    }
}
