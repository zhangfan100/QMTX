package com.qimao.utils;

/**
 * web-api
 *
 * @author zhangfan
 * @date 2017/10/25 19:12
 * @function
 */
public class QMUtils {

    public static <T> ResponseData<T> getResultInfo(T t) {
        ResponseData<T> result = new ResponseData<T>(t);
        return result;
    }

    public static ResponseData<String> getResultInfo(int errorCode) {
        ResponseData<String> result = new ResponseData<>("操作异常");
        result.setCode(errorCode);
        result.setData(null);
        return result;
    }

}
