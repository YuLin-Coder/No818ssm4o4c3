package com.dao;

import com.entity.SaiqiantongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SaiqiantongzhiVO;
import com.entity.view.SaiqiantongzhiView;


/**
 * 赛前通知
 * 
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public interface SaiqiantongzhiDao extends BaseMapper<SaiqiantongzhiEntity> {
	
	List<SaiqiantongzhiVO> selectListVO(@Param("ew") Wrapper<SaiqiantongzhiEntity> wrapper);
	
	SaiqiantongzhiVO selectVO(@Param("ew") Wrapper<SaiqiantongzhiEntity> wrapper);
	
	List<SaiqiantongzhiView> selectListView(@Param("ew") Wrapper<SaiqiantongzhiEntity> wrapper);

	List<SaiqiantongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<SaiqiantongzhiEntity> wrapper);
	
	SaiqiantongzhiView selectView(@Param("ew") Wrapper<SaiqiantongzhiEntity> wrapper);
	
}
