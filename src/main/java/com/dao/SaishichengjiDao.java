package com.dao;

import com.entity.SaishichengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SaishichengjiVO;
import com.entity.view.SaishichengjiView;


/**
 * 赛事成绩
 * 
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public interface SaishichengjiDao extends BaseMapper<SaishichengjiEntity> {
	
	List<SaishichengjiVO> selectListVO(@Param("ew") Wrapper<SaishichengjiEntity> wrapper);
	
	SaishichengjiVO selectVO(@Param("ew") Wrapper<SaishichengjiEntity> wrapper);
	
	List<SaishichengjiView> selectListView(@Param("ew") Wrapper<SaishichengjiEntity> wrapper);

	List<SaishichengjiView> selectListView(Pagination page,@Param("ew") Wrapper<SaishichengjiEntity> wrapper);
	
	SaishichengjiView selectView(@Param("ew") Wrapper<SaishichengjiEntity> wrapper);
	
}
