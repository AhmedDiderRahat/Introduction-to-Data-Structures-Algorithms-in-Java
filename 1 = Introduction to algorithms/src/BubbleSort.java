public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        int[] numbers = {3, 2, 5, 4, 7, 1};

        bubbleSort.arrayPrint(bubbleSort.bubbleSortImplementation(numbers));
    }

    private int[] bubbleSortImplementation(int[] numbers){
        int size = numbers.length;

        for(int i=0; i<size-1; i++){
            for(int j=0; j<(size-i-1); j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        return numbers;
    }

    private void arrayPrint(int[] numbers){
        System.out.print("The sorted array: ");

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
