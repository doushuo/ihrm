package com.zj.common.exception;

import com.zj.common.entity.ResultCode;
import lombok.Getter;

@Getter
public class CommonException extends RuntimeException{
    private ResultCode code = ResultCode.SERVER_ERROR;

    public CommonException(){};

    public CommonException(ResultCode resultCode) {
        super(resultCode.message());
        this.code = resultCode;
    }
}
