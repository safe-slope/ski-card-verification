package io.github.safeslope.skicard.dto;

public record VerifyCardRequest(
        String skiTicketId,
        Integer resortId
) {}
