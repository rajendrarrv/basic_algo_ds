package arrays2d;

public class PrintWave {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12},
                {13,14,15}
        };
        wave(arr);
    }

    private static void wave(int[][] arr) {
        int col = arr[0].length;
        for(int i=0;i<col;i++){
            if(i%2==0){
                for(int j=0;j<arr.length;j++){
                    System.out.print(arr[j][i]+ " ");
                }
            } else{
                for(int j= arr.length-1;j>=0;j--){
                    System.out.print(arr[j][i]+" ");
                }
            }
        }
    }
}
