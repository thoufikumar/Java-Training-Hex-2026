class Main {
    public static void main(String[] args) {

        int a[] = {20, 25, 30, 15, 40, 35, 28, 22, 18, 32};
        int sum[] = new int[10];
        sum[0] = a[0];
        for (int i = 1; i < 10; i++) {
            sum[i] = sum[i - 1] + a[i];
        }
        
        int total = sum[6] - sum[1];
        System.out.println("Total attendance: " + total);

        int max = a[0];
        int day = 1;
        for (int i = 0; i < 10; i++) {
            if (a[i] > max) {
                max = a[i];
                day = i + 1;
            }
        }

        System.out.println("Highest attendance: " + max);
        System.out.println("Day: " + day);
    }
}