package BeginnerContest208.B_FactorialYenCoin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numP = sc.nextInt();
        int num1 = 1;
        int num2 = 2;
        int num3 = 6;
        int num4 = 24;
        int num5 = 120;
        int num6 = 720;
        int num7 = 5040;
        int num8 = 40320;
        int num9 = 362880;
        int num10 = 3628800;
        int count = 0;
        while( numP != 0){
            if(numP < num2){
                numP = numP -num1;
                count++;
            }else if(numP >= num2 && numP < num3){
                numP = numP -num2;
                count++;
            }else if(numP >= num3 && numP < num4){
                numP = numP -num3;
                count++;
            }else if(numP >= num4 && numP < num5){
                numP = numP -num4;
                count++;
            }else if(numP >= num5 && numP < num6){
                numP = numP -num5;
                count++;
            }else if(numP >= num6 && numP < num7){
                numP = numP -num6;
                count++;
            }else if(numP >= num7 && numP < num8){
                numP = numP -num7;
                count++;
            }else if(numP >= num8 && numP < num9){
                numP = numP -num8;
                count++;
            }else if(numP >= num9 && numP < num10){
                numP = numP -num9;
                count++;
            }else{
                numP = numP -num10;
                count++;
            }
        }
        System.out.println(count);
    }
}
