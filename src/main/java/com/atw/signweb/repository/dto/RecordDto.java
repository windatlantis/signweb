package com.atw.signweb.repository.dto;

import com.atw.signweb.pojo.db.RecordDo;
import com.atw.signweb.pojo.vo.RecordVo;
import com.atw.signweb.util.CheckUtil;
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
public class RecordDto {

	public RecordDo convertDo(RecordVo recordVo) {
		if (recordVo != null) {
			if (CheckUtil.isEmpty(recordVo.getOpenid())) {
				throw new RuntimeException("RecordVo openid is null.");
			}
			RecordDo recordDo = new RecordDo();
			recordDo.setOpenid(recordVo.getOpenid());
			recordDo.setUnionid(recordVo.getUnionid());
			recordDo.setNickname(recordVo.getNickname());
			recordDo.setHeadimgurl(recordVo.getHeadimgurl());
			recordDo.setSignday(Instant.from(LocalDate.now().atStartOfDay(ZoneId.systemDefault())).toEpochMilli());

			return recordDo;
		}

		return null;
	}

	public RecordVo convertVo(RecordDo recordDo) {
		if (recordDo != null) {
			RecordVo recordVo = new RecordVo();
			recordVo.setOpenid(recordDo.getOpenid());
			recordVo.setUnionid(recordDo.getUnionid());
			recordVo.setNickname(recordDo.getNickname());
			recordVo.setHeadimgurl(recordDo.getHeadimgurl());
			recordVo.setSignday(recordDo.getSignday());

			return recordVo;
		}

		return null;
	}
}
