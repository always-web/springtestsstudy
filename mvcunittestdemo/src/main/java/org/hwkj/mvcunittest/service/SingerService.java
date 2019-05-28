package org.hwkj.mvcunittest.service;

import java.util.List;

import org.hwkj.mvcunittest.model.Singer;
import org.hwkj.mvcunittest.model.SingerExample;

/**
 * @author HuWendong
 * @date 2019/5/28 17:52
 */
public interface SingerService {


    long countByExample(SingerExample example);

    int deleteByExample(SingerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Singer record);

    int insertOrUpdate(Singer record);

    int insertOrUpdateSelective(Singer record);

    int insertSelective(Singer record);

    List<Singer> selectByExample(SingerExample example);

    Singer selectByPrimaryKey(Long id);

    int updateByExampleSelective(Singer record, SingerExample example);

    int updateByExample(Singer record, SingerExample example);

    int updateByPrimaryKeySelective(Singer record);

    int updateByPrimaryKey(Singer record);

    int updateBatch(List<Singer> list);

    int batchInsert(List<Singer> list);

    List<Singer> findAll();

    Singer findById(Long id);

    void save(Singer singer);

    void delete(Singer singer);
}





