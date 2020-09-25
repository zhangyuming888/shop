package cn.bdqn.service.impl;

import cn.bdqn.mapper.BaseMapper;
import cn.bdqn.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Service
public  class BaseServiceImpl<T> implements BaseService {
    @Autowired
    private BaseMapper baseMapper;

    public int insert(Object entity) {
        return baseMapper.insert(entity);
    }

    public void deleteById(Serializable id) {
        baseMapper.deleteById(id);
    }

    public void update(Object entity) {
        baseMapper.update(entity);
    }

    public void updateById(Object entity) {
        baseMapper.updateById(entity);
    }

    public void deleteByEntity(Object entity) {
        baseMapper.deleteByEntity(entity);
    }

    public List listAll() {
        return baseMapper.listAll();
    }

    public List listAllByEntity(Object entity) {
        return baseMapper.listAllByEntity(entity);
    }

    public Object load(Serializable id) {
        return baseMapper.load(id);
    }

    public Object getById(Serializable id) {
        return baseMapper.getById(id);
    }

    public Object getByEntity(Object entity) {
        return baseMapper.getByEntity(entity);
    }

    public Object getByMap(Map params) {
        return baseMapper.getByMap(params);
    }

    public List listByMap(Map params) {
        return baseMapper.listByMap(params);
    }

    public void deleteByMap(Map params) {
        baseMapper.deleteByMap(params);
    }
}
