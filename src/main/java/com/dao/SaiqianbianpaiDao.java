package com.dao;

import com.entity.SaiqianbianpaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SaiqianbianpaiVO;
import com.entity.view.SaiqianbianpaiView;


/**
 * 赛前编排
 * 
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public interface SaiqianbianpaiDao extends BaseMapper<SaiqianbianpaiEntity> {
	
	List<SaiqianbianpaiVO> selectListVO(@Param("ew") Wrapper<SaiqianbianpaiEntity> wrapper);
	
	SaiqianbianpaiVO selectVO(@Param("ew") Wrapper<SaiqianbianpaiEntity> wrapper);
	
	List<SaiqianbianpaiView> selectListView(@Param("ew") Wrapper<SaiqianbianpaiEntity> wrapper);

	List<SaiqianbianpaiView> selectListView(Pagination page,@Param("ew") Wrapper<SaiqianbianpaiEntity> wrapper);
	
	SaiqianbianpaiView selectView(@Param("ew") Wrapper<SaiqianbianpaiEntity> wrapper);
	
}
