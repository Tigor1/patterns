package patterns.structural.composite;

public class CppDeveloper extends Team implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Cpp developer writes code...");
    }
}
