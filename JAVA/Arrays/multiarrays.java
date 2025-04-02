package Arrays;

public class multiarrays {
    public static void main(String[] args) {
        int [][] flats = new int [2][2];
        flats[0][0] = 89;
        flats [0][1] = 56;
        flats [1][0] = 43;
        flats [1][1] = 71;
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }   
    }
}
