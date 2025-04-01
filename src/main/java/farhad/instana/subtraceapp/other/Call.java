package farhad.instana.subtraceapp.other;

import java.util.LinkedHashMap;
import java.util.Map;

import lombok.Data;

@Data
public class Call {
  
  private int endpoint;
  private String url;

  public Call(int endpoint){
    this.endpoint=endpoint;
  }

  private Map<Integer, String> indexedMap = new LinkedHashMap<>();
  
}
