package patterns.behavioral.state;

public class ConcreteStateA extends State {

        public void Handle1() {
                System.out.println("ConcreteStateA handles request1.");
                System.out.println("ConcreteStateA wants to change the state of the context.");
                this.context.TransitionTo(new ConcreteStateB());
        }

        public  void Handle2() {
                System.out.println("ConcreteStateA handles request2.");
        }
}
