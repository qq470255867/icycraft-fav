package com.icy.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.icy.domain.Image;

public interface FileRepository extends CrudRepository<Image, Serializable> {

}
