public class L1a_ArrayPractice {

    public int[] removeEvenArray(int[] arr){
        int count = 0;
        for (int i = 0; i< arr.length; i++){
            if(arr[i] % 2 != 0){
                count++;
            }
        }
        int[] result = new int[count];
        int indx = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                result[indx] = arr[i];
                indx++;
            }
        }
        return result;
    }

    public void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {3,2,4,7,10,6,5};
        L1a_ArrayPractice arr = new L1a_ArrayPractice();
        arr.printArray(array);
        int[] newArr = arr.removeEvenArray(array);
        arr.printArray(newArr);
    }
}
