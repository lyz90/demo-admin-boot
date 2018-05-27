package com.lyz.it.apimodel.common;

import java.io.Serializable;

/**
 * @Author:LYZ
 * @Description:
 * @Date:Created in 13:30 2018/5/27
 * @Modified By:
 */
public class PageCondition implements Serializable{
    private static final long serialVersionUID = 7573427060610594375L;

    private static final int DEFAULT_PAGE_SIZE = 10;

    private int pageIndex=1;
    private int pageSize=DEFAULT_PAGE_SIZE;

//    private int startRow;
//    private int endRow;

    private String orderBy;

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        if (pageIndex <= 0) {
            this.pageIndex = 1;
        } else {
            this.pageIndex = pageIndex;
        }
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        if (pageSize <= 0) {
            this.pageSize = DEFAULT_PAGE_SIZE;
        } else {
            this.pageSize = pageSize;
        }
    }

    /*public int getStartRow() {
        this.startRow = this.pageIndex > 0 ? (this.pageIndex - 1) * this.pageSize : 0;
        return startRow;
    }
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getEndRow() {
        int startRow = this.pageIndex > 0 ? (this.pageIndex - 1) * this.pageSize : 0;
        this.endRow = startRow + this.pageSize * (this.pageIndex > 0 ? 1 : 0);
        return endRow;
    }

    public void setEndRow(int endRow) {
        this.endRow = endRow;
    }*/

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
}
