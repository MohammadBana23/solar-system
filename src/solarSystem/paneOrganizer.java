package solarSystem;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Font;
import javafx.util.Duration;

import java.util.ArrayList;

public class paneOrganizer {
    BorderPane _root;
    Ellipse _sun;
    Ellipse _Mercury;
    private Ellipse[]ORBIT=new Ellipse[8];
    Ellipse _MercuryOrbit;
    Ellipse _Venus;
    Ellipse _VenusOrbit;
    Ellipse _Earth;
    Ellipse _EarthOrbit;
    Ellipse _Mars;
    Ellipse _MarsOrbit;
    Ellipse _Jupiter;
    Ellipse _JupiterOrbit;
    Ellipse _Saturn;
    Ellipse _SaturnOrbit;
    Ellipse _Uranus;
    Ellipse _UranusOrbit;
    Ellipse _Neptune;
    Ellipse _NeptuneOrbit;
    private ArrayList<Ellipse> MyPlanet;
    private ArrayList<Ellipse> MyPlanetOrbit;
    private int[] duration = new int[8];


    public paneOrganizer() {
        _root = new BorderPane();
        MyBackground myBackground = new MyBackground();
        _root.getChildren().add(myBackground.setBackground());
        Pane planet = new Pane();
        _sun = new Ellipse(70, 70);
        _MercuryOrbit = new Ellipse(800, 500, 100, 100);
        _Mercury = new Ellipse(800, 500, 10, 10);
        _VenusOrbit = new Ellipse(800, 500, 140, 140);
        _Venus = new Ellipse(800, 500, 15, 15);
        _EarthOrbit = new Ellipse(800, 500, 180, 180);
        _Earth = new Ellipse(800, 500, 20, 20);
        _MarsOrbit = new Ellipse(800, 500, 220, 220);
        _Mars = new Ellipse(800, 500, 15, 15);
        _JupiterOrbit = new Ellipse(800, 500, 290, 290);
        _Jupiter = new Ellipse(800, 500, 40, 40);
        _SaturnOrbit = new Ellipse(800, 500, 360, 360);
        _Saturn = new Ellipse(800, 500, 25, 25);
        _UranusOrbit = new Ellipse(800, 500, 410, 410);
        _Uranus = new Ellipse(800, 500, 22, 22);
        _NeptuneOrbit = new Ellipse(800, 500, 460, 460);
        _Neptune = new Ellipse(800, 500, 22, 22);
        duration[0] = 2;
        duration[1] = 6;
        duration[2] = 8;
        duration[3] = 11;
        duration[4] = 59;
        duration[5] = 147;
        duration[6] = 480;
        duration[7] = 840;
        MyPlanet = new ArrayList<Ellipse>();
        MyPlanetOrbit = new ArrayList<Ellipse>();
        getMyPlanet().add(_Mercury);
        getMyPlanet().add(_Venus);
        getMyPlanet().add(_Earth);
        getMyPlanet().add(_Mars);
        getMyPlanet().add(_Jupiter);
        getMyPlanet().add(_Saturn);
        getMyPlanet().add(_Uranus);
        getMyPlanet().add(_Neptune);
        getMyPlanetOrbit().add(_MercuryOrbit);
        getMyPlanetOrbit().add(_VenusOrbit);
        getMyPlanetOrbit().add(_EarthOrbit);
        getMyPlanetOrbit().add(_MarsOrbit);
        getMyPlanetOrbit().add(_JupiterOrbit);
        getMyPlanetOrbit().add(_SaturnOrbit);
        getMyPlanetOrbit().add(_UranusOrbit);
        getMyPlanetOrbit().add(_NeptuneOrbit);

        for (int i = 0; i < getMyPlanet().size(); i++) {
            planet.getChildren().addAll(getMyPlanetOrbit().get(i), getMyPlanet().get(i));
        }
        MyAnimationHandler myAnimationHandler = new MyAnimationHandler();
        for (int i = 0; i < getMyPlanet().size(); i++) {
            myAnimationHandler.setAnimation(getMyPlanetOrbit().get(i), getMyPlanet().get(i), duration[i]);
        }
        _root.getChildren().add(_sun);
        _root.setLeft(planet);
        this.setUpPlanet();
        MyList myList = new MyList(MyPlanetOrbit);
        _root.setRight(myList.get_planetName());
    }

    public void setUpPlanet() {
        Image sun = new Image("file:thesun.jpg");
        Image mercury = new Image("file:543241.jpg");
        Image venus = new Image("file:1771356.jpg");
        Image earth = new Image("file:earth.jpg");
        Image mars = new Image("file:mars.jpg");
        Image jupiter = new Image("file:jupiter.jpg");
        Image saturn = new Image("file:damm.jpg");
        Image uranus = new Image("file:uranus23.jpg");
        Image neptune = new Image("file:neptune.jpg");
        ImagePattern sun_Pattern = new ImagePattern(sun);
        ImagePattern mercury_Pattern = new ImagePattern(mercury);
        ImagePattern venus_Pattern = new ImagePattern(venus);
        ImagePattern earth_Pattern = new ImagePattern(earth);
        ImagePattern mars_Pattern = new ImagePattern(mars);
        ImagePattern jupiter_Pattern = new ImagePattern(jupiter);
        ImagePattern saturn_Pattern = new ImagePattern(saturn);
        ImagePattern uranus_Pattern = new ImagePattern(uranus);
        ImagePattern neptune_Pattern = new ImagePattern(neptune);

        _sun.setFill(sun_Pattern);
        orbitRegulation(_MercuryOrbit);
        orbitRegulation(_VenusOrbit);
        orbitRegulation(_EarthOrbit);
        orbitRegulation(_MarsOrbit);
        orbitRegulation(_JupiterOrbit);
        orbitRegulation(_SaturnOrbit);
        orbitRegulation(_UranusOrbit);
        orbitRegulation(_NeptuneOrbit);
        _sun.setCenterX(800);
        _sun.setCenterY(500);
        _Mercury.setFill(mercury_Pattern);
        _Venus.setFill(venus_Pattern);
        _Earth.setFill(earth_Pattern);
        _Mars.setFill(mars_Pattern);
        _Jupiter.setFill(jupiter_Pattern);
        _Saturn.setFill(saturn_Pattern);
        _Uranus.setFill(uranus_Pattern);
        _Neptune.setFill(neptune_Pattern);
    }

    private void orbitRegulation(Ellipse orbit) {
        orbit.setStroke(Paint.valueOf("Gray"));
        orbit.setFill(new Color(0, 0, 0, 0));
    }

    public Pane getRoot() {
        return _root;

    }

    public ArrayList<Ellipse> getMyPlanet() {
        return MyPlanet;
    }

    public ArrayList<Ellipse> getMyPlanetOrbit() {
        return MyPlanetOrbit;
    }

    private class revolveHandler implements EventHandler<ActionEvent> {


        public revolveHandler() {
        }

        @Override
        public void handle(ActionEvent event) {

        }
    }

}
