package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SaishichengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SaishichengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SaishichengjiView;


/**
 * 赛事成绩
 *
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public interface SaishichengjiService extends IService<SaishichengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SaishichengjiVO> selectListVO(Wrapper<SaishichengjiEntity> wrapper);
   	
   	SaishichengjiVO selectVO(@Param("ew") Wrapper<SaishichengjiEntity> wrapper);
   	
   	List<SaishichengjiView> selectListView(Wrapper<SaishichengjiEntity> wrapper);
   	
   	SaishichengjiView selectView(@Param("ew") Wrapper<SaishichengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SaishichengjiEntity> wrapper);
   	
}

