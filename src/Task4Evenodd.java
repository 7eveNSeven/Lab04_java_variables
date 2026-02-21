public class Task4Evenodd
{ public static void main(String[] args) {

    int numToExamine = 13;
    int remainder;

    remainder = numToExamine % 2;

    System.out.println("=== Even / Odd Checker ===");
    System.out.println("Number examined: " + numToExamine);

    System.out.println(numToExamine + " is ODD   (remainder when divided by 2 is " + remainder + ")");
}
}
