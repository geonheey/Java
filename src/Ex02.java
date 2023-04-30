import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        System.out.print("2자리수 정수를 입력하시오(10~99) >> ");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt(); //입력 받은 정수
        int rem = num % 11;
        if(rem == 0 && num != 0){
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        }else{
            System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
        }
        scanner.close();
    }
}
