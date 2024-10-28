package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SaiqianbianpaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SaiqianbianpaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SaiqianbianpaiView;


/**
 * 赛前编排
 *
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public interface SaiqianbianpaiService extends IService<SaiqianbianpaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SaiqianbianpaiVO> selectListVO(Wrapper<SaiqianbianpaiEntity> wrapper);
   	
   	SaiqianbianpaiVO selectVO(@Param("ew") Wrapper<SaiqianbianpaiEntity> wrapper);
   	
   	List<SaiqianbianpaiView> selectListView(Wrapper<SaiqianbianpaiEntity> wrapper);
   	
   	SaiqianbianpaiView selectView(@Param("ew") Wrapper<SaiqianbianpaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SaiqianbianpaiEntity> wrapper);
   	
}

