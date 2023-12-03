public class L1e_ArrayMoveZeroToEnd {

    public int[] moveZeros(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
        return arr;
    }

    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i< n; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    // Traverse the array, move non-zero elements to the front
    public static int[] moveZerosToEnd(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] array = {0, 2, 0, 4, 0, 1, 9, 0, 5};
       L1e_ArrayMoveZeroToEnd arr = new L1e_ArrayMoveZeroToEnd();
//        int[] newArr = arr.moveZeros(array);
        int[] newArr = moveZerosToEnd(array);


        arr.printArray(newArr);
    }
}
