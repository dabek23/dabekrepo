package Stream;

public class RobotExample {

    private int position = 0;
    private boolean hasProduct = false;
    private final int boxAmount = 9;
    private final int boxCapacity = 15;
    private int[] warehouse = new int[boxAmount];
    StringBuilder builder = new StringBuilder();

    public void pickup() {
        position = 0;
        hasProduct = true;
    }

    public void move() {
        if (position!=9) position++;
    }

    public void lower() {
        if (hasProduct==true && boxCapacity<15);
        warehouse[position]++;
    }
    public String getStore(){
        for (int i = 0; i < warehouse.length; i++) {
            builder.append(warehouse[i]).append(",");
        }
        return builder.toString();
    }
}