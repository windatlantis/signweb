package com.atw.signweb.pojo.db;

import java.util.Date;

/**
 * @author Karl
 * @Description
 * @date 2019/1/10 22:14
 */
public class RecordDo {

	private String id;
	private Date createtime;
	private Date updatetime;
	private Short isdelete;

	private String openid;
	private Long signday;
	private Integer state;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public Short getIsdelete() {
		return isdelete;
	}

	public void setIsdelete(Short isdelete) {
		this.isdelete = isdelete;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public Long getSignday() {
		return signday;
	}

	public void setSignday(Long signday) {
		this.signday = signday;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}
}
