package Algoritimos.isertionSort;

class InsertionSort {
    /*Implementation of Insertion Sort algorithm
    *Time complexity: 
    *   worst case --> O(n²)
    *   best case --> O(n)
    *
    *   In this case, O(n²) Should be expected
    */
    public static void main(String[] args) {

        int[] array = generateArray(100000);
        long start = System.currentTimeMillis();

        sort(array);
        System.out.println(System.currentTimeMillis() - start + " miliseconds");
    }
    public static void sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {

                if (array[j] < array [j - 1]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                } else {
                    break;
                }
            }
        }
    }
    public static int[] generateArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        } 
        //shufle array
        for (int i = 0; i < array.length; i++) {
            int random = (int) Math.floor(Math.random() * array.length);
            int temp = array[i];
            array[i] = array[random];
            array[random] = temp;
        }
        return array;
    }
}