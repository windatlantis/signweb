package com.atw.signweb.repository.dto;

import com.atw.signweb.pojo.db.RecordDo;
import com.atw.signweb.pojo.db.UserDo;
import com.atw.signweb.pojo.vo.RecordVo;
import com.atw.signweb.repository.service.UserService;
import com.atw.signweb.util.CheckUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

/**
 * @author Karl
 * @Description
 * @date 2019/1/15 22:32
 */
@Repository
public class RecordDto implements IDto<RecordDo, RecordVo> {

	@Autowired
	private UserService userService;
	@Autowired
	private UserDto userDto;

	@Override
	public RecordDo convertToDo(RecordVo v) {
		if (v != null) {
			if (CheckUtil.isEmpty(v.getOpenid())) {
				throw new IllegalStateException("RecordVo openid cannot be null.");
			}
			RecordDo recordDo = new RecordDo();
			recordDo.setOpenid(v.getOpenid());
			recordDo.setSignday(Instant.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault())).toEpochMilli());

			return recordDo;
		}

		return null;
	}

	@Override
	public RecordVo convertToVo(RecordDo d) {
		if (d != null) {
			RecordVo recordVo = new RecordVo();
			recordVo.setId(d.getId());
			recordVo.setOpenid(d.getOpenid());
			recordVo.setSigntime(d.getCreatetime());
			recordVo.setState(d.getState());

			UserDo userDo = userService.getById(recordVo.getOpenid());
			recordVo.setUserVo(userDto.convertToVo(userDo));

			return recordVo;
		}

		return null;
	}
}
