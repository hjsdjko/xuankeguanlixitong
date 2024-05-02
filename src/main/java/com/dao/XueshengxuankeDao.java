package com.dao;

import com.entity.XueshengxuankeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengxuankeView;

/**
 * 学生选课 Dao 接口
 *
 * @author 
 */
public interface XueshengxuankeDao extends BaseMapper<XueshengxuankeEntity> {

   List<XueshengxuankeView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
