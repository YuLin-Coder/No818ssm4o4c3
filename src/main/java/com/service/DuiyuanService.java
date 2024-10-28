package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DuiyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DuiyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DuiyuanView;


/**
 * 队员
 *
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public interface DuiyuanService extends IService<DuiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DuiyuanVO> selectListVO(Wrapper<DuiyuanEntity> wrapper);
   	
   	DuiyuanVO selectVO(@Param("ew") Wrapper<DuiyuanEntity> wrapper);
   	
   	List<DuiyuanView> selectListView(Wrapper<DuiyuanEntity> wrapper);
   	
   	DuiyuanView selectView(@Param("ew") Wrapper<DuiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DuiyuanEntity> wrapper);
   	
}

