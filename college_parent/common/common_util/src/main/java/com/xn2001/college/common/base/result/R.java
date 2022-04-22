package com.xn2001.college.common.base.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@ApiModel("全局统一返回结果")
public class R {
    @ApiModelProperty(value = "是否成功")
    private Boolean success;

    @ApiModelProperty(value = "返回码")
    private Integer code;

    @ApiModelProperty(value = "返回消息")
    private String msg;

    @ApiModelProperty(value = "返回数据")
    private Map<String, Object> data = new HashMap<>();

    public static R ok() {
        R r = new R();
        r.setSuccess(ResultCodeEnum.SUCCESS.getSuccess());
        r.setCode(ResultCodeEnum.SUCCESS.getCode());
        r.setMsg(ResultCodeEnum.SUCCESS.getMessage());
        return r;
    }

    public static R error() {
        R r = new R();
        r.setSuccess(ResultCodeEnum.UNKNOWN_REASON.getSuccess());
        r.setCode(ResultCodeEnum.UNKNOWN_REASON.getCode());
        r.setMsg(ResultCodeEnum.UNKNOWN_REASON.getMessage());
        return r;
    }

    public static R setResult(ResultCodeEnum resultCodeEnum) {
        R r = new R();
        r.setSuccess(resultCodeEnum.getSuccess());
        r.setCode(resultCodeEnum.getCode());
        r.setMsg(resultCodeEnum.getMessage());
        return r;
    }

    public R success(Boolean success) {
        this.success(success);
        return this;
    }

    public R message(String message) {
        this.setMsg(message);
        return this;
    }

    public R code(Integer code) {
        this.setCode(code);
        return this;
    }

    public R data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }

    public R data(Map<String, Object> map) {
        this.setData(map);
        return this;
    }

//    private static final long serialVersionUID = 1L;
//
//    /** 成功 */
//    public static final int SUCCESS = Constants.SUCCESS;
//
//    /** 失败 */
//    public static final int FAIL = Constants.FAIL;
//
//    private int code;
//
//    private String msg;
//
//    private T data;
//
//    public static <T> R<T> ok()
//    {
//        return restResult(null, SUCCESS, null);
//    }
//
//    public static <T> R<T> ok(T data)
//    {
//        return restResult(data, SUCCESS, null);
//    }
//
//    public static <T> R<T> ok(T data, String msg)
//    {
//        return restResult(data, SUCCESS, msg);
//    }
//
//    public static <T> R<T> fail()
//    {
//        return restResult(null, FAIL, null);
//    }
//
//    public static <T> R<T> fail(String msg)
//    {
//        return restResult(null, FAIL, msg);
//    }
//
//    public static <T> R<T> fail(T data)
//    {
//        return restResult(data, FAIL, null);
//    }
//
//    public static <T> R<T> fail(T data, String msg)
//    {
//        return restResult(data, FAIL, msg);
//    }
//
//    public static <T> R<T> fail(int code, String msg)
//    {
//        return restResult(null, code, msg);
//    }
//
//    private static <T> R<T> restResult(T data, int code, String msg)
//    {
//        R<T> apiResult = new R<>();
//        apiResult.setCode(code);
//        apiResult.setData(data);
//        apiResult.setMsg(msg);
//        return apiResult;
//    }
//
//    public int getCode()
//    {
//        return code;
//    }
//
//    public void setCode(int code)
//    {
//        this.code = code;
//    }
//
//    public String getMsg()
//    {
//        return msg;
//    }
//
//    public void setMsg(String msg)
//    {
//        this.msg = msg;
//    }
//
//    public T getData()
//    {
//        return data;
//    }
//
//    public void setData(T data)
//    {
//        this.data = data;
//    }
}
