import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int arrSizeX = 5;
        final int arrSizeY = 5;
        Integer[][] arr = new Integer[arrSizeY][arrSizeX];

        for (int y = 0; y < arrSizeY ; y++) {
            for (int x = 0; x <arrSizeX ; x++) {
                arr[y][x] = new Random().nextInt(5-1) + 1;
                System.out.print(arr[y][x] + ", ");
            }
            System.out.println("");
        }

        System.out.println(Main.<Integer>biggestArraySum(arr));



    }

    public static <T extends Number> int biggestArraySum(T[][] arr){
        int selectedArrSum = 0;
        for (T[] l: arr) {
            int sum = 0;
            for (int i = 0; i < l.length; i++) {
                sum += (int)l[0];
            }
            if(selectedArrSum < sum) selectedArrSum = sum;
        }
        return selectedArrSum;
    }
    public static <T extends Number> int biggestArraySum2(T[][] arr){
        long[] sums = new long[arr.length];
        for (int y = 0; y < arr.length ; y++) {
            long sum = 0;
            for (int x = 0; x < arr[y].length ; x++) {
                sum += arr[y][x];
            }
            System.out.println("");
        }
    }
}