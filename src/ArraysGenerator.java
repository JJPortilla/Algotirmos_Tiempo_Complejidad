import java.util.Random;

public class ArraysGenerator {
    long seed =1;
    public int[] randomArray(int n) {
    Random random = new Random(seed); //

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }
    public int [] randomArray(int n, boolean newRandom){
        seed=System.currentTimeMillis();
        return this.randomArray(n);
    }
}
