package com.lemon.demo.core.ret;

import java.io.Serializable;

/**
 * @Author: Qy
 * @Date: 2019-02-06 16:28
 */
public class ServiceException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 1213855733833039552L;

    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}