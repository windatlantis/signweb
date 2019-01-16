package com.atw.signweb.repository.service;

import com.atw.signweb.pojo.db.UserDo;
import com.atw.signweb.repository.dao.UserDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @author Karl
 * @Description
 * @date 2019/1/16 23:00
 */
@Repository
public class UserService implements IService<String, UserDo> {

	@Resource
	private UserDao userDao;

	@Override
	public UserDo getById(String id) {
		return userDao.getById(id);
	}

	@Override
	public String insert(UserDo userDo) {
		return userDao.insert(userDo);
	}

	@Override
	public void update(UserDo userDo) {
		userDao.update(userDo);
	}

	@Override
	public void deleteById(String id) {
		userDao.deleteById(id);
	}

	public void newUserCheck(UserDo userDo) {
		UserDo db = getById(userDo.getOpenid());
		if (db == null) {
			insert(userDo);
		}
	}
}
