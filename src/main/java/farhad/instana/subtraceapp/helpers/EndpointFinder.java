package farhad.instana.subtraceapp.helpers;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EndpointFinder {

  protected static Logger logger = LoggerFactory.getLogger(EndpointFinder.class);
  private static final Map<Integer, String> numberMap = new HashMap<>();

  static {
    String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    String[] teens = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
        "nineteen" };
    String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

    for (int i = 1; i <= 100; i++) {
      if (i < 10) {
        numberMap.put(i, units[i]);
      } else if (i < 20) {
        numberMap.put(i, teens[i - 10]);
      } else if (i < 100) {
        int tenPart = i / 10;
        int unitPart = i % 10;
        numberMap.put(i, tens[tenPart] + (unitPart != 0 ? "-" + units[unitPart] : ""));
      } else {
        numberMap.put(i, "one-hundred");
      }
    }
  }

  public static String getEndpoint(int num) {
    return numberMap.getOrDefault(num, "out-of-range");
  }

}
