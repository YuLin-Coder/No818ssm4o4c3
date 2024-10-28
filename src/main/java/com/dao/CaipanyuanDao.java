package com.dao;

import com.entity.CaipanyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CaipanyuanVO;
import com.entity.view.CaipanyuanView;


/**
 * 裁判员
 * 
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public interface CaipanyuanDao extends BaseMapper<CaipanyuanEntity> {
	
	List<CaipanyuanVO> selectListVO(@Param("ew") Wrapper<CaipanyuanEntity> wrapper);
	
	CaipanyuanVO selectVO(@Param("ew") Wrapper<CaipanyuanEntity> wrapper);
	
	List<CaipanyuanView> selectListView(@Param("ew") Wrapper<CaipanyuanEntity> wrapper);

	List<CaipanyuanView> selectListView(Pagination page,@Param("ew") Wrapper<CaipanyuanEntity> wrapper);
	
	CaipanyuanView selectView(@Param("ew") Wrapper<CaipanyuanEntity> wrapper);
	
}
