import org.example.Task;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TaskTest {
    private Task task;
    List<Task> taskList = new ArrayList<>();

    @Test
    public void addTask(){
        Task task = new Task("Task 1", "new task", "today");
        taskList.add(task);
        Task task1 = new Task("1", "2", "3");
        taskList.add(task1);
        Assert.assertEquals(2, taskList.size());

    }
}
