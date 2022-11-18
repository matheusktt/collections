package application;

import entities.User;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<User> listUser = new ArrayList<>();

        listUser.add(new User("Henrique", 18));
        listUser.add(new User("Mario", 25));
        listUser.add(new User("Luiza", 21));
        listUser.add(new User("Julia", 21));
        listUser.add(new User("Gabriel", 29));

        System.out.println("Users list");

        for (User users : listUser){
            System.out.println(users);
        }
    }
}