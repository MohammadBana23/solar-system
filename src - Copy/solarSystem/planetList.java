package solarSystem;

import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Ellipse;

import java.awt.*;

public class planetList {
    private Ellipse[] planetsList=new  Ellipse[8];
    public  planetList(){
        planetsList[0] = new Ellipse(800, 500, 10, 10);
        planetsList[1] = new Ellipse(800, 500, 15, 15);
        planetsList[2] = new Ellipse(800, 500, 20, 20);
        planetsList[3] = new Ellipse(800, 500, 15, 15);
        planetsList[4] = new Ellipse(800, 500, 40, 40);
        planetsList[5] = new Ellipse(800, 500, 25, 25);
        planetsList[6] = new Ellipse(800, 500, 22, 22);
        planetsList[7] = new Ellipse(800, 500, 22, 22);
        javafx.scene.image.Image sun = new javafx.scene.image.Image("file:thesun.jpg");
        javafx.scene.image.Image mercury = new javafx.scene.image.Image("file:543241.jpg");
        javafx.scene.image.Image venus = new javafx.scene.image.Image("file:1771356.jpg");
        javafx.scene.image.Image earth = new javafx.scene.image.Image("file:earth.jpg");
        javafx.scene.image.Image mars = new javafx.scene.image.Image("file:mars.jpg");
        javafx.scene.image.Image jupiter = new javafx.scene.image.Image("file:jupiter.jpg");
        javafx.scene.image.Image saturn = new javafx.scene.image.Image("file:damm.jpg");
        javafx.scene.image.Image uranus = new javafx.scene.image.Image("file:uranus23.jpg");
        javafx.scene.image.Image neptune = new Image("file:neptune.jpg");
        ImagePattern sun_Pattern = new ImagePattern(sun);
        ImagePattern mercury_Pattern = new ImagePattern(mercury);
        ImagePattern venus_Pattern = new ImagePattern(venus);
        ImagePattern earth_Pattern = new ImagePattern(earth);
        ImagePattern mars_Pattern = new ImagePattern(mars);
        ImagePattern jupiter_Pattern = new ImagePattern(jupiter);
        ImagePattern saturn_Pattern = new ImagePattern(saturn);
        ImagePattern uranus_Pattern = new ImagePattern(uranus);
        ImagePattern neptune_Pattern = new ImagePattern(neptune);

        planetsList[0] .setFill(mercury_Pattern);
        planetsList[1] .setFill(venus_Pattern);
        planetsList[2] .setFill(earth_Pattern);
        planetsList[3] .setFill(mars_Pattern);
        planetsList[4] .setFill(jupiter_Pattern);
        planetsList[5] .setFill(saturn_Pattern);
        planetsList[6] .setFill(uranus_Pattern);
        planetsList[7] .setFill(neptune_Pattern);

    }

    public Ellipse[] getPlanetsList() {
        return planetsList;
    }
}
