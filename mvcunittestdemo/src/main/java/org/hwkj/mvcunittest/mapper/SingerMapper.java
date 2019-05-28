package org.hwkj.mvcunittest.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hwkj.mvcunittest.model.Singer;
import org.hwkj.mvcunittest.model.SingerExample;

/**
 * @author HuWendong
 * @date 2019/5/28 17:58
 */
@Mapper
public interface SingerMapper {
    long countByExample(SingerExample example);

    int deleteByExample(SingerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Singer record);

    int insertOrUpdate(Singer record);

    int insertOrUpdateSelective(Singer record);

    int insertSelective(Singer record);

    List<Singer> selectByExample(SingerExample example);

    Singer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Singer record, @Param("example") SingerExample example);

    int updateByExample(@Param("record") Singer record, @Param("example") SingerExample example);

    int updateByPrimaryKeySelective(Singer record);

    int updateByPrimaryKey(Singer record);

    int updateBatch(List<Singer> list);

    int batchInsert(@Param("list") List<Singer> list);
}