package com.dao;

import com.entity.QiquanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QiquanxinxiVO;
import com.entity.view.QiquanxinxiView;


/**
 * 弃权信息
 * 
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public interface QiquanxinxiDao extends BaseMapper<QiquanxinxiEntity> {
	
	List<QiquanxinxiVO> selectListVO(@Param("ew") Wrapper<QiquanxinxiEntity> wrapper);
	
	QiquanxinxiVO selectVO(@Param("ew") Wrapper<QiquanxinxiEntity> wrapper);
	
	List<QiquanxinxiView> selectListView(@Param("ew") Wrapper<QiquanxinxiEntity> wrapper);

	List<QiquanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QiquanxinxiEntity> wrapper);
	
	QiquanxinxiView selectView(@Param("ew") Wrapper<QiquanxinxiEntity> wrapper);
	
}
