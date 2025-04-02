package farhad.instana.subtraceapp;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import farhad.instana.subtraceapp.helpers.BranchProcessor;
import farhad.instana.subtraceapp.helpers.InputParser;

@SpringBootApplication
@RestController
public class SubtraceappApplication {
  protected static Logger logger = LoggerFactory.getLogger(SubtraceappApplication.class);  

  @PostMapping("/generateTrace")
  public String generateTrace(@RequestParam(value = "traceConf", defaultValue = "1") String traceConf) {
    logger.debug("generateTrace invoked");
    //logger.debug("trace conf is: " + traceConf);
    List<int[]> numberArrays = InputParser.parseInput(traceConf);

    for (int[] array : numberArrays) {
      BranchProcessor.processBranch(array);
    }
    return String.format("traceConf is %s!", traceConf);
  }

  @GetMapping("/one")
  public String one() {
    logger.debug("Endpoint one invoked");
    return "one";
  }

  @GetMapping("/two")
  public String two() {
    logger.debug("Endpoint two invoked");
    return "two";
  }

  @GetMapping("/three")
  public String three() {
    logger.debug("Endpoint three invoked");
    return "three";
  }

  @GetMapping("/four")
  public String four() {
    logger.debug("Endpoint four invoked");
    return "four";
  }

  @GetMapping("/five")
  public String five() {
    logger.debug("Endpoint five invoked");
    return "five";
  }

  @GetMapping("/six")
  public String six() {
    logger.debug("Endpoint six invoked");
    return "six";
  }

  @GetMapping("/seven")
  public String seven() {
    logger.debug("Endpoint seven invoked");
    return "seven";
  }

  @GetMapping("/eight")
  public String eight() {
    logger.debug("Endpoint eight invoked");
    return "eight";
  }

  @GetMapping("/nine")
  public String nine() {
    logger.debug("Endpoint nine invoked");
    return "nine";
  }

  @GetMapping("/ten")
  public String ten() {
    logger.debug("Endpoint ten invoked");
    return "ten";
  }

  @GetMapping("/eleven")
  public String eleven() {
    logger.debug("Endpoint eleven invoked");
    return "eleven";
  }

  @GetMapping("/twelve")
  public String twelve() {
    logger.debug("Endpoint twelve invoked");
    return "twelve";
  }

  @GetMapping("/thirteen")
  public String thirteen() {
    logger.debug("Endpoint thirteen invoked");
    return "thirteen";
  }

  @GetMapping("/fourteen")
  public String fourteen() {
    logger.debug("Endpoint fourteen invoked");
    return "fourteen";
  }

  @GetMapping("/fifteen")
  public String fifteen() {
    logger.debug("Endpoint fifteen invoked");
    return "fifteen";
  }

  @GetMapping("/sixteen")
  public String sixteen() {
    logger.debug("Endpoint sixteen invoked");
    return "sixteen";
  }

  @GetMapping("/seventeen")
  public String seventeen() {
    logger.debug("Endpoint seventeen invoked");
    return "seventeen";
  }

  @GetMapping("/eighteen")
  public String eighteen() {
    logger.debug("Endpoint eighteen invoked");
    return "eighteen";
  }

  @GetMapping("/nineteen")
  public String nineteen() {
    logger.debug("Endpoint nineteen invoked");
    return "nineteen";
  }

  @GetMapping("/twenty")
  public String twenty() {
    logger.debug("Endpoint twenty invoked");
    return "twenty";
  }
}
