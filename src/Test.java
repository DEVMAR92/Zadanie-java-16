import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(tab));
        int turn;

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
            if (i == tab.length - 1) {
                for (int j = 0; j < tab.length; j++) {
                    turn = tab.length - j;
                    System.out.print(tab[turn - 1] + " ");
                }
            }
        }
    }
}
