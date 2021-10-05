public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();

        int[] numbers = {10, 2, 8, 6, 7, 3};
        insertionSort.arrayPrint(insertionSort.insertionSortImplementation(numbers));
    }

    private void arrayPrint(int[] data){
        System.out.print("The sorted array is: ");
        for (int datum : data) {
            System.out.print(datum + " ");
        }
    }

    private int[] insertionSortImplementation(int[] data){
        int size = data.length;

        int temp, j;

        for (int i=0; i<size; i++){

            temp = data[i];
            j = i-1;

            while(j >= 0 && data[j] > temp){
                data[j+1] = data[j];
                j--;
            }

            data[j+1] = temp;
        }

        return data;
    }
}
