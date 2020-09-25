package cn.bdqn.service;

import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseService<T> {
    /**
     * 插入一个实体
     */
    int insert(T entity) ;

    /**
     * 根据实体主键删除一个实体
     */
    void deleteById(Serializable id);

    /**
     * 更新一个实体
     */
    void update(T entity);

    /**
     * 通过id进行修改
     */
    void updateById(T entity);

    /**
     * 通过实体删除
     */
    void deleteByEntity(T entity);

    /**
     * 通过map删除
     */
    void deleteByMap(Map<String,Object> params);

    /**
     * 根据参数查询
     */
    public List<T> listByMap(Map<String,Object> params);

    /**
     * 查询所有实体
     * @return
     */
    List<T> listAll();

    /**
     * 查询所有实体,根据实体属性值为判断条件查询所有实体，
     */
    List<T> listAllByEntity(T entity);

    /**
     * 根据主键获取一个实体
     */
    T load(Serializable id);

    /**
     * 根据主键获取一个实体
     */
    T getById(Serializable id);

    /**
     * 通过map查询
     */
    T getByMap(Map<String,Object> params);

    /**
     * 通过对象查询
     */
    T getByEntity(T entity);
}
