package com.dao;

import com.entity.SaizhongxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SaizhongxinxiVO;
import com.entity.view.SaizhongxinxiView;


/**
 * 赛中信息
 * 
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public interface SaizhongxinxiDao extends BaseMapper<SaizhongxinxiEntity> {
	
	List<SaizhongxinxiVO> selectListVO(@Param("ew") Wrapper<SaizhongxinxiEntity> wrapper);
	
	SaizhongxinxiVO selectVO(@Param("ew") Wrapper<SaizhongxinxiEntity> wrapper);
	
	List<SaizhongxinxiView> selectListView(@Param("ew") Wrapper<SaizhongxinxiEntity> wrapper);

	List<SaizhongxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<SaizhongxinxiEntity> wrapper);
	
	SaizhongxinxiView selectView(@Param("ew") Wrapper<SaizhongxinxiEntity> wrapper);
	
}
