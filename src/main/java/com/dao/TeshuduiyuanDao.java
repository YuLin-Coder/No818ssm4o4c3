package com.dao;

import com.entity.TeshuduiyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TeshuduiyuanVO;
import com.entity.view.TeshuduiyuanView;


/**
 * 特殊队员
 * 
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public interface TeshuduiyuanDao extends BaseMapper<TeshuduiyuanEntity> {
	
	List<TeshuduiyuanVO> selectListVO(@Param("ew") Wrapper<TeshuduiyuanEntity> wrapper);
	
	TeshuduiyuanVO selectVO(@Param("ew") Wrapper<TeshuduiyuanEntity> wrapper);
	
	List<TeshuduiyuanView> selectListView(@Param("ew") Wrapper<TeshuduiyuanEntity> wrapper);

	List<TeshuduiyuanView> selectListView(Pagination page,@Param("ew") Wrapper<TeshuduiyuanEntity> wrapper);
	
	TeshuduiyuanView selectView(@Param("ew") Wrapper<TeshuduiyuanEntity> wrapper);
	
}
