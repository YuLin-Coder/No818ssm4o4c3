package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BisaixiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BisaixiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BisaixiangmuView;


/**
 * 比赛项目
 *
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public interface BisaixiangmuService extends IService<BisaixiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BisaixiangmuVO> selectListVO(Wrapper<BisaixiangmuEntity> wrapper);
   	
   	BisaixiangmuVO selectVO(@Param("ew") Wrapper<BisaixiangmuEntity> wrapper);
   	
   	List<BisaixiangmuView> selectListView(Wrapper<BisaixiangmuEntity> wrapper);
   	
   	BisaixiangmuView selectView(@Param("ew") Wrapper<BisaixiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BisaixiangmuEntity> wrapper);
   	
}

