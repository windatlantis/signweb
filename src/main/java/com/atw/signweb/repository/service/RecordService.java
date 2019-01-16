package com.atw.signweb.repository.service;

import com.atw.signweb.pojo.db.RecordDo;
import com.atw.signweb.repository.dao.RecordDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author Karl
 * @Description
 * @date 2019/1/14 23:00
 */
@Repository
public class RecordService implements IService<String, RecordDo> {

	@Resource
	private RecordDao recordDao;

	@Override
	public RecordDo getById(String id) {
		return recordDao.getById(id);
	}

	@Override
	public String insert(RecordDo recordDo) {
		recordDo.setId(createID());
		Date now = now();
		recordDo.setCreatetime(now);
		recordDo.setUpdatetime(now);
		recordDo.setIsdelete((short) 0);

		return recordDao.insert(recordDo);
	}

	@Override
	public void update(RecordDo recordDo) {
		recordDo.setUpdatetime(now());
		recordDao.update(recordDo);
	}

	@Override
	public void deleteById(String id) {
		recordDao.deleteById(id);
	}


}
