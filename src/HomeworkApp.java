public class HomeworkApp {
    public static void main(String[] args) {
        System.out.println(checkSum(1,1)); // Task1
        checkSign(-1); //Task2
        System.out.println(isNegative(-2));//Task3
        printRepeated("Hello",2); // Task4
        System.out.println(isIntercalary(2000)); //Task5
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
    private static void printRepeated(String s , int n)
    {
        for (int i = 0;i<n;++i)
            System.out.println(s);
    }
    private static boolean isIntercalary(int a){
        return (a%4==0 && a%100!=0) || (a%400==0);
    }
}
