package com.lemon.demo.core.universal;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * @Author: Qy
 * @Description: 定制版MyBatis Mapper插件接口，如需其他接口参考官方文档自行添加。
 * @Date: 2019-02-06 16:13
 */
public interface Mapper<T> extends BaseMapper<T>, ConditionMapper<T>, IdsMapper<T>, InsertListMapper<T> {
}
