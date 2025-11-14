import java.util.Scanner;

public class BOJ_B4_14038_TS {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int win = 0;

        for (int i = 0; i < 6; i++) {
            char c = scann.nextLine().charAt(0);

            if(c == 'W') win++;
        }

        if(win >= 5) System.out.println(1);
        else if(win >= 3) System.out.println(2);
        else if(win >= 1) System.out.println(3);
        else System.out.println(-1);

    }
}
