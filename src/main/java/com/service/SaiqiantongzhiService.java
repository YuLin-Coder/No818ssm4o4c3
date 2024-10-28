package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SaiqiantongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SaiqiantongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SaiqiantongzhiView;


/**
 * 赛前通知
 *
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public interface SaiqiantongzhiService extends IService<SaiqiantongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SaiqiantongzhiVO> selectListVO(Wrapper<SaiqiantongzhiEntity> wrapper);
   	
   	SaiqiantongzhiVO selectVO(@Param("ew") Wrapper<SaiqiantongzhiEntity> wrapper);
   	
   	List<SaiqiantongzhiView> selectListView(Wrapper<SaiqiantongzhiEntity> wrapper);
   	
   	SaiqiantongzhiView selectView(@Param("ew") Wrapper<SaiqiantongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SaiqiantongzhiEntity> wrapper);
   	
}

