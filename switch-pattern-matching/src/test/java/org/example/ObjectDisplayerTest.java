package org.example;

import org.example.models.Boat;
import org.example.models.Car;
import org.example.models.Plane;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectDisplayerTest {

  private ObjectDisplayer displayer = new ObjectDisplayer();

  @Test
  void testDisplay() {
    final var string = "I am a string";
    final var boat = new Boat("ski", 15, "recreation");
    final var car = new Car("Pontiac", "Grand Prix", "black", 2005, 6, 4, 4);
    final var plane = new Plane("Cessna", "Twin propeller");

    assertEquals("Nothingness", this.displayer.display(null));
    assertEquals("I don't know what I am", this.displayer.display(string));
    assertEquals("I am a boat; Boat[type=ski, length=15, use=recreation]",
        this.displayer.display(boat));
    assertEquals("I am a car; Car[make=Pontiac, model=Grand Prix, color=black, year=2005, cylinders=6, " +
            "doors=4, seats=4]",
        this.displayer.display(car));
    assertEquals("I am a plane; Plane[type=Cessna, propulsion=Twin propeller]",
        this.displayer.display(plane));
  }
}