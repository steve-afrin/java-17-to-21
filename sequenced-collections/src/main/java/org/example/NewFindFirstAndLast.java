package org.example;

import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NewFindFirstAndLast {

  private static final Logger LOG = LoggerFactory.getLogger(NewFindFirstAndLast.class);

  public <T> T findFirst(final T[] array) {
    final var list = Arrays.stream(array).toList();
    return list.getFirst();
  }

  public <T> T findLast(final T[] array) {
    final var list = Arrays.stream(array).toList();
    return list.getLast();
  }

  public static void main(final String[] args) {
    final var tester = new NewFindFirstAndLast();
    final var array = new String[] {"this", "is", "a", "collection", "of", "strings"};
    LOG.info("The first value of the list is '{}'.", tester.findFirst(array));
    LOG.info("The last value of the list is '{}'.", tester.findLast(array));
  }
}
