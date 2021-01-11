package solarSystem;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Path;
import javafx.util.Duration;

public class MyAnimationHandler {
    public void setAnimation(Ellipse orbit, Ellipse planet,int duration) {
        PathTransition transition = new PathTransition();
        transition.setDuration(Duration.seconds(duration));
        transition.setInterpolator(Interpolator.LINEAR);
        transition.setCycleCount(Animation.INDEFINITE);
        transition.setPath(orbit);
        transition.setNode(planet);
        transition.play();
    }
}
