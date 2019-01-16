package com.atw.signweb.repository.dao;

import com.atw.signweb.pojo.db.RecordDo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @author Karl
 * @Description
 * @date 2019/1/13 12:21
 */
public interface RecordDao {

	String table = "t_sign_record";

	@Select("select * from "+table+" where isdelete=0 and id=#{id}")
	RecordDo getById(String id);

	@Select("<script>select * from "+table+" where id in "
				+ "<foreach item='item' index='index' collection='ids' open='(' separator=',' close=')'>"
				+ "#{item}"
				+ "</foreach>"
			+ "</script>")
	RecordDo getByIds(String ids);

	@Insert("insert into "+table+" values (#{id},#{createtime},#{updatetime},#{isdelete},#{openid},#{signday},#{state})")
	String insert(RecordDo recordDo);

	@Update("update "+table+" set updatetime=#{updatetime},state=#{state} where id=#{id}")
	void update(RecordDo recordDo);

	@Update("update "+table+" set isdelete=1")
	void deleteLogicallyById(String id);

	@Delete("deleteById from "+table+" where id=#{id}")
	void deleteById(String id);
}
