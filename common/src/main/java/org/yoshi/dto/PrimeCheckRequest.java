package org.yoshi.dto;

public record PrimeCheckRequest(
        long number,
        long requestId)
{}
