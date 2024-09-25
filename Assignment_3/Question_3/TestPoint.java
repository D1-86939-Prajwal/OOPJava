package com.app.tester;

import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept coordinates of 2 points from user
        System.out.println("Enter coordinates of point 1 (x1 y1): ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        Point2D p1 = new Point2D(x1, y1);

        System.out.println("Enter coordinates of point 2 (x2 y2): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        Point2D p2 = new Point2D(x2, y2);

        // Display point details
        System.out.println("Point 1: " + p1.getDetails());
        System.out.println("Point 2: " + p2.getDetails());

        // Check if points are equal and display result
        if (p1.isEqual(p2)) {
            System.out.println("The points are the same.");
        } else {
            System.out.println("The points are different.");
            // Display distance between points
            System.out.println("Distance between points: " + p1.calculateDistance(p2));
        }

        sc.close();
    }
}
