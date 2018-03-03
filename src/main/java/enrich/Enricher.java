package enrich;

import java.util.Map;

/**
 * Created by playe on 2018/3/3.
 */
public interface Enricher {
    Map<String, Object> enrich(Map<String, Object> input);
}
