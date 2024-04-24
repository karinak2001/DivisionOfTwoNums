import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //כתוב תרשים זרימה שמחלק 2 מספרים מבלי להשתמש בפעולת החילוק, הצג כפלט את
        //המנה ואת השארית. דוגמה: 7 , 3 הפלט יהיה: מנה: 2 שארית: 1

        Scanner scanner = new Scanner(System.in);


        int quotient = 0;   // מנה
        int remainder = 0;  // שארית


        System.out.println("Enter the dividend number: ");
        int dividend = scanner.nextInt();


        System.out.println("Enter the divisor number: ");
        int divisor = scanner.nextInt();



        // Loop until dividend >= divisor
        while (dividend >= divisor) {
            // Subtract divisor from dividend
            dividend -= divisor;
            // Increment quotient by 1
            quotient++;
        }
        
        if (divisor > dividend) {
            remainder = dividend;
        }


        // Print the quotient
        System.out.println("The quotient is: " + quotient);

        // Print the remainder
        System.out.println("The remainder is: " + dividend);



    }
}