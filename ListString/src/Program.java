import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Matheus");
        list.add("Eric");
        list.add("Lucca");
        list.add("Pedro");
        list.add("Felipe");
        list.add("Eduardo");
        list.add("Marcela");
        list.add("Luiza");
        list.add("Marcos");

        System.out.println("Names list:");

        for (String names : list){
            System.out.println(names);
        }

        System.out.println("--------------------------------");
        System.out.println("List size: " + list.size());
        System.out.println("--------------------------------");
        System.out.println("Index of Pedro: " + list.indexOf("Pedro"));
        System.out.println("--------------------------------");

//        list.remove(4);
        list.removeIf(name -> name.charAt(0) == 'E');

        System.out.println("Updating list:");

        for (String names : list){
            System.out.println(names);
        }

        System.out.println("--------------------------------");
        System.out.println("Name(s) with the first letter M:");

        List<String> listFirstLetterM = list.stream().
                filter(name -> name.charAt(0) == 'M').
                collect(Collectors.toList());

        for (String names : listFirstLetterM){
            System.out.println(names);
        }

        System.out.println("--------------------------------");
        System.out.println("First name with the letter L:");
        String findFirstName = list.stream().filter(name -> name.charAt(0) == 'L').findFirst().orElse(null);
        System.out.println(findFirstName);
    }
}