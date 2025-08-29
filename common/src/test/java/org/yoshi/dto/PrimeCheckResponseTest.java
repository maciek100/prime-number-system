package org.yoshi.dto;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeCheckResponseTest {

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldSerializeAndDeserialize() throws Exception {
        PrimeCheckResponse resp = new PrimeCheckResponse(1,1,false, false, "Neither");

        String json = mapper.writeValueAsString(resp);
        PrimeCheckResponse back = mapper.readValue(json, PrimeCheckResponse.class);

        assertEquals(resp, back);
    }
}

