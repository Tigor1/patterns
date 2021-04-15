package patterns.behavioral.state;

public abstract class State {
    protected Context context;

    public abstract void Handle1();

    public abstract void Handle2();

    public void setContext(Context context) {
        this.context = context;
    }
}
