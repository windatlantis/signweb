package com.atw.signweb.repository.service;

import java.util.Date;
import java.util.UUID;

/**
 * @author Karl
 * @Description
 * @date 2019/1/16 23:01
 */
public interface IService<ID, E> {

	E getById(ID id);

	ID insert(E e);

	void update(E e);

	void deleteById(ID id);

	default String createID() {
		return UUID.randomUUID().toString().replace("-", "");
	}

	default Date now() {
		return new Date();
	}
}
