public class L1c_ArrayMinimum {

    public static int getMinValueInArr(int[] arr)  {
        if(arr.length == 0 || arr == null){
            throw new IllegalArgumentException("Array is null or empty");
        }
        int minValue = arr[0];
        for (int i = 1 ; i < arr.length; i++){
            minValue = (minValue >= arr[i]) ? arr[i]: minValue;
        }
        return minValue;
    }

    public void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Minimum value in array : " + getMinValueInArr(arr));
    }

    public static void main(String[] args) {
        int[] array = {3,2,4,7,10,6,5,1};
        L1c_ArrayMinimum arr = new L1c_ArrayMinimum();
        arr.printArray(array);

    }

}
