package method;

public class Main {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();

        mo.overload();
        mo.overload(10);
        mo.overload("Hello");
        mo.overload(20, "World");
        mo.overload("Java", 30);
    }
}

