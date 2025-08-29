package org.yoshi.dto;

public record PrimeCheckResponse(
        long number,
        long requestId,
        boolean isPrime,
        boolean isMersenne,
        String message) {
}
