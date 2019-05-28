package org.hwkj.mvcunittest.service;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import org.hwkj.mvcunittest.model.Singer;
import org.hwkj.mvcunittest.mapper.SingerMapper;
import org.hwkj.mvcunittest.model.SingerExample;
import org.hwkj.mvcunittest.service.SingerService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author HuWendong
 * @date 2019/5/28 17:52
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SingerServiceImpl implements SingerService {

    @Resource
    private SingerMapper singerMapper;

    @Override
    public long countByExample(SingerExample example) {
        return singerMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SingerExample example) {
        return singerMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        return singerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Singer record) {
        return singerMapper.insert(record);
    }

    @Override
    public int insertOrUpdate(Singer record) {
        return singerMapper.insertOrUpdate(record);
    }

    @Override
    public int insertOrUpdateSelective(Singer record) {
        return singerMapper.insertOrUpdateSelective(record);
    }

    @Override
    public int insertSelective(Singer record) {
        return singerMapper.insertSelective(record);
    }

    @Override
    public List<Singer> selectByExample(SingerExample example) {
        return singerMapper.selectByExample(example);
    }

    @Override
    public Singer selectByPrimaryKey(Long id) {
        return singerMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Singer record, SingerExample example) {
        return singerMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Singer record, SingerExample example) {
        return singerMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Singer record) {
        return singerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Singer record) {
        return singerMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateBatch(List<Singer> list) {
        return singerMapper.updateBatch(list);
    }

    @Override
    public int batchInsert(List<Singer> list) {
        return singerMapper.batchInsert(list);
    }

    @Override
    public List<Singer> findAll() {
        return this.selectByExample(new SingerExample());
    }

    @Override
    public Singer findById(Long id) {
        return this.selectByPrimaryKey(id);
    }

    @Override
    public void save(Singer singer) {
        this.insert(singer);
    }

    @Override
    public void delete(Singer singer) {
        this.deleteByPrimaryKey(singer.getId());
    }
}





