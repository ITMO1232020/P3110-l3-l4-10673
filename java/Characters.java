import exceptions.CheckedException;
import interfaces.Nameable;

import java.util.Objects;

public class Characters implements Nameable {

    private String name;

    public Characters(String name) {
        if (name.matches(".*\\d+.*")){
            try {
                throw new CheckedException("Имя персонажа не может содержать цифр!");
            } catch (CheckedException e) {
                e.printStackTrace();
                this.name = "undefined";
            }
        } else
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Characters characters = (Characters) o;
        return Objects.equals(name, characters.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "MainChars{" +
                "name='" + name + '\'' +
                '}';
    }

}
