package Stream;

public class ExecuteOrder {

    RobotExample rob = new RobotExample();

    public String execute(String str){
        for (int i = 0; i < str.length(); i++) {
            switch (str){
                case "l":
                    rob.lower();
                    break;
                case "m":
                    rob.move();
                    break;
                case "p":
                    rob.pickup();
            }
        }
        return rob.getStore();
    }
}