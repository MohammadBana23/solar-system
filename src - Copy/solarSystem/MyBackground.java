package solarSystem;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class MyBackground {
    private Pane _background;
    public MyBackground() {
        _background = new Pane();
        Image img = new Image("file:dark-space-4.jpg");
        ImageView Iv = new ImageView(img);
        _background.getChildren().add(Iv);
    }
    public Pane setBackground(){
        return _background;
    }
}
