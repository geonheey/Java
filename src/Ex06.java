import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        System.out.print("1~99 사이의 정수를 입력하시오 >> ");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt(); //입력 받은 정수
        int check = 0;


        if (num / 10 == 3 || num / 10 == 6 || num / 10 == 9) {
            check++; // 입력 받은 정수의 십의 자리가 3,6,9일때 check++
        }
        if (num % 10 == 3 || num % 10 == 6 || num % 10 == 9){
            check++; //입력 받은 정수의 일의 자리가 3,6,9일때 check++
        }

        if(check == 0){ // 입력 받은 정수에 3,6,9가 포함되지 않아 check++연산이 안된경우
            System.out.println("박수 치지 마세요 !");
        }
        else{
            if(check == 1){
                System.out.println("박수짝");
            }else{
                System.out.println("박수짝짝");
            }
        }
        scanner.close();
    }
}
