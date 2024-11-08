import java.util.Scanner;
import java.lang.*;
public class TemperatureConverter {
    static  Scanner sc = new Scanner(System.in);
    static double celsius = 0.0;
    static double fahrenheit = 0.0;
    static int input;
    public static void main(String []args) {
        do{
        System.out.println("Welcome to Temperature Converter Program");
        System.out.println(" 1.Celsius to Farenheit Converter ");
        System.out.println("2.Farenheit to Celsius Converter ");
        System.out.println("3.Exit");
        System.out.println("Enter your input(1 - 3)");
        int input = sc.nextInt();
        
            
            switch(input) {
            case 1:
                celsiustofarenheitconverter();
                break;
            case 2:
                 farenheittocelsiusconverter();
                break;
            case 3:
                System.out.println("exiting out of code");
                break;
            default:
                System.out.println("please enter the input value in range (1 - 3)");
                break;
            }

        }
        while(input != 3);
    }
    public static void celsiustofarenheitconverter() {
        System.out.println("enter celsius value");
        celsius = sc.nextDouble();
        fahrenheit= (celsius * 1.8) + 32;

        System.out.println(
            " value of temperature in fahrenheit:"
            + fahrenheit);

    }


    public static void  farenheittocelsiusconverter() {
        System.out.println("enter farenheit value");
        double farenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println(
            "value of temperature in celsius:" + celsius);

    }



}
