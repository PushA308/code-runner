package Arrays;

public class RotateArray {

    public static void rotateArray(int[] arr, int k){
        int size = arr.length;

        for (int i=0;i<k;i++){
            int lastElement = arr[size-1];
            for (int j=size-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = lastElement;
        }

        for (int i=0;i<size;i++){
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        rotateArray(arr, 2);
    }
}
