package com.wms.common;

import lombok.Data;

@Data
public class Result {
    private int code;
    private String msg;
    private Long total;
    private Object data;

    public static Result suc(Object data,Long total){
        return result(200,"success",total,data);
    }

    public static Result fail(){
        return result(400,"fail",0L,null);
    }

    private static Result result(int code,String msg,Long total,Object data){
        Result res = new Result();
        res.setCode(code);
        res.setData(data);
        res.setMsg(msg);
        res.setTotal(total);
        return res;
    }
}
