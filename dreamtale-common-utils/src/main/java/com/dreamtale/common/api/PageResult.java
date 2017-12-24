package com.dreamtale.common.api;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yingshuai on 2017/12/24.
 */
public class PageResult<T>  implements Serializable{

    /**
     * 当前页码
     */
    private int pageNo = 1;

    /**
     * 每页数据量
     */
    private int pageSize = 10;

    /**
     * 总页数
     */
    private long totalPage = 0;

    /**
     * 总数据量
     */
    private long totalCount = 0;

    /**
     * 当前页数据
     */
    private List<T> data;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public void setTotalPage(){
        this.totalPage = 0;
        if(this.totalCount>0){
            this.totalPage = this.totalCount%this.pageSize==0?(this.totalCount/this.pageSize):(this.totalCount/this.pageSize)+1;
        }
    }
}
