package org.example;

import org.example.models.Circle;
import org.example.models.Color;
import org.example.models.Shape;
import org.example.models.Square;
import org.example.models.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeDisplayerTest {

  private ShapeDisplayer shapeDisplayer = new ShapeDisplayer();
  @Test
  void testDisplay() {
    final var c = new Circle(5);
    final var s = new Square(9);
    final var t = new Triangle(5, 12, 7);
    final var circle = new Shape<>(c, Color.BLUE);
    final var square = new Shape<>(s, Color.GREEN);
    final var triangle = new Shape<>(t, Color.RED);

    assertEquals("No shape", this.shapeDisplayer.display(null));
    assertEquals("BLUE circle of diameter 5", this.shapeDisplayer.display(circle));
    assertEquals("GREEN square of side lengths 9", this.shapeDisplayer.display(square));
    assertEquals("RED triangle of side lengths 5, 12, and 7", this.shapeDisplayer.display(triangle));
  }

  @Test
  void testIsColor() {
    final var c = new Circle(5);
    final var s = new Square(9);
    final var t = new Triangle(5, 12, 7);
    final var circle = new Shape<>(c, Color.BLUE);
    final var square = new Shape<>(s, Color.GREEN);
    final var triangle = new Shape<>(t, Color.RED);

    assertFalse(this.shapeDisplayer.isColor(Color.RED, null));
    assertTrue(this.shapeDisplayer.isColor(Color.BLUE, circle));
    assertFalse(this.shapeDisplayer.isColor(Color.RED, circle));
    assertTrue(this.shapeDisplayer.isColor(Color.GREEN, square));
    assertFalse(this.shapeDisplayer.isColor(Color.BLUE, square));
    assertTrue(this.shapeDisplayer.isColor(Color.RED, triangle));
    assertFalse(this.shapeDisplayer.isColor(Color.GREEN, triangle));  }
}