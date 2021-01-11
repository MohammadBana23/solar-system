package solarSystem;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Font;
import javafx.scene.control.Button;
import java.awt.*;
import java.util.ArrayList;

public class MyList {
    private VBox MyPlanet;
    private VBox _planetName;
    private VBox _planetInfo;
    private Pane[] MyShape=new Pane[8];
    private HBox[] planetClick = new HBox[8];
    private String[] nameOfPlanet = new String[8];
    private Button[] button = new Button[8];
    private Label[] _label = new Label[6];
    private HBox _Information = new HBox;
    private String[] _infoPlanet = new String[6];
    private VBox _Right;
    private VBox _Left;

    public MyList(){
        nameOfPlanet[0]="Mercury";
        nameOfPlanet[1]="Venus";
        nameOfPlanet[2]="Earth";
        nameOfPlanet[3]="Mars";
        nameOfPlanet[4]="Jupiter";
        nameOfPlanet[5]="Saturn";
        nameOfPlanet[6]="Uranus";
        nameOfPlanet[7]="Neptune";

        MyPlanet = new VBox();
        _planetName = new VBox();
        _planetInfo = new VBox();
        MyPlanet.setPrefSize(350,Double.MAX_VALUE);
        _planetName.setPrefSize(350,600);
        _planetInfo.setPrefSize(350,400);
//        MyPlanet.setBorder(new Border(new BorderStroke(Color.GOLD,BorderStrokeStyle.SOLID
//                ,new CornerRadii(10),BorderWidths.DEFAULT)));
//        _planetName.setBorder(new Border(new BorderStroke(Color.RED,BorderStrokeStyle.SOLID
//                ,new CornerRadii(10),BorderWidths.DEFAULT)));
//        _planetInfo.setBorder(new Border(new BorderStroke(Color.ORANGE,BorderStrokeStyle.SOLID
//                ,new CornerRadii(10),BorderWidths.DEFAULT)));
        Label name = new Label("My Planet");
        name.setFont(Font.font(40));
        name.setTextFill(Color.WHITE);
        name.setPrefSize(350,10);
//        name.setBorder(new Border(new BorderStroke(Color.GREEN,BorderStrokeStyle.SOLID
//                ,new CornerRadii(10),BorderWidths.DEFAULT)));
        name.setAlignment(Pos.CENTER);
        MyPlanet.getChildren().add(name);
        MyPlanet.getChildren().add(_planetName);
        MyPlanet.getChildren().add(_planetInfo);
        planetList planetList = new planetList();

        _label[0] = new Label("Mass");
        _label[1] = new Label("Mean Radius");
        _label[2] = new Label("Semi-Major Axis");
        _label[3] = new Label("Orbital Period");
        _label[4] = new Label("Rotation");
        _label[5] = new Label("Number of Moons");
        _Left = new VBox();
        _Left.getChildren().addAll(_label);


            _Information = new HBox();
            _Information.getChildren().addAll(_Left);
            _Left.setAlignment(Pos.CENTER_RIGHT);

            for (int i = 0; i < 8; i++) {
                MyShape[i] = new Pane();
                MyShape[i].getChildren().add(planetList.getPlanetsList()[i]);
                planetClick[i] = new HBox();
                planetClick[i].setPrefSize(350, 74);
                MyShape[i].setPrefSize(150, 74);
                Label label = new Label("", planetList.getPlanetsList()[i]);
                label.setPrefSize(150, 74);
                label.setAlignment(Pos.CENTER);
                label.setTextFill(Color.BLUEVIOLET);
                MyShape[i].getChildren().add(label);
                button[i] = new Button(nameOfPlanet[i]);
                button[i].setFont(new Font(25));
                button[i].setTextFill(Color.WHITE);
                button[i].setPrefSize(200, 74);
                button[i].setBackground(Background.EMPTY);
                button[i].setAlignment(Pos.CENTER_LEFT);
                planetClick[i].getChildren().add(MyShape[i]);
                planetClick[i].getChildren().add(button[i]);
            }
            _planetName.getChildren().addAll(planetClick);
            _planetInfo.getChildren().addAll(_Information);
        }


    public VBox get_planetName() {
        return MyPlanet;
    }
}