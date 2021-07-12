public class HomeworkApp {
    public static void main(String[] args) {
        System.out.println(checkSum(1,1));
        checkSign(-1);
        System.out.println(isNegative(-2));
    }
    private static boolean checkSum(int a,int b)
    {
        return a+b>=10 && a+b<=20;
    }
    private static void checkSign(int a)
    {
        if (a>=0)
            System.out.println(a + " is positive");
        else
            System.out.println(a + " is negative");
    }
    private static boolean isNegative(int a)
    {
        return a<0;
    }
}
