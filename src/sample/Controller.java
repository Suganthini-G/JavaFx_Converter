package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label label;

    @FXML
    private TextField txt;


    @FXML
    void convertmeter(ActionEvent event) {
        if (txt.getText().isBlank()) {
            label.setText("Please enter your number");
        }
        else {
            try {
            double n1 = Double.parseDouble(txt.getText());
            double x = n1 * 1000;
            label.setText(x + " m");
        }
            catch(NumberFormatException exception){
            label.setText("Invalid input. Please enter a number");
        }
        }
    }

    @FXML
    void covertkilometer(ActionEvent event) {
            if (txt.getText().isBlank()){
                label.setText("Please enter your number");
            }
            else {
                try {
                double n1 = Double.parseDouble(txt.getText());
                double x = n1 / 1000;
                label.setText(x + " km");
                }
                catch(NumberFormatException exception){
                    label.setText("Invalid input. Please enter a number");
                }
            }
    }

    @FXML
    void volume(ActionEvent event) {
        if (txt.getText().isBlank()){
            label.setText("Please enter your number");
        }
        else {
            try {
            double n1 = Double.parseDouble(txt.getText());
            double x = (n1 * n1 * n1);
            label.setText("Volume is " + x);
        }
            catch(NumberFormatException exception){
            label.setText("Invalid input. Please enter a number");
        }
        }
    }

    @FXML
    void convertinr(ActionEvent event) {
        if (txt.getText().isBlank()){
            label.setText("Please enter your number");
        }
        else {
            try {
            double n1 = Double.parseDouble(txt.getText());
            double x = 0.37 * n1;
            label.setText("" + x);
        }
            catch(NumberFormatException exception){
            label.setText("Invalid input. Please enter a number");
        }
        }
    }

    @FXML
    void convertcelcius(ActionEvent event) {
        if (txt.getText().isBlank()){
            label.setText("Please enter your number");
        }
        else {
            try {
                double n1 = Double.parseDouble(txt.getText());
                double x = (((n1 - 32) * 5) / 9);
                label.setText("Temperature is " + x + "°C");
            }
            catch(NumberFormatException exception){
                label.setText("Invalid input. Please enter a number");
            }
        }
    }

    @FXML
    void convertfahrenhite(ActionEvent event) {
        if (txt.getText().isBlank()){
            label.setText("Please enter your number");
        }
        else {
            try {
            double n1 = Double.parseDouble(txt.getText());
            double x = ((9 * n1) / 5 + 32);
            label.setText("Temperature is " + x + "°F");
            }
            catch(NumberFormatException exception){
                label.setText("Invalid input. Please enter a number");
            }
        }
    }

    @FXML
    void clear(ActionEvent event) {
        txt.clear();
        label.setText("0");
    }

}
