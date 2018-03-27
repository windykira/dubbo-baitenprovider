package com.result;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/3/27.
 */
public class ReturnResult implements Serializable{

    private boolean success;
    private Object object;
    private String errorMessage;

    public ReturnResult(Object object){
        this.success = true;
    }

    public ReturnResult(String errorMessage){
        this.success = false;
        this.errorMessage = errorMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public Object getObject() {
        return object;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
