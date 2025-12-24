package az.edu.turing.module01.lesson19;

import java.util.ArrayList;

public class BoxApp {
    public static void main(String[] args) {
           //public class Box< T   ,   B    ,  D >

        Box<Pencil,Ball,Double> box = new Box<>(new Pencil[]{new Pencil(), new Pencil(), new Pencil()},new Ball[]{new Ball(), new Ball(), new Ball()},new Double[]{1.0, 2.0, 3.0});
        Box<Integer,Integer,Double> box1 = new Box<>(new Integer[]{4,5,6},new Integer[]{1, 2, 3},new Double[]{1.0, 2.0, 3.0});
        Box<Ball,Integer,Double> ballBox = new Box<>(new Ball[]{new Ball(), new Ball(), new Ball()},new Integer[]{1, 2, 3},new Double[]{1.0, 2.0, 3.0});
        Box<Pencil,Integer,Double> pencilBox = new Box<>(new Pencil[]{new Pencil(), new Pencil(), new Pencil()},new Integer[]{1, 2, 3},new Double[]{1.0, 2.0, 3.0});
    }


    public static void boxCheck(Box<Ball,Integer,Double> box){
        System.out.println(box);
    }
}


// abstract class Box<T ,E> {

// interface material<D>

// class boxObj<T,E,D,F> 5 ferqli obyekt