package com.atw.signweb.repository.service;

import com.atw.signweb.pojo.db.RecordDo;
import com.atw.signweb.repository.dao.RecordDao;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.Date;
import java.util.UUID;

/**
 * @author Karl
 * @Description
 * @date 2019/1/14 23:00
 */
@Repository
public class RecordService {

	@Resource
	private RecordDao recordDao;

	public RecordDo getRecordDo(String id) {
		return recordDao.getById(id);
	}

	public String insert(RecordDo recordDo) {
		recordDo.setId(createID());
		Date now = now();
		recordDo.setCreatetime(now);
		recordDo.setUpdatetime(now);
		recordDo.setIsdelete((short) 0);

		return recordDao.insert(recordDo);
	}

	public void update(RecordDo recordDo) {
		recordDo.setUpdatetime(now());
		recordDao.update(recordDo);
	}

	public void delete(String id) {
		recordDao.deleteById(id);
	}

	private String createID() {
		return UUID.randomUUID().toString().replace("-", "");
	}

	private Date now() {
		return new Date();
	}
}
