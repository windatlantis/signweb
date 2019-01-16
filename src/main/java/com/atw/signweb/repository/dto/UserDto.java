package com.atw.signweb.repository.dto;

import com.atw.signweb.pojo.db.UserDo;
import com.atw.signweb.pojo.vo.UserVo;
import com.atw.signweb.util.CheckUtil;
import org.springframework.stereotype.Repository;

/**
 * @author Karl
 * @Description
 * @date 2019/1/16 23:27
 */
@Repository
public class UserDto implements IDto<UserDo, UserVo> {

	@Override
	public UserDo convertToDo(UserVo v) {
		if (v != null) {
			if (CheckUtil.isEmpty(v.getOpenid())) {
				throw new IllegalStateException("UserVo openid cannot be null.");
			}
			UserDo userDo = new UserDo();
			userDo.setOpenid(v.getOpenid());
			userDo.setUnionid(v.getUnionid());
			userDo.setNickname(v.getNickname());
			userDo.setHeadimgurl(v.getHeadimgurl());
			userDo.setRemark(v.getRemark());

			return userDo;
		}

		return null;
	}

	@Override
	public UserVo convertToVo(UserDo d) {
		if (d != null) {
			UserVo userVo = new UserVo();
			userVo.setOpenid(d.getOpenid());
			userVo.setUnionid(d.getUnionid());
			userVo.setNickname(d.getNickname());
			userVo.setHeadimgurl(d.getHeadimgurl());
			userVo.setRemark(d.getRemark());

			return userVo;
		}

		return null;
	}
}
