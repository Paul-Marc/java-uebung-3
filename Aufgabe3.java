import java.util.Scanner;

/**
 * @author Paul Conrad 358940, Marc Palfner 359899
 */
//Haubtprogramm mit Scanenr "scanenr" Aufgabe3 
//in Aufgabe3.java
public class Aufgabe3 {
    static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args){
		//Schreiben von "Wie ist dein Name?" auf die Konsole
        System.out.println("Wie ist dein Name?");
		//Declaration des Strings "name" mit dem Wert der letzeren Eingabe
        String name = scanner.nextLine();
		//Schreiben von "Hallo " +name +" schön dich zu sehen!" name ist hierbei
		//ist die Variable "name" der eingegebene Name
        System.out.println("Hallo " +name +" schön dich zu sehen!");
		//Schreiben von "Nenne mir eine belibige Zahl!" auf die Konsole
        System.out.println("Nenne mir eine belibige Zahl!");
		//Declaration des doubels "numberOne" mit dem Wert der 
		//letzeren Ganzzahl Eingabe
        double numberOne = scanner.nextDouble();
		//Schreiben von "Nenne mir eine zweite belibige Zahl!" auf die Konsole
        System.out.println("Nenne mir eine zweite belibige Zahl!");
		//Declaration des doubels "numberTwo" mit dem Wert der 
		//letzeren Ganzzahl Eingabe
        double numberTwo = scanner.nextDouble();
		//Declaration des doubels "difference" mit dem Wert der 
		//division der Variablen "numberOne" und "numberTwo"
        double difference = numberOne - numberTwo;
		//Schreiben von ""Die differenz zwischen der ersten Zahl und der Zweiten ist
		//auf die Konsole am ende der Zeile wird die Variable "difference" auf die 
		//Konsole geschrieben
        System.out.println("Die differenz zwischen der ersten Zahl und der " 
                          +"Zweiten ist: " +difference);			  
		//Überprüfung ob die Summe der Variablen "numberOne" und "numberTwo"
		//durch 5 teilbar ist
        if ((numberOne + numberTwo) % 5 == 0){
			//Schreibe "Die Summe der ersten und zweiten Zahl ist durch 5 Teilbar."
			//auf die Konsole
            System.out.println("Die Summe der ersten und zweiten Zahl ist "
							  +"durch 5 Teilbar.");
        } else {
			//Schreibe "Die Summe der ersten und zweiten Zahl ist nicht durch 5 Teilbar."
			//auf die Konsole
            System.out.println("Die Summe der ersten und zweiten Zahl ist "
							  +"nicht durch 5 Teilbar.");
        }
    }
}