package com.dev.doctor.exception;

public class ApplicationCheckedException extends  Exception{
    private static final long serialVersionUID=1L;
    private Object[] params;

    public ApplicationCheckedException(Object... parameters){
        params = parameters;
    }

    public ApplicationCheckedException(Throwable cause,Object... parameters){
        super(cause);
        params=parameters;
    }

    @Override
    public String getMessage(){
        return super.getMessage();
    }
}
