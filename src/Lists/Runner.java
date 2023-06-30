package Lists;

import java.util.LinkedList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();
        for (int i=0;i<5;i++){
            int number = input.nextInt();
            list.add(number);
        }
        System.out.println(list);

    }
}
