package az.edu.turing.module01.lesson16;

public enum Moons {
    JANUARY("yanvar"),
    FEBRUARY("fevral");
    private final String name;

    Moons(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " "+name;
    }
}
