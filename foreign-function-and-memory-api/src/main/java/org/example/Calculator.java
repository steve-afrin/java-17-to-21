package org.example;

import javax.naming.OperationNotSupportedException;

public interface Calculator {
  long add(long a, long b) throws OperationNotSupportedException;
  long subtract(long a, long b) throws OperationNotSupportedException;
  long multiply(long a, long b) throws OperationNotSupportedException;
  long divide(long a, long b) throws OperationNotSupportedException;
}
