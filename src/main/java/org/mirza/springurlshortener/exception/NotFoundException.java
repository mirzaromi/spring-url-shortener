package org.mirza.springurlshortener.exception;

import lombok.Getter;
import org.mirza.springurlshortener.enums.ResponseCode;

@Getter
public class NotFoundException extends RuntimeException {
    private final ResponseCode responseCode;
    public NotFoundException(ResponseCode responseCode) {
        super(responseCode.message());
        this.responseCode = responseCode;
    }
}
