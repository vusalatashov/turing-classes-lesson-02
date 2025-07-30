package az.edu.turing.module01.lesson16;

import java.util.Arrays;
import java.util.Objects;


public class Moon {
    private  int number=0;
    private Moons name=null;
    private  int[] days=null;


    public int getNumber() {
        return number;
    }

    public int[] getDays() {
        int[] copy=new int[days.length];
        System.out.println(days.length);
        for (int i = 0; i < days.length; i++) {
            copy[i]=days[i];
        }
        return copy;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Moon moon = (Moon) o;
        return number == moon.number && Objects.equals(name, moon.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }

    @Override
    public String toString() {

        return "Moon{" +
                "number=" + number +
                ", name=" + name +
                ", days=" + Arrays.toString(days) +
                '}';
    }
}
