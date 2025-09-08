public class Multiples2 {
    public static void main(String[] args) {
        int count = getCount(3,5,1000);
        System.out.println("Total number of non-negative multiples of 3 or 5 below 1000:  " + count);
    }

    private static int getCount(int a, int b, int n) {
        int count = 0;
        int i =1;
        while(i < n){
            if (i % a == 0 || i % b == 0){
                count++;
            }
            i++;
        }
        return count;
    }

    public static int getCOunt() {
        return getCount(1000, 3, 5);
    }
}
