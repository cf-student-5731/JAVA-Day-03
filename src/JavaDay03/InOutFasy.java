package JavaDay03;
import java.util.Scanner;

public class InOutFasy {

    public int inputInt(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public float inputFloat(){
        Scanner in = new Scanner(System.in);
        return in.nextFloat();
    }

    public char inputChar(){
        Scanner in = new Scanner(System.in);
        return in.next().charAt(0);
    }

    public void outLn(String s){
        Scanner in = new Scanner(System.in);
        System.out.println(s);
    }

    public void out(String s){
        Scanner in = new Scanner(System.in);
        System.out.print(s);
    }
}
