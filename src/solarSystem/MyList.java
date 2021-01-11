package solarSystem;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
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
    private Pane[] MyShape = new Pane[8];
    private HBox[] planetClick = new HBox[8];
    private String[] nameOfPlanet = new String[8];
    private Button[] MyClick = new Button[8];
    private Label[] _label = new Label[6];
    private Label[] info = new Label[6];
    private HBox _Information;
    private String[] _infoPlanet = new String[6];
    private VBox _Right;
    private VBox _Left;
    private ArrayList<Ellipse> orbitss;
    private Label label;

    public MyList(ArrayList<Ellipse> orbit) {
        orbitss = orbit;

        nameOfPlanet[0] = "Mercury";
        nameOfPlanet[1] = "Venus";
        nameOfPlanet[2] = "Earth";
        nameOfPlanet[3] = "Mars";
        nameOfPlanet[4] = "Jupiter";
        nameOfPlanet[5] = "Saturn";
        nameOfPlanet[6] = "Uranus";
        nameOfPlanet[7] = "Neptune";

        MyPlanet = new VBox();
        _planetName = new VBox();
        _planetInfo = new VBox();
        MyPlanet.setPrefSize(350, Double.MAX_VALUE);
        _planetName.setPrefSize(350, 600);
        _planetInfo.setPrefSize(350, 400);
        Label name = new Label("My Planet");
        name.setFont(Font.font(40));
        name.setTextFill(Color.WHITE);
        name.setPrefSize(350, 10);
        name.setAlignment(Pos.CENTER);
        MyPlanet.getChildren().add(name);
        MyPlanet.getChildren().add(_planetName);
        MyPlanet.getChildren().add(_planetInfo);
        planetList planetList = new planetList();

        _label[0] = new Label("Mass  ");
        _label[1] = new Label("Mean Radius  ");
        _label[2] = new Label("Semi-Major Axis  ");
        _label[3] = new Label("Orbital Period  ");
        _label[4] = new Label("Rotation  ");
        _label[5] = new Label("Number of Moons  ");
        setLable(_label, 6);
        _Left = new VBox();
        _Left.setPrefSize(175, 400);
        _Left.getChildren().addAll(_label);
        _Information = new HBox();
        _Information.setPrefSize(350, 400);
        _Information.getChildren().addAll(_Left);
        _Left.setAlignment(Pos.CENTER_RIGHT);
        _Right = new VBox();
        info[0] = new Label(" ");
        info[1] = new Label(" ");
        info[2] = new Label(" ");
        info[3] = new Label(" ");
        info[4] = new Label(" ");
        info[5] = new Label(" ");
        setLable(info, 6);
        _Right.getChildren().addAll(info);
        _Right.setAlignment(Pos.CENTER_LEFT);
        _Information.getChildren().add(_Right);
        for (int i = 0; i < 8; i++) {
            MyShape[i] = new Pane();
            MyShape[i].getChildren().add(planetList.getPlanetsList()[i]);
            planetClick[i] = new HBox();
            planetClick[i].setPrefSize(350, 74);
            MyShape[i].setPrefSize(150, 74);
            label = new Label("",planetList.getPlanetsList()[i]);
            label.setPrefSize(150, 74);
            label.setAlignment(Pos.CENTER);
            label.setTextFill(Color.BLUEVIOLET);
            MyShape[i].getChildren().add(label);
            MyClick[i] = new Button(nameOfPlanet[i]);
            MyClick[i].setFont(new Font(25));
            MyClick[i].setTextFill(Color.WHITE);
            MyClick[i].setPrefSize(200, 74);
            MyClick[i].setBackground(Background.EMPTY);
            MyClick[i].setAlignment(Pos.CENTER_LEFT);
            planetClick[i].getChildren().add(MyShape[i]);
            planetClick[i].getChildren().add(MyClick[i]);
        }
        EventHandler<ActionEvent> mercury = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {

                info[0].setText("0.055 Earths");
                info[1].setText("2,439.7 km");
                info[2].setText("149.6 million km");
                info[3].setText("0.24 year");
                info[4].setText("1407h 30m");
                info[5].setText("0");

                changeTheColorOfOrbit(0);
            }
        };
        MyClick[0].setOnAction(mercury);
        EventHandler<MouseEvent> mercury_1 = new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {

                info[0].setText("0.055 Earths");
                info[1].setText("2,439.7 km");
                info[2].setText("149.6 million km");
                info[3].setText("0.24 year");
                info[4].setText("1407h 30m");
                info[5].setText("0");

                changeTheColorOfOrbit(0);
            }
        };
        MyShape[0].setOnMouseClicked(mercury_1);
        EventHandler<ActionEvent> venus = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {

                info[0].setText("0.8 EARTH");
                info[1].setText("6,051.8 km");
                info[2].setText("108.2 million km");
                info[3].setText("0.6 year");
                info[4].setText("5832h 36m 0s");
                info[5].setText("0");

                changeTheColorOfOrbit(1);
            }
        };
        MyClick[1].setOnAction(venus);
        EventHandler<MouseEvent> venus_1 = new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {

                info[0].setText("0.8 EARTH");
                info[1].setText("6,051.8 km");
                info[2].setText("108.2 million km");
                info[3].setText("0.6 year");
                info[4].setText("5832h 36m 0s");
                info[5].setText("0");

                changeTheColorOfOrbit(1);
            }
        };
        MyShape[1].setOnMouseClicked(venus_1);
        EventHandler<ActionEvent> earth = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {

                info[0].setText("1 EARTH");
                info[1].setText("6371.0 km");
                info[2].setText("149.5 million km");
                info[3].setText("1 year");
                info[4].setText("24h ");
                info[5].setText("1");

                changeTheColorOfOrbit(2);
            }
        };
        MyClick[2].setOnAction(earth);
        EventHandler<MouseEvent> earth_1 = new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {

                info[0].setText("1 EARTH");
                info[1].setText("6371.0 km");
                info[2].setText("149.5 million km");
                info[3].setText("1 year");
                info[4].setText("24h ");
                info[5].setText("1");

                changeTheColorOfOrbit(2);
            }
        };
        MyShape[2].setOnMouseClicked(earth_1);
        EventHandler<ActionEvent> mars = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {

                info[0].setText("0.1 Earths");
                info[1].setText("3389.5 km");
                info[2].setText("227.9 million km");
                info[3].setText("1.9 year");
                info[4].setText("24h 37m 0s");
                info[5].setText("2");

                changeTheColorOfOrbit(3);
            }
        };
        MyClick[3].setOnAction(mars);
        EventHandler<MouseEvent> mars_1 = new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {

                info[0].setText("0.1 Earths");
                info[1].setText("3389.5 km");
                info[2].setText("227.9 million km");
                info[3].setText("1.9 year");
                info[4].setText("24h 37m 0s");
                info[5].setText("2");

                changeTheColorOfOrbit(3);
            }
        };
        MyShape[3].setOnMouseClicked(mars_1);
        EventHandler<ActionEvent> jupiter = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {

                info[0].setText("318 Earths");
                info[1].setText("69911 km");
                info[2].setText("778.5 million km");
                info[3].setText("11.8 years");
                info[4].setText("9 h 55 m 30 s");
                info[5].setText("79");

                changeTheColorOfOrbit(4);
            }
        };
        MyClick[4].setOnAction(jupiter);
        EventHandler<MouseEvent> jupiter_1 = new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {

                info[0].setText("318 Earths");
                info[1].setText("69911 km");
                info[2].setText("778.5 million km");
                info[3].setText("11.8 years");
                info[4].setText("9 h 55 m 30 s");
                info[5].setText("79");

                changeTheColorOfOrbit(4);
            }
        };
        MyShape[4].setOnMouseClicked(jupiter_1);
        EventHandler<ActionEvent> Saturn = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {

                info[0].setText("95.1 Earths");
                info[1].setText("58232 km");
                info[2].setText("1433.5 million km");
                info[3].setText("29.4 years");
                info[4].setText("10h 33m 38s");
                info[5].setText("82");

                changeTheColorOfOrbit(5);
            }
        };
        MyClick[5].setOnAction(Saturn);
        EventHandler<MouseEvent> Saturn_1 = new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {

                info[0].setText("95.1 Earths");
                info[1].setText("58232 km");
                info[2].setText("1433.5 million km");
                info[3].setText("29.4 years");
                info[4].setText("10h 33m 38s");
                info[5].setText("82");

                changeTheColorOfOrbit(5);
            }
        };
        MyShape[5].setOnMouseClicked(Saturn_1);
        EventHandler<ActionEvent> Uranus = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {

                info[0].setText("14.5 Earths");
                info[1].setText("25,362±7 km");
                info[2].setText("28750.3 million km");
                info[3].setText("84.0 years");
                info[4].setText("17h 14min 24s");
                info[5].setText("27");

                changeTheColorOfOrbit(6);
            }
        };
        MyClick[6].setOnAction(Uranus);
        EventHandler<MouseEvent> Uranus_1 = new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {

                info[0].setText("14.5 Earths");
                info[1].setText("25,362±7 km");
                info[2].setText("28750.3 million km");
                info[3].setText("84.0 years");
                info[4].setText("17h 14min 24s");
                info[5].setText("27");

                changeTheColorOfOrbit(6);
            }
        };
        MyShape[6].setOnMouseClicked(Uranus_1);
        EventHandler<ActionEvent> Neptune = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e) {

                info[0].setText("17.1 Earths");
                info[1].setText("24,622±19 km");
                info[2].setText("4504.3 million km");
                info[3].setText("164.8 years");
                info[4].setText("16h 6min 36s");
                info[5].setText("14");

                changeTheColorOfOrbit(7);
            }
        };
        MyClick[7].setOnAction(Neptune);
        EventHandler<MouseEvent> Neptune_1 = new EventHandler<MouseEvent>() {
            public void handle(MouseEvent e) {

                info[0].setText("17.1 Earths");
                info[1].setText("24,622±19 km");
                info[2].setText("4504.3 million km");
                info[3].setText("164.8 years");
                info[4].setText("16h 6min 36s");
                info[5].setText("14");

                changeTheColorOfOrbit(7);
            }
        };
        MyShape[7].setOnMouseClicked(Neptune_1);
        _planetName.getChildren().addAll(planetClick);
        _planetInfo.getChildren().addAll(_Information);

    }

    public void setLable(Label[] LABLE, int n) {
        for (int i = 0; i < n; i++) {
            LABLE[i].setAlignment(Pos.CENTER);
            LABLE[i].setLineSpacing(35);
            LABLE[i].setFont(new Font("B NAZANIN", 18));
            LABLE[i].setTextFill(Color.WHITE);
        }
    }

    public void changeTheColorOfOrbit(int l) {
        for (int j = 0; j < 8; j++) {
            if (l != j) {
                orbitss.get(j).setStroke(Color.GRAY);

            } else {


                orbitss.get(j).setStroke(Color.RED);
            }
        }
    }


    public VBox get_planetName() {
        return MyPlanet;
    }
}
