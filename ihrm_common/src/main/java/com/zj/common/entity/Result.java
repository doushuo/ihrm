package com.zj.common.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回结果实体类
 * @author zouj
 */
@Data
// 非空不显示
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result {
    //是否成功
    private boolean success;
    // 返回码
    private Integer code;
    // 返回信息
    private String message;
    // 返回数据
    private Object data;
    public Result(ResultCode code) {
        this.success = code.success;
        this.code = code.code;
        this.message = code.message;
    }

    public Result(ResultCode code,Object data) {
        this.success = code.success;
        this.code = code.code;
        this.message = code.message;
        this.data = data;
    }

    public Result(Integer code,String message,boolean success) {
        this.code = code;
        this.message = message;
        this.success = success;
    }
    public static Result SUCCESS(){
        return new Result(ResultCode.SUCCESS);
    }
    public static Result ERROR(){
        return new Result(ResultCode.SERVER_ERROR);
    }
    public static Result FAIL(){
        return new Result(ResultCode.FAIL);
    }

}
