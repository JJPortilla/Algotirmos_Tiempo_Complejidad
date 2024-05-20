public class Sorts {
    public void sortBubblePro(int[] arr) {
        long start = System.nanoTime();

        int[] array = arr.clone();
        int n = array.length;// limitamos a los elementos que ya estan ordenados
        boolean change;

        for (int i = 0; i <= n; i++) {
            change = false;
            for (int j = 1; j < n; j++) {

                if (array[j] < array[j - 1]) {
                    // hacemos un intercambio
                    int aux = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = aux;
                    change = true;
                }

            }
            n -= 1;
            if (!change) {
                break;
            }
        }
        long end = System.nanoTime();
        double time = (double) (end - start) / 1000000000;
        String sTime = String.format("%.10f", time);
        System.out.println("Mediante bubble sort " + array.length + " con tiempo " + sTime);

    }

    public void sortSelection(int arr[]) {
        long start = System.nanoTime();

        int[] array = arr.clone();

        for (int i = 0; i < array.length - 1; i++) {
            int indexM = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[indexM]) {
                    indexM = j;
                }
            }

            int aux = array[i];
            array[i] = array[indexM];
            array[indexM] = aux;

        }
        long end = System.nanoTime();
        double time = (double) (end - start) / 1000000000;
        String sTime = String.format("%.10f", time);
        System.out.println("Mediante selection sort " + array.length + " con tiempo " + sTime);

    }

    public void sortInsertion(int[] arr) {
        long start = System.nanoTime();

        int[] array = arr.clone();
        for (int i = 1; i < array.length; i++) {
            int elemento = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > elemento) {
                array[j + 1] = array[j];

                j--;

            }

            array[j + 1] = elemento;
        }
        long end = System.nanoTime();
        double time = (double) (end - start) / 1000000000;
        String sTime = String.format("%.10f", time);
        System.out.println("Mediante insertion sort " + array.length + " con tiempo " + sTime);

   }
 }        
        
        


