package W04;

public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println("Test");
    }

    void print(String toPrint) {
        System.out.println(toPrint);
    }


    int print(int i) {
        System.out.println(i);
        return i;
    }
}
