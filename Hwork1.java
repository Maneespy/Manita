public class Hwork1 {
    public static void main(String[] args) {
        NumberSystem numberSystemrobj = new NumberSystem();
        numberSystemrobj.calculateResult();
    }
}

class NumberSystem {
    private int a = 5;
    private int b = 4;
    private int c = 8;

    void calculateResult() {
        int greatestNumber;
        if (a > b && a > c) {
            greatestNumber = a;
        } else if (b > a && b > c) {
            greatestNumber = b;
        } else {
            greatestNumber = c;
        }
        System.out.println("The greatest number is: " + greatestNumber);
    }
}
