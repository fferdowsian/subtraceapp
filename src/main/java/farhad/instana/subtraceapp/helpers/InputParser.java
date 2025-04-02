package farhad.instana.subtraceapp.helpers;

import java.util.ArrayList;
import java.util.List;

public class InputParser {

  public static List<int[]> parseInput(String input) {
    List<int[]> result = new ArrayList<>();
    String[] lines = input.split("\\n");

    for (String line : lines) {
      String[] parts = line.split(",");
      int[] numbers = new int[parts.length];
      for (int i = 0; i < parts.length; i++) {
        numbers[i] = Integer.parseInt(parts[i].trim());
      }
      result.add(numbers);
    }

    return result;
  }
}
