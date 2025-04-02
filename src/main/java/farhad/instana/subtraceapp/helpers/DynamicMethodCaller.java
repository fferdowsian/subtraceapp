package farhad.instana.subtraceapp.helpers;

import java.lang.reflect.Method;

public class DynamicMethodCaller {
  public static void doSomet(int[] array) {
    DynamicMethodCaller obj = new DynamicMethodCaller();

    // Start the chain with the first method in the array
    obj.invokeMethod(array, 0);
  }

  // Recursive method to call the next method dynamically
  private void invokeMethod(int[] array, int index) {
    if (index >= array.length)
      return; // Base case: Stop when all methods are called

    int methodNumber = array[index];
    String methodName = EndpointFinder.getEndpoint(methodNumber);

    try {
      Method method = DynamicMethodCaller.class.getDeclaredMethod(methodName, int[].class, int.class);
      method.invoke(this, array, index + 1); // Pass the array and the next index
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // Sample methods
  private void one(int[] arr, int nextIndex) {
    System.out.println("one called");
    invokeMethod(arr, nextIndex);
  }

  private void two(int[] arr, int nextIndex) {
    System.out.println("two called");
    invokeMethod(arr, nextIndex);
  }

  private void three(int[] arr, int nextIndex) {
    System.out.println("three called");
    invokeMethod(arr, nextIndex);
  }

  private void four(int[] arr, int nextIndex) {
    System.out.println("four called");
    invokeMethod(arr, nextIndex);
  }

  private void five(int[] arr, int nextIndex) {
    System.out.println("five called");
    invokeMethod(arr, nextIndex);
  }

  private void six(int[] arr, int nextIndex) {
    System.out.println("six called");
    invokeMethod(arr, nextIndex);
  }

  private void seven(int[] arr, int nextIndex) {
    System.out.println("seven called");
    invokeMethod(arr, nextIndex);
  }

  private void eight(int[] arr, int nextIndex) {
    System.out.println("eight called");
    invokeMethod(arr, nextIndex);
  }

  private void nine(int[] arr, int nextIndex) {
    System.out.println("nine called");
    invokeMethod(arr, nextIndex);
  }

  private void ten(int[] arr, int nextIndex) {
    System.out.println("ten called");
    invokeMethod(arr, nextIndex);
  }
}
