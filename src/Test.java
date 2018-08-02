import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int[] tab = new int[10];

        int turn = 10;

        for (int i = 0; i < tab.length * 2; i++) {
            if (i < tab.length){
                tab[i] = random.nextInt(1000);
                System.out.print(tab[i] + ", ");
            }else {
                System.out.print(tab[turn-1] + ", ");
                turn--;
            }

        }
    }
}
