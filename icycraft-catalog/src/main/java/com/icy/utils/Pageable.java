package com.icy.utils;

import org.springframework.data.domain.Sort;

public class Pageable implements org.springframework.data.domain.Pageable {

	@Override
	public int getPageNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getPageSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getOffset() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Sort getSort() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public org.springframework.data.domain.Pageable next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public org.springframework.data.domain.Pageable previousOrFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public org.springframework.data.domain.Pageable first() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Pageable(){
		
	}

}
