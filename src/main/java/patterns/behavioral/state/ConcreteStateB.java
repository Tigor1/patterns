package patterns.behavioral.state;

public class ConcreteStateB extends State {


    public void Handle1() {
        System.out.println("ConcreteStateB handles request1.");
    }

    public void Handle2() {
        System.out.println("ConcreteStateB handles request2.");
        System.out.println("ConcreteStateB wants to change the state of the context.");
        this.context.TransitionTo(new ConcreteStateA());
    }
}
