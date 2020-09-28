package base.impl;


import base.BaseService;
import cn.bdqn.mapper.BaseMapper;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;


public abstract  class BaseServiceImpl<T> implements BaseService<T> {

    private BaseMapper<T> baseMapper;
    public abstract BaseMapper<T> getBaseMapper();
    
    /**  
     * 插入一个实体  
     * @param entity  
     */  
	public int insert(T entity) {
		return this.getBaseMapper().insert(entity);
	}
	
    /**  
     * 根据实体主键删除一个实体
     */  
	public void deleteById(Serializable id) {
		this.getBaseMapper().deleteById(id);
	}
	
	
	/**
	 * 通过实体删除
	 */
	public void deleteByEntity(T entity) {
		this.getBaseMapper().deleteByEntity(entity);
	}

	/**
	 * 通过map删除
	 */
	public void deleteByMap(Map<String, Object> params) {
		this.getBaseMapper().deleteByMap(params);
	}

	/**  
     * 更新一个实体  
     * @param entity  
     */
	public void update(T entity) {
		this.getBaseMapper().update(entity);
	}
	
	 
    /**
     * 通过id进行修改
     */
	public void updateById(T entity) {
         this.getBaseMapper().updateById(entity);
	}
	
	 /**
     * 根据参数查询
     * @param params
     * @return
     */
	public List<T> listByMap(Map<String, Object> params) {
		return this.getBaseMapper().listByMap(params);
	}

	 /**  
     * 查询所有实体  
     * @return  
     */  	
	public List<T> listAll() {
		return this.getBaseMapper().listAll();
	}
	
	 /**  
     * 查询所有实体,根据实体属性值为判断条件查询所有实体，  
     * @param entity  
     * @return  
     */
	public List<T> listAllByEntity(T entity) {
		return this.getBaseMapper().listAllByEntity(entity);
	}

	
	/**
     * 根据主键获取一个实体
     * @param id
     * @return
     */
	public T getById(Serializable id) {
		return this.getBaseMapper().getById(id);
	}

	/**
	 * 通过map查询
	 * @param params
	 * @return
	 */
	public T getByMap(Map<String, Object> params) {
		return this.getBaseMapper().getByMap(params);
	}

	/**
	 * 通过对象查询
	 * @param entity
	 * @return
	 */
	public T getByEntity(T entity) {
		return this.getBaseMapper().getByEntity(entity);
	}


	/**
	 * 批量新增
	 */
	 public void insertBatch(List<T> list) {
		 this.getBaseMapper().insertBatch(list);
	}

	 /**
	  * 批量删除
	  */
	public void updateBatch(List<T> list) {
		 this.getBaseMapper().updateBatch(list);
	}

	//=====================自定义sql=========================================
	
	 /**
     * 查询一个对象返回map
     * @param sql
     * @return
     */
	public Map<String, Object> getBySql(String sql) {
		
		return  this.getBaseMapper().getBySqlReturnMap(sql);
	}

	/**
     * 查询一个对象返回实体类
     * @param sql
     * @return
     */
	public T getBySqlReturnEntity(String sql) {
		return this.getBaseMapper().getBySqlReturnEntity(sql);
	}

	 /**
     * 查询列表返回map
     * @param sql
     * @return
     */
	public List<Map<String, Object>> listBySqlReturnMap(String sql) {
		return this.getBaseMapper().listBySqlReturnMap(sql);
	}

	
	 /**
     * 查询列表返回实体
     * @param sql
     * @return
     */
	public List<T> listBySqlReturnEntity(String sql) {
		return this.getBaseMapper().listBySqlReturnEntity(sql);
	}


    /**
     * 通过sql修改
     * @param sql
     */
	public void updateBysql(String sql) {
		this.getBaseMapper().updateBysql(sql);
	}

	 /**
     * 通过sql删除
     * @param sql
     */
	public void deleteBySql(String sql) {
		this.getBaseMapper().deleteBySql(sql);
	}

	//判断空
	public boolean isEmpty(String str) {
		return (null == str) || (str.trim().length() <= 0);
	}

	public boolean isEmpty(Character cha) {
		return (null == cha) || cha.equals(' ');
	}

	public boolean isEmpty(Object obj) {
		return (null == obj);
	}

	public boolean isEmpty(Object[] objs) {
		return (null == objs) || (objs.length <= 0);
	}

	public boolean isEmpty(Collection<?> obj) {
		return (null == obj) || obj.isEmpty();
	}

	public boolean isEmpty(Set<?> set) {
		return (null == set) || set.isEmpty();
	}

	public boolean isEmpty(Serializable obj) {
		return null == obj;
	}

	public boolean isEmpty(Map<?, ?> map) {
		return (null == map) || map.isEmpty();
	}
}
