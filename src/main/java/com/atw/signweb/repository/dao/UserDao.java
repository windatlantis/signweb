package com.atw.signweb.repository.dao;

import com.atw.signweb.pojo.db.UserDo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author Karl
 * @Description
 * @date 2019/1/16 22:47
 */
public interface UserDao {

	String table = "t_sign_user";

	@Select("select * from "+table+" where openid=#{id}")
	UserDo getById(String id);

	@Select("<script>select * from "+table+" where openid in "
			+ "<foreach item='item' index='index' collection='ids' open='(' separator=',' close=')'>"
			+ "#{item}"
			+ "</foreach>"
			+ "</script>")
	UserDo getByIds(String ids);

	@Insert("insert into "+table+" values (#{openid},#{unionid},#{nickname},#{headimgurl},#{remark})")
	String insert(UserDo userDo);

	@Update("update "+table+" set nickname=#{nickname},headimgurl=#{headimgurl},remark=#{remark} where openid=#{openid}")
	void update(UserDo userDo);

	@Delete("deleteById from "+table+" where openid=#{id}")
	void deleteById(String id);
}
