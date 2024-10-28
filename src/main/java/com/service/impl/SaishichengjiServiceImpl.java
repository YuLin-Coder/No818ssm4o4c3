package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.SaishichengjiDao;
import com.entity.SaishichengjiEntity;
import com.service.SaishichengjiService;
import com.entity.vo.SaishichengjiVO;
import com.entity.view.SaishichengjiView;

@Service("saishichengjiService")
public class SaishichengjiServiceImpl extends ServiceImpl<SaishichengjiDao, SaishichengjiEntity> implements SaishichengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SaishichengjiEntity> page = this.selectPage(
                new Query<SaishichengjiEntity>(params).getPage(),
                new EntityWrapper<SaishichengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SaishichengjiEntity> wrapper) {
		  Page<SaishichengjiView> page =new Query<SaishichengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SaishichengjiVO> selectListVO(Wrapper<SaishichengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SaishichengjiVO selectVO(Wrapper<SaishichengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SaishichengjiView> selectListView(Wrapper<SaishichengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SaishichengjiView selectView(Wrapper<SaishichengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
