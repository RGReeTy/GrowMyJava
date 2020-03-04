package com.grow_my_java.differrent_test.jdbc.connection_pool;

public class ConnectionPoolException extends Exception {

    private static final long serialVersionUID = 2088396460993072884L;

    ConnectionPoolException(String message, Exception e) {
        super(message, e);
    }
}
