import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> integerList =  new ArrayList<>();

        System.out.print("List of how many integers ? ");

        int numbers = sc.nextInt();

        for (int i = 1; i <= numbers; i++){
            integerList.add(i);
        }

        System.out.println("Interger list:");
        System.out.println(integerList);

        sc.close();
    }
}