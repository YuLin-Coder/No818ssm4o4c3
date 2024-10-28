package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TeshuduiyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TeshuduiyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TeshuduiyuanView;


/**
 * 特殊队员
 *
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public interface TeshuduiyuanService extends IService<TeshuduiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TeshuduiyuanVO> selectListVO(Wrapper<TeshuduiyuanEntity> wrapper);
   	
   	TeshuduiyuanVO selectVO(@Param("ew") Wrapper<TeshuduiyuanEntity> wrapper);
   	
   	List<TeshuduiyuanView> selectListView(Wrapper<TeshuduiyuanEntity> wrapper);
   	
   	TeshuduiyuanView selectView(@Param("ew") Wrapper<TeshuduiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TeshuduiyuanEntity> wrapper);
   	
}

