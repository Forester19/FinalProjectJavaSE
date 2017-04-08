package plane.company.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Владислав on 08.04.2017.
 * @author Владислав
 * @version 1.0
 *
 * Class hendler console what reads interval of fuel params
 */
public class ConsoleHelper {
    private int interval1;
    private int interval2;

    /**
     * Constructor ones starting read method
     */
    public ConsoleHelper() {
        try {
            readConsole();
        } catch (IOException e) {
            System.out.println("Enter correct interval!!!");
        }
    }

    /**
     * @throws IOException
     *
     * Method reads interval of fuel
     */
    private void readConsole() throws IOException {
        System.out.println("Enter interval for fuel consumption : ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        interval1 = Integer.parseInt(bufferedReader.readLine());
        interval2 = Integer.parseInt(bufferedReader.readLine());
    }

    public int getInterval1() {
        return interval1;
    }

    public void setInterval1(int interval1) {
        this.interval1 = interval1;
    }

    public int getInterval2() {
        return interval2;
    }

    public void setInterval2(int interval2) {
        this.interval2 = interval2;
    }
}
