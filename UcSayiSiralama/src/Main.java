import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2,num3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("1.sayıyı girin");
        num1= scanner.nextInt();
        System.out.println("2.sayıyı girin");
        num2= scanner.nextInt();
        System.out.println("3.sayıyı girin");
        num3= scanner.nextInt();

        if ((num1>num2)&&(num1>num3)){
            if (num3<num2) {
                System.out.println("num1>num2>num3");
            }else{
                System.out.println("num1>num3>num3");
            }
        } else if ((num2>num1)&&(num2>num3)) {
            if (num3>num1){
                System.out.println("num2>num3>num1");
            }else {
                System.out.println("num2>num1>num3");
            }
        }else {
            if (num2>num1){
                System.out.println("num3>num2>num1");
            }else {
                System.out.println("num3>num1>num2");
            }
        }
    }
}