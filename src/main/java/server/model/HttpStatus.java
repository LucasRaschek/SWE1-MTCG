package server.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum HttpStatus {

    OK(200, "OK"),
    NO_CONTENT(204, "No Content"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    CLIENT_CLOSED_REQUEST(499, "Client Closed Request");
    ;

    private final int httpCode;
    private final String httpStatus;
}
