package com.example.common.exception;

/**
 * 系统异常，重载系统异常处理时抛出该异常。该异常只做INFO级别的日志记录
 *
 * @see
 * @author lirong
 * @version v1.0
 * @since 2018/7/25 10:26
 */
public class ServerException extends RuntimeException {

    public ServerException() {
    }

    public ServerException(String message) {
        super(message);
    }

    public ServerException(String message, Throwable cause) {
        super(message, cause);
    }
}