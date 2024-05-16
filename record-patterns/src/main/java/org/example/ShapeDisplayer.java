package org.example;

import org.example.models.Circle;
import org.example.models.Color;
import org.example.models.Shape;
import org.example.models.Square;
import org.example.models.Triangle;

public class ShapeDisplayer {

  public String display(final Shape<?> shape) {
    return switch (shape) {
      case null -> "No shape";
      case Shape<?>(Circle s, Color c) -> String.format("%s circle of diameter %d", c.name(), s.diameter());
      case Shape<?>(Square s, Color c) -> String.format("%s square of side lengths %d", c.name(), s.sideLength());
      case Shape<?>(Triangle s, Color c) -> String.format("%s triangle of side lengths %d, %d, and %d",
          c.name(), s.side1(), s.side2(), s.side3());
      default -> "Unknown shape";
    };
  }

  public boolean isColor(Color desiredColor, Shape<?> shape) {
    if (shape instanceof Shape<?>(var s, Color color)) {
      return color.equals(desiredColor);
    }

    return false;
  }
}
