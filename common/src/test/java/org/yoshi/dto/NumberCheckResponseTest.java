package org.yoshi.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberCheckResponseTest {

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldSerializeAndDeserialize() throws Exception {
        NumberCheckResponse resp = new NumberCheckResponse(1,1,false, false, "Neither");

        String json = mapper.writeValueAsString(resp);
        NumberCheckResponse back = mapper.readValue(json, NumberCheckResponse.class);

        assertEquals(resp, back);
    }
}

