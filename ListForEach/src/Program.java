import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {

        List<String> productsList = new ArrayList<>();

        productsList.add("Phone");
        productsList.add("TV");
        productsList.add("Tablet");
        productsList.add("Notebook");

        productsList.forEach(System.out::println);

//        productsList.forEach(products -> {
//            System.out.println(products);
//        });

//        productsList.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String products) {
//                System.out.println(products);
//            }
//        });
    }
}