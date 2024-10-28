package com.dao;

import com.entity.BisaibaomingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BisaibaomingVO;
import com.entity.view.BisaibaomingView;


/**
 * 比赛报名
 * 
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public interface BisaibaomingDao extends BaseMapper<BisaibaomingEntity> {
	
	List<BisaibaomingVO> selectListVO(@Param("ew") Wrapper<BisaibaomingEntity> wrapper);
	
	BisaibaomingVO selectVO(@Param("ew") Wrapper<BisaibaomingEntity> wrapper);
	
	List<BisaibaomingView> selectListView(@Param("ew") Wrapper<BisaibaomingEntity> wrapper);

	List<BisaibaomingView> selectListView(Pagination page,@Param("ew") Wrapper<BisaibaomingEntity> wrapper);
	
	BisaibaomingView selectView(@Param("ew") Wrapper<BisaibaomingEntity> wrapper);
	
}
