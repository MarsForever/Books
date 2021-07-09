package BeginnerContest195;
import java.util.Scanner;

public class A_Health_M_Death {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 整数の入力
        // スペース区切りの整数の入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        if( b % a == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
