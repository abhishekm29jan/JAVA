package Arrays;

public class qs1 {
    public static void main(String[] args) {
        float [] arr = new float[5];
        arr[0] = 7.5f;
        arr[1] = 9.8f;
        arr[2] = 5.7f;
        arr[3] = 4.6f;
        arr[4] = 1.9f;
        float sum = 0f;
        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
            sum = sum+arr[i];
        }
        System.out.println("The total sum is " +sum);

    }
}
