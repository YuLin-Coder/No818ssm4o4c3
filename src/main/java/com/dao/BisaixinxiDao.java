package com.dao;

import com.entity.BisaixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BisaixinxiVO;
import com.entity.view.BisaixinxiView;


/**
 * 比赛信息
 * 
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public interface BisaixinxiDao extends BaseMapper<BisaixinxiEntity> {
	
	List<BisaixinxiVO> selectListVO(@Param("ew") Wrapper<BisaixinxiEntity> wrapper);
	
	BisaixinxiVO selectVO(@Param("ew") Wrapper<BisaixinxiEntity> wrapper);
	
	List<BisaixinxiView> selectListView(@Param("ew") Wrapper<BisaixinxiEntity> wrapper);

	List<BisaixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BisaixinxiEntity> wrapper);
	
	BisaixinxiView selectView(@Param("ew") Wrapper<BisaixinxiEntity> wrapper);
	
}
