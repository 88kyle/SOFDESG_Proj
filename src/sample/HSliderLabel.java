package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;

class HSliderLabel extends HBox {
    private Slider slider;
    private Label dLabel;
    private Label label;
    private Label number;
    private double sliderVal;

    HSliderLabel(String text, int count){
        label = new Label(text);
        dLabel = new Label("\t"+"0.0");
        number = new Label(count + ". ");
        slider = new Slider(0.0d, 10.0d, 0.0d);
        sliderVal = 0.0d;
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            sliderVal = Math.round(newValue.doubleValue()*100.0) / 100.0;
            dLabel.setText("\t" + sliderVal);
        });
        /*
        slider.setOnDragDropped(event -> {
            sliderVal = slider.getValue();
            dLabel.setText("\t"+sliderVal);
        });
         */
        this.getChildren().addAll(number, label, dLabel, slider);
    }




}
