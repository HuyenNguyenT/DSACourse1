public class L1d_ArraySecondMax {

    public int findSecondMax(int[] arr){
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements");
            return -1; // Return a suitable value or throw an exception
        }
        int max = arr[0];
        int secondMax = arr[0];
        for(int i = 1; i < arr.length; i ++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if(arr[i] > secondMax && arr[i] !=max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] array = {1,6,5,1};
        L1d_ArraySecondMax arr = new L1d_ArraySecondMax();
        int secondMax = arr.findSecondMax(array);
        System.out.println(secondMax);
    }
}
