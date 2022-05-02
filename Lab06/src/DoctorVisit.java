import java.util.Scanner;

public class DoctorVisit {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to the doctor's office!");
        System.out.println("Which body part(s) are you having trouble with?");

        // Declaring Variables
        String bodyPart = "";
        int numOfYes = 0;

        // Question about head
        System.out.print("Head (Y/N)? ");
        String userAnswerHead = keyboard.next();
        if (userAnswerHead.equals("Y") || userAnswerHead.equals("y")) {
            numOfYes++;
            bodyPart = " head ";
        }

        // Question about neck
        System.out.print("Neck (Y/N)? ");
        String userAnswerNeck = keyboard.next();
        if (userAnswerNeck.equals("Y") || userAnswerNeck.equals("y")) {
            numOfYes++;
            bodyPart = " neck ";
        }

        // Question about torso
        System.out.print("Torso (Y/N)? ");
        String userAnswerTorso = keyboard.next();
        if (userAnswerTorso.equals("Y") || userAnswerTorso.equals("y")) {
            numOfYes++;
            bodyPart = " torso ";
        }

        // Question about leg
        System.out.print("Leg (Y/N)? ");
        String userAnswerLeg = keyboard.next();
        if (userAnswerLeg.equals("Y") || userAnswerLeg.equals("y")) {
            numOfYes++;
            bodyPart = " leg ";
        }

        // Question about foot
        System.out.print("Foot (Y/N)? ");
        String userAnswerFoot = keyboard.next();
        if (userAnswerFoot.equals("Y") || userAnswerFoot.equals("y")) {
            numOfYes++;
            bodyPart = " foot ";
        }

        // Output
        if (userAnswerHead.equals("Y") && numOfYes == 1) {
            System.out.println("You need to go see a psychiatrist");
        } else if (numOfYes > 2) {
            System.out.println("Go to the emergency room! You are seriously ill.");
        } else if (userAnswerHead.equals("Y") && numOfYes == 2) {
            System.out.println("Your" + bodyPart + "problem is all in your head. Try not to think about it.");
        } else if (numOfYes == 0) {
            System.out.println("You are fine, just go home!");
        } else {
            if (userAnswerNeck.equals("Y")) {
                System.out.println("Neck injuries are serious. Let’s lighten the mood with a joke. JK");
            }
            if (userAnswerTorso.equals("Y")) {
                System.out.println("Torso injuries are no big deal. Suck it up buttercup.");
            }
            if (userAnswerLeg.equals("Y")) {
                System.out.println("Your leg hurts? It’s probably broken. Take an aspirin.");
            }
            if (userAnswerFoot.equals("Y")) {
                System.out.println("Try walking on the other foot.");
            }
        }
        keyboard.close();
    }
}
