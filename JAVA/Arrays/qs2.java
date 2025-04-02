package Arrays;

public class qs2 {
    public static void main(String[] args) {
        int [] arr = new int[5];
        int a = 52;
        arr[0] = 45;
        arr[1] = 52;
        arr[2] = 73;
        arr[3] = 21;
        arr[4] = 69;
        for(int i = 0; i< arr.length; i++) {
            if(a == arr[i]) {
                System.out.println("Element found");
                break;
            }
            System.out.println(arr[i]);
        }
    }
}
