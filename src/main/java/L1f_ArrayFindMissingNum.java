public class L1f_ArrayFindMissingNum {

    public static int findMissingNumer(int[] arr){
        int n = arr.length +1;
        int expectedSum = n*(n+1)/2;

        for(int i : arr){
            expectedSum = expectedSum - i;
        }
        return expectedSum;
    }

    public static void main(String[] args) {
        int[] array = {7, 2, 8, 4,  1, 9, 6, 5};
        L1f_ArrayFindMissingNum arr = new L1f_ArrayFindMissingNum();
        int b =arr.findMissingNumer(array);
        System.out.println(b);
    }
}
