package io.github.safeslope.skicard.dto;

public record VerifyCardRequest(
        String cardUid,
        Integer resortId
) {}
