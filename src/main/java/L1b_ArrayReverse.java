public class L1b_ArrayReverse {

    //This method required memory for creating new array int [] reverseArr
    public int[] reverseArray(int[] arr){
        int [] reverseArr = new int[arr.length];
        int j = 0;
        for(int i = arr.length -1; i >= 0; i--){
            reverseArr[j] = arr[i];
            j++;
        }
       return reverseArr;
    }

    // This method uses in-place reversal techniques,
    // doesn't initiate new array, not required memory
    public int[] reverseArrayInPlace(int[] arr){
        int i = 0;
        int temp = 0;
        int j = arr.length -1;
        while(i <= j){
           temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i ++;
           j --;
        }
        return arr;
    }

    public void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {4,7,10,6,5,9};
        L1b_ArrayReverse arr = new L1b_ArrayReverse();
//        arr.printArray(array);
//        int[] newArr = arr.reverseArray(array);
//        arr.printArray(newArr);
        int[] newArrinPlace = arr.reverseArrayInPlace(array);
        arr.printArray(newArrinPlace);
    }
}
