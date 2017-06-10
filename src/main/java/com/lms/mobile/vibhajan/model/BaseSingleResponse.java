package com.lms.mobile.vibhajan.model;

import java.io.Serializable;

/**
 * Created by shwetashaw on 10/06/17.
 */
public class BaseSingleResponse<E> extends BaseResponse implements Serializable {

    private static final long serialVersionUID = -711981393824150950L;

    private E response;

    public BaseSingleResponse(boolean success, int status) {
        super(success, status);
    }

    public BaseSingleResponse(boolean success, int status, String errorMessage) {
        super(success, status, errorMessage);
    }

    public BaseSingleResponse(boolean success, int status, E response) {
        super(success, status);
        this.response = response;
    }

    public BaseSingleResponse(boolean success, int status, String errorMessage, E response) {
        super(success, status, errorMessage);
        this.response = response;
    }

    public BaseSingleResponse(boolean success, int status, String errorCode, String errorMessage) {
        super(success, status, errorCode, errorMessage);
    }

    public E getResponse() {
        return response;
    }

    public void setResponse(E response) {
        this.response = response;
    }


}
