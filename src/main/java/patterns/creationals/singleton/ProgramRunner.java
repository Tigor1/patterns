package patterns.creationals.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println(ProgramLogger.getPogectLogger());
        System.out.println(ProgramLogger.getPogectLogger());
        System.out.println(ProgramLogger.getPogectLogger());

        System.out.println("======================================");

        ProgramLogger.getPogectLogger().addLogInfo("First log....");
        ProgramLogger.getPogectLogger().addLogInfo("Second log....");
        ProgramLogger.getPogectLogger().addLogInfo("Third log....");

        ProgramLogger.getPogectLogger().showLogFile();
        System.out.println("======================================");
    }
}
