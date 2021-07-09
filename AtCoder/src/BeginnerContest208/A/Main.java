package BeginnerContest208.A;

import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[]  scLine = sc.nextLine().split(" ");
        int numA = Integer.parseInt(scLine[0]);
        int numB = Integer.parseInt(scLine[1]);
        int Max = numA * 6;
        if(numB >= numA && numB <= Max){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
