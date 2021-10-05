public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();

        int[] numbers = {10, 2, 8, 6, 7, 3};
        selectionSort.arrayPrint(selectionSort.selectionSortImplementation(numbers));
    }

    private void arrayPrint(int[] data){
        System.out.print("\nThe sorted array is: ");
        for (int datum : data) {
            System.out.print(datum + " ");
        }
    }

    private int[] selectionSortImplementation(int[] data){
        int size = data.length;

        int temp;

        for (int i=0; i<size-1; i++){

            int minimumIndex = i;

            for (int j=i+1; j<size; j++){
                if (data[minimumIndex] > data[j])
                    minimumIndex = j;
            }

            temp = data[minimumIndex];
            data[minimumIndex] = data[i];
            data[i] = temp;
        }

        return data;
    }
}
