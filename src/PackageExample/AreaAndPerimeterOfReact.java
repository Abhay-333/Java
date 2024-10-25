package PackageExample;

import java.util.Scanner;

public class AreaAndPerimeterOfReact {
    public static void main(String[] args){
        // Area  of reactangle = l*w
        System.out.println("Enter length: ");
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        System.out.println("Enter Width: ");
        double width = sc.nextDouble();
        System.out.println("The Area of Reactangle is: " + length * width);
        System.out.println("The Perimeter of Reactangle is: " + 2 * (length + width));
    }
}
