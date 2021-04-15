package patterns.behavioral.state;

class Context
{
    private State state = null;

    public Context(State state)
    {
        this.TransitionTo(state);
    }

    public void TransitionTo(State state)
    {
        System.out.println("Context: Transition to {state.GetType().Name}.");
        this.state = state;
        this.state.setContext(this);
    }

    public void Request1()
    {
        this.state.Handle1();
    }

    public void Request2()
    {
        this.state.Handle2();
    }
}

