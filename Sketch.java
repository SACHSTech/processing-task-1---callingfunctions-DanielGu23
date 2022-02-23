import processing.core.PApplet;


/* A program Sketch.java that sketches out a cat face and includes a turquoise background.
 @author: D. Gu */

public class Sketch extends PApplet {
	
  public void settings() {
	  // Size of sketchpad
    size(400, 400);
  }

  public void setup() {
    background(0, 140, 128);
  }

  public void draw() {
    // Draw the head
    stroke(255);
    ellipse(200, 200, 220, 220);

    // Draw the ears
    stroke(255);
    line(150, 125, 60, 50); 
    line(120, 160, 60, 50);
    line(250, 125, 340, 50); 
    line(280, 160, 340, 50);

    // Draw the eyes
    stroke(0);
    rect(125, 150, 40, 30);
    ellipse(145, 165, 10, 10);
    rect(235, 150, 40, 30);  
    ellipse(255, 165, 10, 10);

    // Draw the nose and mouth
    triangle(175, 225, 225, 225, 200, 175);
    noFill();
    arc(250, 225, 100, 90, HALF_PI, PI);
    arc(150, 225, 100, 90, 0, HALF_PI);
  }
  
}