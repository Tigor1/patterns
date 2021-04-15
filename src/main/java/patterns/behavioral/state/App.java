package patterns.behavioral.state;

public class App {
    public static void main(String[] args) {

        var context = new Context(new ConcreteStateA());
        context.Request1();
        context.Request2();
    }
}
