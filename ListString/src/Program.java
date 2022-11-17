import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Matheus");
        list.add("Eric");
        list.add("Pedro");
        list.add("Felipe");
        list.add("Eduardo");

        for (String names : list){
            System.out.println(names);
        }

        System.out.println("---------------");
        list.remove(4);
        list.remove(2);

        for (String names : list){
            System.out.println(names);
        }
    }
}