public class L1_Array {
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i< n; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public void arrayDemo(){
        int[] myArray = new int[5];
        myArray[0] = 5;
        myArray[1] = 1;
        myArray[2] = 8;
        myArray[3] = 2;
        myArray[4] = 10;
        printArray(myArray);
        System.out.println();

    }

    public static void main(String[] args) {
        L1_Array array = new L1_Array();
        array.arrayDemo();
    }
}
