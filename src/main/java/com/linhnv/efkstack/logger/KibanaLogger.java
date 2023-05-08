package com.linhnv.efkstack.logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.fluentd.logger.FluentLogger;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Component
public class KibanaLogger {

    private static final FluentLogger logger;
    private static final ObjectMapper objectMapper;

    static {
        objectMapper = new ObjectMapper();
        logger = FluentLogger.getLogger("fluentd.test", "3.239.211.167", 24244);
    }

    public void log(String data){
        try {
            Map<String, Object> mapData = new HashMap<>();

            mapData.put("time", LocalDateTime.now());
            mapData.put("data", objectMapper.writeValueAsString(data));

            logger.log("OK", mapData);
        } catch (Exception e) {
            System.out.println("kibana logger error");
        }
    }
}
