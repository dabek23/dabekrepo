package Stream;

public class RobotMain {

    public static void main(String[] args) {

        String command = ("M PPP $$%P%$24052mm9weffrgaFNONmmmV#($$(^$)@^ ER l");
        CommandCompilator processedCommand = new CommandCompilator();
        ExecuteOrder doIt = new ExecuteOrder();
        doIt.execute(processedCommand.compileCommand(command));
        RobotExample finalRobot = new RobotExample();
        System.out.println(finalRobot.getStore());

    }
}
