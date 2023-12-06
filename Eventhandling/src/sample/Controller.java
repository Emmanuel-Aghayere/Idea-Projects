package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField name;
    @FXML
    private Button bye;
    @FXML
    private Button hello;
    @FXML
    private CheckBox ourcheckbox;
    @FXML
    private Label ourLabel;
    @FXML
    public void ButtonClick(ActionEvent e){
        if (e.getSource().equals(hello)){
            System.out.println("Hello, " + name.getText());

        } else if (e.getSource().equals(bye)){
            System.out.println("bye, " + name.getText());
        }
        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {

                        }
                    };
                }

                    ourLabel.setText("Updated Label");
                }catch (InterruptedException event){

                }

            }
        };
        new Thread(task).start();


        System.out.println("The following button was pressed: "+ e.getSource());

    }
    public void handlingText(){
        String text = name.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
        hello.setDisable(disableButtons);
        bye.setDisable(disableButtons);

    }
    public void handleCheckbox(){
        System.out.println("The check box is"+(ourcheckbox.isSelected()? "Checked":"Not checked"));
    }
    public void initialize(){
        hello.setDisable(true);
        bye.setDisable(true);
    }
}
