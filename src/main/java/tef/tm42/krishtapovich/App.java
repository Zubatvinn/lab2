package tef.tm42.krishtapovich;
import java.util.Scanner;
import java.util.Random;

public class App 
{
    public static void main(String[] args) {
        Random random = new Random();
        int x = 0;
        int y = 100;
        int numSet = random.nextInt(y);
        int numGuess;
        int tries=0;
        Scanner sc = new Scanner(System.in);
        // System.out.println(numSet);
        System.out.println("Угадайте число от " + x + " до " + y  );
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Это даже не число!");
                sc.next();
            }
            numGuess = sc.nextInt();
            if(numGuess>x && numGuess<numSet)
            {System.out.println("Загаданное число больше");
                x = numGuess;}
            else if(numGuess<x)
            {System.out.println("Не попали в диапазон, попробуйте число побольше");}
            if(numGuess<y && numGuess>numSet)
            {System.out.println("Загаданное число меньше");
                y = numGuess;}
            else if(numGuess>y)
            {System.out.println("Не попали в диапазон, попробуйте число поменьше");}
            tries++;
        } while (numGuess != numSet);
        System.out.println("Отлично, вы угадали число " + numSet + "\nПопыток : " + tries+ "\nТочность : " + 100/tries + " %");

    }
}