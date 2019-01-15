package com.atw.signweb.pojo.vo;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @author Karl
 * @Description
 * @date 2019/1/15 22:30
 */
public class RecordVo {

	private String id;
	private String openid;
	private String unionid;
	private String nickname;
	private String headimgurl;

	private Long signday;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getUnionid() {
		return unionid;
	}

	public void setUnionid(String unionid) {
		this.unionid = unionid;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getHeadimgurl() {
		return headimgurl;
	}

	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}

	public Long getSignday() {
		return signday;
	}

	public void setSignday(Long signday) {
		this.signday = signday;
	}

	public String getSigndayFormat() {
		Instant instant = Instant.ofEpochMilli(signday);
		LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		return DateTimeFormatter.ofPattern("yyyy-MM-dd").format(dateTime);
	}
}
