package com.atw.signweb.repository.dto;

/**
 * @author Karl
 * @Description
 * @date 2019/1/16 23:27
 */
public interface IDto<DO, VO> {

	DO convertToDo(VO v);

	VO convertToVo(DO d);
}
