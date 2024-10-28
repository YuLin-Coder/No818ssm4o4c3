package com.dao;

import com.entity.DuiyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DuiyuanVO;
import com.entity.view.DuiyuanView;


/**
 * 队员
 * 
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public interface DuiyuanDao extends BaseMapper<DuiyuanEntity> {
	
	List<DuiyuanVO> selectListVO(@Param("ew") Wrapper<DuiyuanEntity> wrapper);
	
	DuiyuanVO selectVO(@Param("ew") Wrapper<DuiyuanEntity> wrapper);
	
	List<DuiyuanView> selectListView(@Param("ew") Wrapper<DuiyuanEntity> wrapper);

	List<DuiyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DuiyuanEntity> wrapper);
	
	DuiyuanView selectView(@Param("ew") Wrapper<DuiyuanEntity> wrapper);
	
}
