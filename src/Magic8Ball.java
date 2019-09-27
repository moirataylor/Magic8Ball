import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args) {

        //need 5 positive and 5 negative - 10 different choices
        //use the input from user & # that they give between 1-100
        //0-10(outlook does not look good) 11-20(there is a bright future ahead)
        //21-30(not possible) 31-40(As I see it, yes)
        // 41-50(don't count on it) 51-60(it is certain)
        // 61-70(very doubtful) 71-80(you may rely on it)
        // 81-90(my sources say no) 91-100(without a doubt)


        Scanner Keyboard;
        String question;
        float number;

        Keyboard = new Scanner(System.in);

        System.out.println("hello, what is your question for me?");
        question = Keyboard.nextLine();
        System.out.print("Now, pick a number between one and 100");
        number = Keyboard.nextFloat();

        if (number>0 && number<10) {
            System.out.println("The outlook does look good");
        }
        else if (number>11 && number<20) {
            System.out.println("There is a bright future ahead");
        }
        else if (number>21 && number<30){
            System.out.println("not possible");
        }
        else if (number>31 && number<40){
            System.out.print("As I see it, yes");
        }
        else if (number>41 && number<50){
            System.out.println("Don't count on it");
        }
        else if (number>51 && number<60){
            System.out.println("It is certain");
        }
        else if (number>61 && number<70){
            System.out.println("very doubtful");
        }
        else if (number>71 && number<80){
            System.out.println("You may rely on it");
        }
        else if (number>81 && number<90){
            System.out.println("My sources say no");
        }
        else if (number>91 && number<100){
            System.out.println("Without a doubt");
        }
        else if (number == 0){
            System.out.println("Try again please");
        }

    }
}








