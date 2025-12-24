package az.edu.turing.module01.lesson19;

public class Box <T,B,D>{

    private T[] item1;
    private B[] item2;
    private D[] item3;

    public Box(T[] item1,B[] item2,D[] item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }
}
