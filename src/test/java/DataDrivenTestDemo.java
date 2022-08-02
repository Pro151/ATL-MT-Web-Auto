package test.java;
import java.io.IOException;
import java.util.ArrayList;

public class DataDrivenTestDemo {

    public static void main(String[] args) throws IOException {

        DataDrivenMethod dd = new DataDrivenMethod();
        ArrayList data = dd.getData("Password_2\n");

        //System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));
    }
}
