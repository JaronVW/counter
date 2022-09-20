import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int arrSizeX = 5;
        final int arrSizeY = 5;
        Integer[][] arr = new Integer[arrSizeY][arrSizeX];

        for (int y = 0; y < arrSizeY ; y++) {
            for (int x = 0; x <arrSizeX ; x++) {
                arr[y][x] = new Random().nextInt(10000-1) + 1;
                System.out.print(arr[y][x] + ", ");
            }
            System.out.println("");
        }

        System.out.println(Main.<Integer>biggestArraySum2(arr));



    }

    public static <T extends Number> int biggestArraySum(T[][] arr){
        int selectedArrSum = 0;
        for (T[] l: arr) {
            int sum = 0;
            for (int i = 0; i < l.length; i++) {
                sum += (int)l[i];
            }
            if(selectedArrSum < sum) selectedArrSum = sum;
        }
        return selectedArrSum;
    }
    public static <T extends Number> int biggestArraySum2(T[][] arr){
        int[] sums = new int[arr.length];
        for (int y = 0; y < arr.length ; y++) {
            int sum = 0;
            for (int x = 0; x < arr[y].length ; x++) {
                sum += (int) arr[y][x];

            }
            sums[y] = sum;
            System.out.println("- " + sum);
        }
        int selectedArrSum = 0;
        int highestIndex = -1;
        for (int i = 0;i< sums.length; i++) {
            if(selectedArrSum < sums[i]) {
                selectedArrSum = sums[i];
                highestIndex =i;
            }
        }
        return highestIndex;

    }
}