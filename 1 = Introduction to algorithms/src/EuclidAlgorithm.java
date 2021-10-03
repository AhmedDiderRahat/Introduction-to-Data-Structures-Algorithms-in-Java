import java.util.Scanner;

public class EuclidAlgorithm {
    public static void main(String[] args) {
        EuclidAlgorithm algoObj = new EuclidAlgorithm();

        int m, n;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two number: ");

        int a = in.nextInt();
        int b  = in.nextInt();

        m = algoObj.largeNumber(a, b);
        n = algoObj.smallNumber(a, b);

        int gcd = algoObj.GCD_Implementation(m, n);

        System.out.println("The GCD is= " + gcd);
    }

    private int GCD_Implementation(int a, int b){
        if(a%b == 0)
            return b;

        int r = a%b;
        a = b;
        b = r;

        return GCD_Implementation(a, b);
    }

    private int largeNumber(int a, int b){
        if (a>b)
            return a;
        return b;
    }

    private int smallNumber(int a, int b){
        if (a<b)
            return a;
        return b;
    }
}
