package day3;

import java.util.Scanner;

class GeometryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double root3 = 1.732;

        System.out.println("Choose Calculation");
        System.out.println("1 Area of Circle");
        System.out.println("2 Area of Triangle");
        System.out.println("3 Area of Rectangle");
        System.out.println("4 Area of Isosceles Triangle");
        System.out.println("5 Area of Parallelogram");
        System.out.println("6 Area of Rhombus");
        System.out.println("7 Area of Equilateral Triangle");
        System.out.println("8 Perimeter of Circle");
        System.out.println("9 Perimeter of Equilateral Triangle");
        System.out.println("10 Perimeter of Parallelogram");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                double areaCircle = pi * r * r;
                System.out.println("Area of Circle = " + areaCircle);
                break;

            case 2:
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                double areaTriangle = 0.5 * base * height;
                System.out.println("Area of Triangle = " + areaTriangle);
                break;

            case 3:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double breadth = sc.nextDouble();
                double areaRectangle = length * breadth;
                System.out.println("Area of Rectangle = " + areaRectangle);
                break;

            case 4:
                System.out.print("Enter base: ");
                double baseIso = sc.nextDouble();
                System.out.print("Enter height: ");
                double heightIso = sc.nextDouble();
                double areaIso = 0.5 * baseIso * heightIso;
                System.out.println("Area of Isosceles Triangle = " + areaIso);
                break;

            case 5:
                System.out.print("Enter base: ");
                double basePara = sc.nextDouble();
                System.out.print("Enter height: ");
                double heightPara = sc.nextDouble();
                double areaPara = basePara * heightPara;
                System.out.println("Area of Parallelogram = " + areaPara);
                break;

            case 6:
                System.out.print("Enter diagonal 1: ");
                double d1 = sc.nextDouble();
                System.out.print("Enter diagonal 2: ");
                double d2 = sc.nextDouble();
                double areaRhombus = 0.5 * d1 * d2;
                System.out.println("Area of Rhombus = " + areaRhombus);
                break;

            case 7:
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                double areaEqui = (root3 / 4) * side * side;
                System.out.println("Area of Equilateral Triangle = " + areaEqui);
                break;

            case 8:
                System.out.print("Enter radius: ");
                double r2 = sc.nextDouble();
                double perimeterCircle = 2 * pi * r2;
                System.out.println("Perimeter of Circle = " + perimeterCircle);
                break;

            case 9:
                System.out.print("Enter side: ");
                double sideEq = sc.nextDouble();
                double perimeterEq = 3 * sideEq;
                System.out.println("Perimeter of Equilateral Triangle = " + perimeterEq);
                break;

            case 10:
                System.out.print("Enter side a: ");
                double a = sc.nextDouble();
                System.out.print("Enter side b: ");
                double b = sc.nextDouble();
                double perimeterPara = 2 * (a + b);
                System.out.println("Perimeter of Parallelogram = " + perimeterPara);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}