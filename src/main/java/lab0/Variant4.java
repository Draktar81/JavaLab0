package lab0;

public class Variant4 {

    public int integerNumbersTask(int a, int b) {
        return  a / b;
    }

    public boolean booleanTask(int a, int b) {

        if (a > 2 && b > 3) return true;

        return false;
    }

    public int ifTask(int num1, int num2, int num3) {
        int result = 0;

        if (num1 > 0) result += 1;
        if (num2 > 0) result += 1;
        if (num3 > 0) result += 1;

        return result;
    }

    public double forTask(double n) {
        int[] kilograms = {1, 2, 10};
        double result = 0;

        for(int i = 0; i < kilograms.length; i++) {
            result += n * kilograms[i];
        }
        return result;
    }


    public boolean whileTask(int n) {
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

    public double[] arrayTask(int n, double a, double d) {
        double[] progression =  new double[n];

        for (int i = 0; i < n; i++) {
            progression[i] = a * Math.pow(d, i);
        }

        return progression;
    }


    public int caseTask(int n) {
        int result = 0;

        switch(n) {
            case 1:
                result = 31;
                break;
            case 2:
                result = 28;
                break;
            case 3:
                result = 31;
                break;
            case 4:
                result = 30;
                break;
            case 5:
                result = 31;
                break;
            case 6:
                result = 30;
                break;
            case 7:
                result = 31;
                break;
            case 8:
                result = 31;
                break;
            case 9:
                result = 30;
                break;
            case 10:
                result = 31;
                break;
            case 11:
                result = 30;
                break;
            case 12:
                result = 31;
                break;
        }
        return result;
    }

    public int[][] twoDimensionArrayTask(int m, int[] arr, int n) {
        int[][] matrix = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = arr[j];
            }
        }
        return matrix;
    }

    public static void main(String... strings) {
        System.out.println("Start of zero lab");
        System.out.println("Done!!!");
    }

}
