package io.github.safeslope.skicard.dto;

public record VerifyCardResponse(
        boolean valid,
        String status,
        Integer ticketId,
        String message
) {}
