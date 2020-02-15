package hw01;

import java.util.Scanner;

public class hw01 {
    public static void main(String[] args) {
        int r;
        int r1;
        String name;

        Scanner in = new Scanner(System.in);
        System.out.println("Name: ");
        name = in.nextLine();

        System.out.println("Let the game begin!");

        r = (int)(Math.random()*100+1);

        Scanner ran = new Scanner(System.in);

        do {
            r1 = ran.nextInt();
            if(r1 < r){
                System.out.println("Your number is too small. Please, try again.");
                }
            else if(r1 > r) {
                    System.out.println("Your number is too big. Please, try again.");
                }
            else{
                    System.out.printf("Congratulations, %s\n !", name);
                }
        }while(r1!=r);

    }
}
