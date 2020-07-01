package JavaDay03;

public class AdvancedFasy {

    public static void main(String[] args) {
        InOutFasy y = new InOutFasy();

//A6-------------------------------------------------
// Write a program that finds the maximum of 3 numbers (by using if/else). Discuss with
//        the your partner.


//        boolean exit = false;
//
//        while(!exit) {
//            y.out("Please enter the first Number: ");
//            float n1 = y.inputFloat();
//            y.out("Please enter the first Number: ");
//            float n2 = y.inputFloat();
//            y.out("Please enter the first Number: ");
//            float n3 = y.inputFloat();
//
//            if (n1 > n2) {
//                n2 = n1;
//            }
//
//            if (n2 > n3) {
//                y.outLn("The maximum is: " + n2);
//            } else {
//                y.outLn("The maximum is: " + n3);
//            }
//            y.out("again? y/n: ");
//            char answer = y.inputChar();
//            if(Character.toLowerCase(answer) != 'y') {
//                exit = true;
//            }
//        }
//A6-------------------------------------------------
//        Expand the program to produce a result in the console like this:
//        The biggest one is 52, the 2nd one is 24, and the smallest one is 11.


        boolean exit = false;
        float temp = 0;

        while(!exit) {
            y.out("Please enter the first Number: ");
            float n1 = y.inputFloat();
            y.out("Please enter the first Number: ");
            float n2 = y.inputFloat();
            y.out("Please enter the first Number: ");
            float n3 = y.inputFloat();

            if (n1 > n2) {

            }
            else{
                temp = n2;
                n2 = n1;
                n1 = temp;
            }
            if (n1 > n3) {

            }
            else{
                temp = n3;
                n3 = n1;
                n1 = temp;
            }
            if (n2 > n3) {

            } else {
                temp = n3;
                n3 = n2;
                n2 = temp;
            }

            y.outLn("The biggest one is " + n1 + " 2nd one is " + n2 + " ,and the smallest one is " + n3 + "!");
            y.out("again? y/n: ");
            char answer = y.inputChar();

                if(Character.toLowerCase(answer) != 'y') {
                exit = true;
            }
        }

    }
}
