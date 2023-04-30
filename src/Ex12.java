import java.util.*;
public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("연산>>");
        int num1 = scanner.nextInt(); //입력 받은 정수1
        String opt = scanner.next(); //입력 받은 연산자
        int num2 = scanner.nextInt();//입력 받은 정수2

        switch(opt) {
            case "+":
                System.out.println(num1 + opt + num2 + "의 계산 결과는 " + (num1+num2));
                break;
            case "-":
                System.out.println(num1 + opt + num2 + "의 계산 결과는 " + (num1-num2));
                break;
            case "*":
                System.out.println(num1 + opt + num2 + "의 계산 결과는 " + (num1*num2));
                break;
            case "/":
                if(num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                else {
                    System.out.println(num1 + opt + num2 + "의 계산 결과는 " + (num1/num2));
                }
                break;
            default:
                System.out.println("식을 잘못 입력했습니다.");
                break;
        }
        scanner.close();
    }
}
