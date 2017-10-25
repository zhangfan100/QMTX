package com.qimao.utils;

import org.apache.commons.collections4.MapUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 分页需要的实体bean
 *
 * @author zhangfan
 * @date 2017年9月9日 上午10:44:45
 */
public class PageBean {
	
	/**
	 * 默认分页
	 */
	private boolean isPage = true;
    /**
     * 具体页
     **/
    private int pageNumber = QMConstants.DEFAULT_PAGE_NUM;
    /**
     * 每页大小 默认每页10个
     **/
    private int pageSize = QMConstants.DEFAULT_PAGE_SIZE;
    /**
     * 页内容
     */
    @SuppressWarnings("rawtypes")
    private List rows;
    /**
     * 总数
     */
    private int total;

    /**
     * 查询条件封装
     */
    private Map<String, Object> conditions;

    
    public boolean isPage() {
		return isPage;
	}

	public void setPage(boolean isPage) {
		this.isPage = isPage;
	}

	public int getPageNumber() {
        return pageNumber < 1 ? QMConstants.DEFAULT_PAGE_NUM : pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize < 1 ? QMConstants.DEFAULT_PAGE_SIZE : pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @SuppressWarnings("rawtypes")
    public List getRows() {
        return rows;
    }

    @SuppressWarnings("rawtypes")
    public void setRows(List rows) {
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Map<String, Object> getConditions() {
        return conditions == null ? new HashMap<String, Object>() : conditions;
    }

    public void setConditions(Map<String, Object> conditions) {
        this.conditions = conditions;
    }

    public void addConditions(String key, Object value) {
        if (MapUtils.isEmpty(this.conditions)) {
            this.conditions = new HashMap<String, Object>();
        }
        if (null != value) {
            this.conditions.put(key, value);
        }

    }

    @Override
    public String toString() {
        return "PageBean [pageNumber=" + pageNumber + ", pageSize=" + pageSize
                + ", rows=" + rows + ", total=" + total + ", conditions="
                + conditions + "]";
    }


}
