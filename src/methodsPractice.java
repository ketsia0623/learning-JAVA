public class methodsPractice {
    public static void main(String[] args) {
        short s1 = 1, s2 = 2;
        int sum = calculate(s1, s2);
        System.out.println("The result is " + sum);
    }

    static int calculate(short... args) {
        System.out.println("Calculating the sum of two short arguments");
        return args[0] + args[1];
    }

    static int calculate(Short arg1, Short arg2) {
        System.out.println("Calculating the sum of two Short arguments");
        return Short.valueOf(arg1) + Short.valueOf(arg2);
    }

    static int calculate(int arg1, int arg2) {
        System.out.println("Calculating the sum of two int arguments");
        return arg1 + arg2;
    }

    static int calculate(long arg1, long arg2) {
        System.out.println("Calculating the sum of two long arguments");
        return (int) (arg1 + arg2);
    }
}
