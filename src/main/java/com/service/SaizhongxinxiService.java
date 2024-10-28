package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SaizhongxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SaizhongxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SaizhongxinxiView;


/**
 * 赛中信息
 *
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public interface SaizhongxinxiService extends IService<SaizhongxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SaizhongxinxiVO> selectListVO(Wrapper<SaizhongxinxiEntity> wrapper);
   	
   	SaizhongxinxiVO selectVO(@Param("ew") Wrapper<SaizhongxinxiEntity> wrapper);
   	
   	List<SaizhongxinxiView> selectListView(Wrapper<SaizhongxinxiEntity> wrapper);
   	
   	SaizhongxinxiView selectView(@Param("ew") Wrapper<SaizhongxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SaizhongxinxiEntity> wrapper);
   	
}

