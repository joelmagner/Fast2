import IO.JsonHandler;
import Tasks.Task1;
import Tasks.Task2;
import Tasks.Task3;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, List<String>> json = JsonHandler.readJson("C:\\Users\\A551297\\Desktop\\untitled\\assets\\names.json");
        Task1 task1 = new Task1(json);
        task1.solve();
        Task2 task2 = new Task2();
        task2.solve();
        Task3 task3 = new Task3();
        task3.solve();
    }
}
