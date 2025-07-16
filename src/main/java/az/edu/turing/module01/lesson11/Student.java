package az.edu.turing.module01.lesson11;

public class Student {
    private String name;
    private int age;
    private static int objectCount;

    public Student(String name, int age) {
        ++objectCount;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        if (this.age>17){
            this.name = name;
        }
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getCount(){
        return objectCount;
    }
    public static void setCount(int count) {
        objectCount = count;
    }

    public static int getObjectCount() {
        return objectCount;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
