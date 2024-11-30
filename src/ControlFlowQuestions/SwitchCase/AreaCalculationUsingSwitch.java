package ControlFlowQuestions.SwitchCase;

import java.util.Scanner;
import java.lang.*;

public class AreaCalculationUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();
        shape = shape.trim();

        switch (shape){
            case "circle", "Circle" : {
                double radius = sc.nextDouble(), areaOfCircle = Math.PI * (radius * radius);
                System.out.println(areaOfCircle);
                break;
            }

            case "rectangle", "Rectangle" : {
                double length = sc.nextDouble(), width = sc.nextDouble(), areaOfRectangle = length * width;
                System.out.println(areaOfRectangle);
                break;
            }

            case "triangle", "Triangle" : {
                double base = sc.nextDouble(), height = sc.nextDouble(), areaOfTriangle = 0.5 * base * height;
                System.out.println(areaOfTriangle);
                break;
            }

            default: System.out.println("Invalid Shape");
        }

    }
}
