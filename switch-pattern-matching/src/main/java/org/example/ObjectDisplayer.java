package org.example;

import org.example.models.Boat;
import org.example.models.Car;
import org.example.models.Plane;

public class ObjectDisplayer {

  public String display(final Object obj) {
    return switch (obj) {
      case null -> "Nothingness";
      case Boat b -> String.format("I am a boat; %s", b);
      case Car c -> String.format("I am a car; %s", c);
      case Plane p -> String.format("I am a plane; %s", p);
      default -> "I don't know what I am";
    };
  }
}
