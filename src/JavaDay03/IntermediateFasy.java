package JavaDay03;

public class IntermediateFasy {

    public static void main(String[] args) {
        InOutFasy y = new InOutFasy();

//A4--------------------------------------------------------
//        Write a program to find maximum between two numbers

        y.out("Please Enter the first Float Number: ");
        float n1 = y.inputFloat();
        y.out("Please Enter the second Float Number: ");
        float n2 = y.inputFloat();

        if(n1 < n2){
            y.outLn(n2 + " is the Maximum!");
        }
        else{
            y.outLn(n1 + " is the Maximum!");
        }

//A5--------------------------------------------------------
//        Write a program to check whether a number is even or odd
        y.out("Please Enter an Int Number: ");
        int i1 = y.inputInt();

        if(i1 % 2  == 0){
            y.outLn("The Number is even!");
        }
        else{
            y.outLn("The Number is odd!");
        }

//A5--------------------------------------------------------
//        Write a program, which outputs “Fizz” if the number is a multiplier of 3 and outputs “Buzz” if the number is a multiplier of 5.
//        If the number is a multiplier of both, 3 and 5 output “FizzBuzz”.
//        If the number is not divisible by 3 or 5 just output the number.

        y.out("Please Enter an Int Number: ");
        int i2 = y.inputInt();

        if(i2 % 3 == 0){
            y.out("Fizz");
        }

        if(i2 % 5 == 0){
            y.out("Buzz");
        }

        if(i2 % 3 != 0 && i2 %5 !=0){
            y.outLn(String.valueOf(i2));
        }

    }
}
