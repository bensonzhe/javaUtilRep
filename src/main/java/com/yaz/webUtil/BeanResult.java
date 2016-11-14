package com.yaz.webUtil;

import java.io.Serializable;
import java.util.List;

/**
 * 统一返回封装对象
 *
 * @author yaz
 * @create 2016-11-07 9:17
 */


public class BeanResult implements Serializable {

    public static final String ERROR = "ERROR";
    public static final String SUCCESS = "SUCCESS";

    private String status;
    private String cause;
    private Object data;


    public static final BeanResult error(String cause) {
        BeanResult bean = new BeanResult();
        bean.status = ERROR;
        bean.cause = cause;

        return bean;
    }


    public static final BeanResult success(Object data) {
        BeanResult bean = new BeanResult();
        bean.status = SUCCESS;
        bean.data = data;

        return bean;
    }


    public static final BeanResult success(Integer total, List<?> rows) {
        BeanResult bean = new BeanResult();
        bean.status = SUCCESS;
        bean.data = new ListResult(total, rows);

        return bean;
    }


    /**
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * @return
     */
    public String getCause() {
        return cause;
    }

    /**
     * @return
     */
    public Object getData() {
        return data;
    }

    @Override
    public String toString() {
        return "BeanResult{" +
                "cause='" + cause + '\'' +
                ", status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}

