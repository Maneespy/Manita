public class Hwork2 {
    public static void main(String[] args)
    {
     CalculateInterest calculateInterestobj = new CalculateInterest();
     calculateInterestobj.calculation(5000,5,16);
     calculateInterestobj.simpleInterest();
     calculateInterestobj.compoundInterest();
     double sinterest = calculateInterestobj.simpleInterest();
        System.out.println("Simple interest is "+sinterest);
        double cinterest = calculateInterestobj.compoundInterest();
        System.out.println("Compound interest is "+cinterest);
        calculateInterestobj.print();
    }
}
class CalculateInterest
{
    private int principal;
    private int time;
    private int rate;

    void calculation (int a, int b, int c)
    {
        System.out.println("Interest");
        principal = a;
        time = b;
        rate = c;
        simpleInterest();
        compoundInterest();
    }
    void print ()
    {
        System.out.println("Principal :"+principal);
        System.out.println("Time :"+time);
        System.out.println("Rate :"+rate);

    }
    double simpleInterest()
    {
        return (principal*time*rate)/100;
    }
    double compoundInterest()
    {
        return principal*Math.pow((1+rate/100),time);
    }
}

