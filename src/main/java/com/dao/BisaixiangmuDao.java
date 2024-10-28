package com.dao;

import com.entity.BisaixiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BisaixiangmuVO;
import com.entity.view.BisaixiangmuView;


/**
 * 比赛项目
 * 
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public interface BisaixiangmuDao extends BaseMapper<BisaixiangmuEntity> {
	
	List<BisaixiangmuVO> selectListVO(@Param("ew") Wrapper<BisaixiangmuEntity> wrapper);
	
	BisaixiangmuVO selectVO(@Param("ew") Wrapper<BisaixiangmuEntity> wrapper);
	
	List<BisaixiangmuView> selectListView(@Param("ew") Wrapper<BisaixiangmuEntity> wrapper);

	List<BisaixiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<BisaixiangmuEntity> wrapper);
	
	BisaixiangmuView selectView(@Param("ew") Wrapper<BisaixiangmuEntity> wrapper);
	
}
