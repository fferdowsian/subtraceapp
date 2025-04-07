package farhad.instana.subtraceapp.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyEndpoints {

  protected static Logger logger = LoggerFactory.getLogger(DummyEndpoints.class);

  @GetMapping("/one")
  public String one(@RequestParam(value = "endpoints", defaultValue = "") String endpoints) {
    logger.debug("Endpoint one invoked");
    logger.debug("endpoints is " + endpoints);
    BranchProcessor.callEndpoint(endpoints.split(","));
    return "one";
  }

  @GetMapping("/two")
  public String two(@RequestParam(value = "endpoints", defaultValue = "") String endpoints) {
    logger.debug("Endpoint two invoked");
    logger.debug("endpoints is " + endpoints);
    BranchProcessor.callEndpoint(endpoints.split(","));
    return "two";
  }

  @GetMapping("/three")
  public String three(@RequestParam(value = "endpoints", defaultValue = "") String endpoints) {
    logger.debug("Endpoint three invoked");
    logger.debug("endpoints is " + endpoints);
    BranchProcessor.callEndpoint(endpoints.split(","));
    return "three";
  }

  @GetMapping("/four")
  public String four(@RequestParam(value = "endpoints", defaultValue = "") String endpoints) {
    logger.debug("Endpoint four invoked");
    logger.debug("endpoints is " + endpoints);
    BranchProcessor.callEndpoint(endpoints.split(","));
    return "four";
  }

  @GetMapping("/five")
  public String five(@RequestParam(value = "endpoints", defaultValue = "") String endpoints) {
    logger.debug("Endpoint five invoked");
    logger.debug("endpoints is " + endpoints);
    BranchProcessor.callEndpoint(endpoints.split(","));
    return "five";
  }

  @GetMapping("/six")
  public String six(@RequestParam(value = "endpoints", defaultValue = "") String endpoints) {
    logger.debug("Endpoint six invoked");
    logger.debug("endpoints is " + endpoints);
    BranchProcessor.callEndpoint(endpoints.split(","));
    return "six";
  }

  @GetMapping("/seven")
  public String seven(@RequestParam(value = "endpoints", defaultValue = "") String endpoints) {
    logger.debug("Endpoint seven invoked");
    logger.debug("endpoints is " + endpoints);
    BranchProcessor.callEndpoint(endpoints.split(","));
    return "seven";
  }

  @GetMapping("/eight")
  public String eight(@RequestParam(value = "endpoints", defaultValue = "") String endpoints) {
    logger.debug("Endpoint eight invoked");
    logger.debug("endpoints is " + endpoints);
    BranchProcessor.callEndpoint(endpoints.split(","));
    return "eight";
  }

  @GetMapping("/nine")
  public String nine(@RequestParam(value = "endpoints", defaultValue = "") String endpoints) {
    logger.debug("Endpoint nine invoked");
    logger.debug("endpoints is " + endpoints);
    BranchProcessor.callEndpoint(endpoints.split(","));
    return "nine";
  }

  @GetMapping("/ten")
  public String ten(@RequestParam(value = "endpoints", defaultValue = "") String endpoints) {
    logger.debug("Endpoint ten invoked");
    logger.debug("endpoints is " + endpoints);
    BranchProcessor.callEndpoint(endpoints.split(","));
    return "ten";
  }

  @GetMapping("/eleven")
  public String eleven(@RequestParam(value = "endpoints", defaultValue = "") String endpoints) {
    logger.debug("Endpoint eleven invoked");
    logger.debug("endpoints is " + endpoints);
    BranchProcessor.callEndpoint(endpoints.split(","));
    return "eleven";
  }

  @GetMapping("/twelve")
  public String twelve(@RequestParam(value = "endpoints", defaultValue = "") String endpoints) {
    logger.debug("Endpoint twelve invoked");
    logger.debug("endpoints is " + endpoints);
    BranchProcessor.callEndpoint(endpoints.split(","));
    return "twelve";
  }

  @GetMapping("/thirteen")
  public String thirteen(@RequestParam(value = "endpoints", defaultValue = "") String endpoints) {
    logger.debug("Endpoint thirteen invoked");
    logger.debug("endpoints is " + endpoints);
    BranchProcessor.callEndpoint(endpoints.split(","));
    return "thirteen";
  }

  @GetMapping("/fourteen")
  public String fourteen(@RequestParam(value = "endpoints", defaultValue = "") String endpoints) {
    logger.debug("Endpoint fourteen invoked");
    logger.debug("endpoints is " + endpoints);
    BranchProcessor.callEndpoint(endpoints.split(","));
    return "fourteen";
  }

  @GetMapping("/fifteen")
  public String fifteen(@RequestParam(value = "endpoints", defaultValue = "") String endpoints) {
    logger.debug("Endpoint fifteen invoked");
    logger.debug("endpoints is " + endpoints);
    BranchProcessor.callEndpoint(endpoints.split(","));
    return "fifteen";
  }

  @GetMapping("/sixteen")
  public String sixteen(@RequestParam(value = "endpoints", defaultValue = "") String endpoints) {
    logger.debug("Endpoint sixteen invoked");
    logger.debug("endpoints is " + endpoints);
    BranchProcessor.callEndpoint(endpoints.split(","));
    return "sixteen";
  }

  @GetMapping("/seventeen")
  public String seventeen(@RequestParam(value = "endpoints", defaultValue = "") String endpoints) {
    logger.debug("Endpoint seventeen invoked");
    logger.debug("endpoints is " + endpoints);
    BranchProcessor.callEndpoint(endpoints.split(","));
    return "seventeen";
  }

  @GetMapping("/eighteen")
  public String eighteen(@RequestParam(value = "endpoints", defaultValue = "") String endpoints) {
    logger.debug("Endpoint eighteen invoked");
    logger.debug("endpoints is " + endpoints);
    BranchProcessor.callEndpoint(endpoints.split(","));
    return "eighteen";
  }

  @GetMapping("/nineteen")
  public String nineteen(@RequestParam(value = "endpoints", defaultValue = "") String endpoints) {
    logger.debug("Endpoint nineteen invoked");
    logger.debug("endpoints is " + endpoints);
    BranchProcessor.callEndpoint(endpoints.split(","));
    return "nineteen";
  }

  @GetMapping("/twenty")
  public String twenty(@RequestParam(value = "endpoints", defaultValue = "") String endpoints) {
    logger.debug("Endpoint twenty invoked");
    logger.debug("endpoints is " + endpoints);
    BranchProcessor.callEndpoint(endpoints.split(","));
    return "twenty";
  }

}
