package day4;

import java.util.Scanner;

public class GeometryAndSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Operation");
        System.out.println("1. Perimeter of Rectangle");
        System.out.println("2. Perimeter of Square");
        System.out.println("3. Perimeter of Rhombus");
        System.out.println("4. Volume of Prism");
        System.out.println("5. Volume of Cylinder");
        System.out.println("6. Volume of Sphere");
        System.out.println("7. Volume of Pyramid");
        System.out.println("8. Curved Surface Area of Cylinder");
        System.out.println("9. Total Surface Area of Cube");
        System.out.println("10. Fibonacci Series");
        System.out.println("11. Subtract Product and Sum of Digits");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double breadth = sc.nextDouble();
                double perimeterRect = 2 * (length + breadth);
                System.out.println("Perimeter of Rectangle = " + perimeterRect);
                break;

            case 2:
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                double perimeterSquare = 4 * side;
                System.out.println("Perimeter of Square = " + perimeterSquare);
                break;

            case 3:
                System.out.print("Enter side: ");
                double sideR = sc.nextDouble();
                double perimeterRhombus = 4 * sideR;
                System.out.println("Perimeter of Rhombus = " + perimeterRhombus);
                break;

            case 4:
                System.out.print("Enter base area: ");
                double baseArea = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                double prismVolume = baseArea * height;
                System.out.println("Volume of Prism = " + prismVolume);
                break;

            case 5:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.print("Enter height: ");
                double h = sc.nextDouble();
                double cylinderVolume = Math.PI * r * r * h;
                System.out.println("Volume of Cylinder = " + cylinderVolume);
                break;

            case 6:
                System.out.print("Enter radius: ");
                double rSphere = sc.nextDouble();
                double sphereVolume = (4.0 / 3) * Math.PI * rSphere * rSphere * rSphere;
                System.out.println("Volume of Sphere = " + sphereVolume);
                break;

            case 7:
                System.out.print("Enter base area: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double hp = sc.nextDouble();
                double pyramidVolume = (1.0 / 3) * base * hp;
                System.out.println("Volume of Pyramid = " + pyramidVolume);
                break;

            case 8:
                System.out.print("Enter radius: ");
                double rc = sc.nextDouble();
                System.out.print("Enter height: ");
                double hc = sc.nextDouble();
                double curvedArea = 2 * Math.PI * rc * hc;
                System.out.println("Curved Surface Area of Cylinder = " + curvedArea);
                break;

            case 9:
                System.out.print("Enter side: ");
                double cubeSide = sc.nextDouble();
                double cubeArea = 6 * cubeSide * cubeSide;
                System.out.println("Total Surface Area of Cube = " + cubeArea);
                break;

            case 10:
                System.out.print("Enter number of terms: ");
                int n = sc.nextInt();

                int a = 0, b = 1;

                System.out.print("Fibonacci Series: ");

                for (int i = 1; i <= n; i++) {
                    System.out.print(a + " ");
                    int next = a + b;
                    a = b;
                    b = next;
                }
                break;

            case 11:
                System.out.print("Enter number: ");
                int num = sc.nextInt();

                int sum = 0;
                int product = 1;

                while (num > 0) {
                    int digit = num % 10;
                    sum += digit;
                    product *= digit;
                    num /= 10;
                }

                System.out.println("Answer = " + (product - sum));
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}