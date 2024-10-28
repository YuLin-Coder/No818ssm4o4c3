package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BisaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BisaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BisaixinxiView;


/**
 * 比赛信息
 *
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public interface BisaixinxiService extends IService<BisaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BisaixinxiVO> selectListVO(Wrapper<BisaixinxiEntity> wrapper);
   	
   	BisaixinxiVO selectVO(@Param("ew") Wrapper<BisaixinxiEntity> wrapper);
   	
   	List<BisaixinxiView> selectListView(Wrapper<BisaixinxiEntity> wrapper);
   	
   	BisaixinxiView selectView(@Param("ew") Wrapper<BisaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BisaixinxiEntity> wrapper);
   	
}

