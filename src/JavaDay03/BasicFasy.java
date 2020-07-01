package JavaDay03;
//import JavaDay03.InOutFasy;

public class BasicFasy {



    public static void main(String[] args) {
        InOutFasy y = new InOutFasy();
//A1--------------------------------------------------------
//        Write a Java program that saves a number in a variable and print whether it is
//        positive or negative.

        y.out("Please enter an Int Number: ");
        int n = y.inputInt();

        if(n > 0){
            y.outLn("The Number is positive");
        }
        else if (n < 0){
            y.outLn("The Number is negative");
        }
        else{
            y.outLn("The Number is Zero");
        }

//A2--------------------------------------------------------
//        Write a Java program that reads a floating-point number and prints “zero” if the number is zero.
//        Otherwise, print “positive” or “negative”. Add “small” if the value of the number is less than 1,
//                or “large” if it exceeds 1,000,000.

        y.out("Please enter a Float Number: ");
        float f = y.inputFloat();

        if(f==0){
            y.outLn(f + " The Number is Zero!");
        }
        else if(f<0){
            y.outLn(f + " The Number is negative!");
        }
        else{
            if(f<1){
                y.outLn(f + " The Number is small and positive!");
            }
            else if(f>=2000000){
                y.outLn(f + " The Number is large and positive!");
            }
            else{
                y.outLn(f + " The Number is positive!");
            }
        }

//A3--------------------------------------------------------
//        Write a Java program that keeps an integer  between 1 and 7 in a variable  and
//        displays the name of the weekday based on that number.

        //Solve it with with if/else

        boolean t = false;
        y.out("Please enter an Int Number from 1 to 7: ");
        int k = y.inputInt();

        while (!t){
            if(k >= 1 && k <= 7){
                t = true;
            }
            else{
                y.out("FORM 1 TO 7 :-O TRY AGAIN: ");
                k = y.inputInt();
            }
        }

        y.outLn("WITH IF!");
        if(k==1){
            y.outLn("Today is Monday!");
        }
        else if(k==2){
            y.outLn("Today is Tuesday!");
        }
        else if(k==3){
            y.outLn("Today is Wednesday!");
        }
        else if(k==4){
            y.outLn("Today is Thursday!");
        }
        else if(k==5){
            y.outLn("Today is Friday!");
        }
        else if(k==6){
            y.outLn("Today is Saturday!");
        }
        else{
            y.outLn("Today is Sunday!");
        }


        //Rewrite solution with a switch statement
        y.outLn("WITH SWITCH!");
        switch (k){
            case 1:
                y.outLn("Today is Monday!");
                break;

            case 2:
                y.outLn("Today is Tuesday!");
                break;

            case 3:
                y.outLn("Today is Wednesday!");
                break;

            case 4:
                y.outLn("Today is Thursday!");
                break;

            case 5:
                y.outLn("Today is Friday!");
                break;

            case 6:
                y.outLn("Today is Saturday!");
                break;

            default:
                y.outLn("Today is Sunday!");
                break;
        }

        // WITH ARRAY
        y.outLn("WITH ARRAY!");
        String weekDays[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        y.outLn("Today is " + weekDays[k-1] + "!");

    } //MAIN
} //Basic
