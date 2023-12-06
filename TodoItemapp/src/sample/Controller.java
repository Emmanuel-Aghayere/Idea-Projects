package sample;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;
import  sample.datamodel.TodoItem;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    @FXML
    private List<TodoItem> todoItems;

    @FXML
    private ListView<TodoItem> todoListView;

    @FXML
    private TextArea itemDetailsTextArea;
    @FXML
    private Label deadlineLabel;
    public void initialize(){
        TodoItem item1 = new TodoItem("Study","Study for Java 2", LocalDate.of(2022, Month.SEPTEMBER,22));
        TodoItem item2 = new TodoItem("Drink Whiskey","Drink whiskey at Happy hour",LocalDate.of(2022,9,22));
        TodoItem item3 = new TodoItem("Walk Dog","Taking my cute dog for a nice walk", LocalDate.of(2022,9,22));
        TodoItem item4 = new TodoItem("Sleep Time","Getting a goodnight sleep",LocalDate.of(2022,9,22));
        TodoItem item5 = new TodoItem("Wake up","Wake up to see the sunrise",LocalDate.of(2022,9,22));
        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);


    }
    public void handleMouseClick(){
        TodoItem item=  todoListView.getSelectionModel().getSelectedItem();
       // System.out.println(item + " is selected");
       itemDetailsTextArea.setText(item.getDetails());
       deadlineLabel.setText(item.getDeadline().toString());
        /*StringBuilder sb = new StringBuilder(item.getDetails());
        sb.append("\n\n\n\n");
        sb.append("Due: ");
        sb.append(item.getDeadline().toString());
        itemDetailsTextArea.setText(sb.toString());*/
    }

}
