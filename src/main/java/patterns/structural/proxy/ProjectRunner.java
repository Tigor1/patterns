package patterns.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
//        Project project = new RealProject("https://www.github.com/tigor/myProject");
        Project project = new ProxyProject("https://www.github.com/tigor/myProject");

//        project.run();
    }
}
