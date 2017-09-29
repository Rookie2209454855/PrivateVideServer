package com.soecode.lyf.utils;

import java.util.List;

public class PageList<T> {

	private Integer record;     // 总记录条数
	private Integer totalPages; // 总页数
	private Integer size;       // 页面显示数据条数
	private List<T> data;       // 展示数据

	public PageList(Integer record, Integer size, List<T> data) {
		this.record = record;
		this.size = size;
		this.data = data;
		this.totalPages = record % size == 0 ? record / size : record / size + 1;
	}

	public Integer getRecord() {
		return record;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public Integer getSize() {
		return size;
	}

	public List<T> getData() {
		return data;
	}

}
