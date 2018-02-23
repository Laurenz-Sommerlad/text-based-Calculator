import java.util.Scanner;
import java.lang.Math.*;

public class Calculator {
	
	private static Scanner input;

	public static void main(String[] args) 
    {
        int num1;
        int num2;
        String operation;
        String Antwort;
        Antwort = "Das Ergebnis lautet";
        int hoch;
        String Buchstabe;
        String Buchstabe1;
        String Buchstabe2;
        
       
        

        input = new Scanner(System.in);

        System.out.println("Gebe die erste Nummer ein");
        num1 = input.nextInt();
        
        System.out.println("Gebe einen Operator an");
        operation = input.next();
        
        if (operation.equals("√")) {
              System.out.println((Antwort) + " " + (Math.sqrt(num1)));
              return;
        }

        System.out.println("Gebe die zweite Nummer ein");
        num2 = input.nextInt();
        
        
//        if (operation.equals("+"))
//        {
//            System.out.println((Antwort) + " " + (num1 + num2));
//        }
//        else if  (operation == "-")
//        {
//            System.out.println((Antwort) + " " + (num1 - num2));
//        }
//
//        else if (operation == "/")
//        {
//            System.out.println((Antwort) + " " + (num1 + num2));
//        }
//        else if (operation == "*")
//        {
//            System.out.println((Antwort) + " " + (num1 + num2));
//        }
        
switch (operation) { 
case "+":
	System.out.println((Antwort) + " " + (num1 + num2));
	break;
case "-":
	System.out.println((Antwort) + " " + (num1 - num2));
	break;
case "/":
	 System.out.println((Antwort) + " " + (num1 / num2));
	 break;
case "*":
	 System.out.println((Antwort) + " " + (num1 * num2));
	 break;
case "^":
	// System.out.println("Wie oft möchtest du die Zahl mit sich selber Multiplizieren");
	// hoch = input.nextInt();
	 System.out.println((Antwort) + " " + (Math.pow(num1, num2)));
	 break;
case "%":
	 System.out.println((Antwort) + " " + (num1 % num2));
	 break;
case "√":
     System.out.println((Antwort) + " " + (Math.sqrt(num1)));
     break;
case "Pytagura":
	 System.out.println("Definiere 1. Nummer und 2. Nummer (ABC)");
     Buchstabe1 = input.next();
     Buchstabe2 = input.next();
     if ((Buchstabe1.equals("A") && Buchstabe2.equals("B")) || (Buchstabe1.equals("B") && Buchstabe2.equals("A"))) {
    	 System.out.println((Antwort) + " " + (Math.sqrt((Math.pow(num1, 2) + (Math.pow(num2, 2))))));
     }
     
     else if (Buchstabe1.equals("A") && Buchstabe2.equals("C")) {
    	 System.out.println((Antwort) + " " + (Math.sqrt((Math.pow(num2, 2) - (Math.pow(num1, 2))))));
     }
     
     else if (Buchstabe1.equals("C") && Buchstabe2.equals("A")) {
    	 System.out.println((Antwort) + " " + (Math.sqrt((Math.pow(num1, 2) - (Math.pow(num2, 2))))));
     }
     
     else if (Buchstabe1.equals("B") && Buchstabe2.equals("C")) {
    	 System.out.println((Antwort) + " " + (Math.sqrt((Math.pow(num2, 2) - (Math.pow(num1, 2))))));
     }
     
     else if (Buchstabe1.equals("C") && Buchstabe2.equals("B")) {
    	 System.out.println((Antwort) + " " + (Math.sqrt((Math.pow(num1, 2) - (Math.pow(num2, 2))))));
     }
     
     else {
    	 System.out.println("Bitte gebe die 2 Buchstaben nacheinander ein!");
     }
	// Buchstabe = input.next();
	// switch (Buchstabe) {
	// case "a":
		 
	//	 System.out.println((Antwort) + " " + (Math.sqrt((Math.pow(num1, 2) - (Math.pow(num2, 2))))));
	// case "b":
	//	 System.out.println((Antwort) + " " + (Math.sqrt((Math.pow(num1, 2) - (Math.pow(num2, 2))))));
	// case "c":
	//	 System.out.println((Antwort) + " " + (Math.sqrt((Math.pow(num1, 2) + (Math.pow(num2, 2))))));
	//	 
	// }
	 break;
	 default:
		 System.out.println("Operator unbekannt!");
		 
}
    }
}