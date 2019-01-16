package com.atw.signweb.pojo.vo;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author Karl
 * @Description
 * @date 2019/1/15 22:30
 */
public class RecordVo {

	private String id;
	private Date signtime;
	private String openid;
	private Integer state;

	private UserVo userVo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getSigntime() {
		return signtime;
	}

	public void setSigntime(Date signtime) {
		this.signtime = signtime;
	}

	public String getSigntimeFormat() {
		Instant instant = signtime.toInstant();
		LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(dateTime);
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public UserVo getUserVo() {
		return userVo;
	}

	public void setUserVo(UserVo userVo) {
		this.userVo = userVo;
	}
}
