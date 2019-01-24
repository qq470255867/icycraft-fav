package com.icy.utils;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;


public class PageInfo<T> {
	
	private List<T> content;
	
	private Pageable pageable;
	
	private int totalPages;
	
	private long totalElements;
	
	private boolean last;
	
	private int number;
	
	private long size;
	
	private Sort sort;
	
	private long numberOfElements;
	
	private boolean first;

	public List<T> getContent() {
		return content;
	}

	public void setContent(List<T> content) {
		this.content = content;
	}

	public Pageable getPageable() {
		return pageable;
	}

	public void setPageable(Pageable pageable) {
		this.pageable = pageable;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public long getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}

	public boolean isLast() {
		return last;
	}

	public void setLast(boolean last) {
		this.last = last;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public Sort getSort() {
		return sort;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}

	public long getNumberOfElements() {
		return numberOfElements;
	}

	public void setNumberOfElements(long numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	public boolean isFirst() {
		return first;
	}

	public void setFirst(boolean first) {
		this.first = first;
	}

	public PageInfo(List<T> content, Pageable pageable, int totalPages, long totalElements, boolean last, int number,
			long size, Sort sort, long numberOfElements, boolean first) {
		super();
		this.content = content;
		this.pageable = pageable;
		this.totalPages = totalPages;
		this.totalElements = totalElements;
		this.last = last;
		this.number = number;
		this.size = size;
		this.sort = sort;
		this.numberOfElements = numberOfElements;
		this.first = first;
	}

	public PageInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
