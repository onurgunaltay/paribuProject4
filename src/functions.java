


public class functions {
    static int power(int base, int exp){
        int result = 1;

        for (int i = 1; i<=exp; i++){
            result *=base;
        }
        return result;
    }
    public static void main(String[] args) {
        // f(x) = 2x + 5
        // f(x,y,z) = 3x + 2y + 5z

        int n1 = 2, n2=3;
        int case1 = power(n1,n2);
        System.out.println(case1);

    }
}
