package se.lexicon;

public class Sikdar {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sikdar(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sikdar{" +
                "name='" + name + '\'' +
                '}';
    }
}
