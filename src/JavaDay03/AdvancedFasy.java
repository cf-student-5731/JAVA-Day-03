package JavaDay03;

public class AdvancedFasy {

    public static void main(String[] args) {
        InOutFasy y = new InOutFasy();

//A6. Write a program that finds the maximum of 3 numbers (by using if/else). Discuss with
//        the your partner.

        boolean exit = false;

        while(!exit) {
            y.out("Please enter the first Number: ");
            float n1 = y.inputFloat();
            y.out("Please enter the first Number: ");
            float n2 = y.inputFloat();
            y.out("Please enter the first Number: ");
            float n3 = y.inputFloat();

            if (n1 > n2) {
                n2 = n1;
            }

            if (n2 > n3) {
                y.outLn("The maximum is: " + n2);
            } else {
                y.outLn("The maximum is: " + n3);
            }
            y.out("again? y/n: ");
            char answer = y.inputChar();
                if(Character.toLowerCase(answer) != 'y') {
                exit = true;
            }
        }

    }
}
