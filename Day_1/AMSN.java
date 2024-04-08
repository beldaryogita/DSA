class AMSN {
    static int order(int num) {
        if (num == 0)
            return 0;
        return 1 + order(num / 10);
    }

    static int power(int base, int exponent) {
        if (exponent == 0)
            return 1;
        return base * power(base, exponent - 1);
    }

    static boolean amsn(int num, int len) {
        if (num == 0)
            return true;

        int digit = num % 10;
        return power(digit, len) + amsn(num / 10, len);
    }

    public static void main(String[] args) {
        int num = 407;
        int len = order(num);
        if (amsn(num, len))
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}
