/**
 * lambda
 */
@FunctionalInterface
/**
 * Innerlambda
 */
public interface Innerlambda {
    void show();
}

public class lambda implements Innerlambda {

    // @Override
    // public void show() {
    // System.out.println("Wassip");
    // }
    // instead of doing this we can do simple thing like lambda

    public static void main(String[] args) {
        Innerlambda a = () -> {
            System.out.println("in A");
        };
        Innerlambda b = () -> System.out.println("Using lamba in b"); // this also works
        a.show();
        b.show();
    }
}