package com.yaz.webUtil;

import java.util.List;

/**
 * 与BeanResult对应使用
 *
 * @author yaz
 * @create 2016-11-14 15:03
 */

public class ListResult {
    private Integer total;
    private List<?> rows;

    public ListResult(Integer total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }


    public List<?> getRows() {
        return rows;
    }
}
