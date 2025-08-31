package org.yoshi.dto;

public record NumberCheckResponse(
        long number,
        long requestId,
        boolean isPrime,
        boolean isMersenne,
        String message) {
}
