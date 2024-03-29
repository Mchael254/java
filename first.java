import java.util.Scanner;

public class first{

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter fisrt number: ");
        int length = scanner.nextInt();

        System.out.print("Enter second number: ");
        int width = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter the operand: ");
        String operand = scanner.nextLine();

        switch (operand) {
            case "+":
            System.out.printf("%s + %S = %s", length, width, length + width  );    
                break;
            
            case "-":
            System.out.printf("%s - %s = %s", length, width, length - width);
                break;

            case "/":
            System.out.printf("%s / %s = %s", length, width, length/width);
            if (width == 0) {
                
                System.out.println("cannot divide by zero");
            }

            case "*":
            System.out.printf("%s * %s = %s", length, width, length*width);

        
            default:
            System.out.printf("%s is not supported as an operand", operand);
                break;
        }

        scanner.close();
    }
}