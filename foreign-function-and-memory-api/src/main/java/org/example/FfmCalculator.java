package org.example;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import javax.naming.OperationNotSupportedException;

import static java.lang.foreign.ValueLayout.JAVA_LONG;

public class FfmCalculator implements Calculator{

  public long add(final long a, final long b) throws OperationNotSupportedException {
    final var stdlib = Linker.nativeLinker().defaultLookup();

    final var methodHandle = Linker.nativeLinker().downcallHandle(
        stdlib.find("add").orElseThrow(),
        FunctionDescriptor.of(JAVA_LONG, JAVA_LONG, JAVA_LONG));

    long sum;

    try (var offHeap = Arena.ofConfined()) {
      final var x = offHeap.allocate(JAVA_LONG, a);
      final var y = offHeap.allocate(JAVA_LONG, b);
      sum = (long) methodHandle.invoke(x, y);
    } catch (Throwable t) {
      throw new RuntimeException(t);
    }

    return sum;
  }

  public long subtract(final long a, final long b) throws OperationNotSupportedException {
    throw new OperationNotSupportedException("Subtraction not yet supported");
  }

  public long multiply(final long a, final long b) throws OperationNotSupportedException {
    throw new OperationNotSupportedException("Multiplication not yet supported");
  }

  public long divide(final long a, final long b) throws OperationNotSupportedException {
    throw new OperationNotSupportedException("Division not yet supported");
  }
}
