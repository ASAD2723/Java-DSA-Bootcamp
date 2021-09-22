import java.util.Scanner;
public class Q01{
    public static void main(String[],args){
        System.out.print("Enter RADIUS of circle : ");
        Scanner in = new Scanner(Sysytem.in);
        int radius = in.nextInt();
        // Area of circle
        float area_of_circle = 3.14 * (radius * radius);
        System.out.print("Area of cirle is " + area_of_circle);
    }
}