package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QiquanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QiquanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QiquanxinxiView;


/**
 * 弃权信息
 *
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public interface QiquanxinxiService extends IService<QiquanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QiquanxinxiVO> selectListVO(Wrapper<QiquanxinxiEntity> wrapper);
   	
   	QiquanxinxiVO selectVO(@Param("ew") Wrapper<QiquanxinxiEntity> wrapper);
   	
   	List<QiquanxinxiView> selectListView(Wrapper<QiquanxinxiEntity> wrapper);
   	
   	QiquanxinxiView selectView(@Param("ew") Wrapper<QiquanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QiquanxinxiEntity> wrapper);
   	
}

