import java.util.Scanner;

public class InputVerifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            int num = input.nextInt();
            System.out.println(num);
        }else if (input.hasNextDouble()){
            double num2 = input.nextDouble();
            System.out.println(num2);
        }else if(input.hasNextFloat()){
            float num3 = input.nextFloat();
            System.out.println(num3);
        }else
            System.out.println("Invalid input");
    }
}
