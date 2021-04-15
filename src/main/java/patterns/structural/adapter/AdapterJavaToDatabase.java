package patterns.structural.adapter;

public class AdapterJavaToDatabase implements Database {
    private JavaApplication javaApplication;

    public AdapterJavaToDatabase(JavaApplication javaApplication) {
        this.javaApplication = javaApplication;
    }

    @Override
    public void insert() {
        javaApplication.saveObject();
    }

    @Override
    public void update() {
        javaApplication.updateObject();
    }

    @Override
    public void select() {
        javaApplication.loadObject();
    }

    @Override
    public void remove() {
        javaApplication.deleteObject();
    }
}
