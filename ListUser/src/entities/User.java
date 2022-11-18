package entities;

public class User {

    private String name;
    private Integer idade;

    public User() {

    }

    public User(String name, Integer idade) {
        this.name = name;
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                '}';
    }
}