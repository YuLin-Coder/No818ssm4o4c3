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


import com.dao.SaiqianbianpaiDao;
import com.entity.SaiqianbianpaiEntity;
import com.service.SaiqianbianpaiService;
import com.entity.vo.SaiqianbianpaiVO;
import com.entity.view.SaiqianbianpaiView;

@Service("saiqianbianpaiService")
public class SaiqianbianpaiServiceImpl extends ServiceImpl<SaiqianbianpaiDao, SaiqianbianpaiEntity> implements SaiqianbianpaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SaiqianbianpaiEntity> page = this.selectPage(
                new Query<SaiqianbianpaiEntity>(params).getPage(),
                new EntityWrapper<SaiqianbianpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SaiqianbianpaiEntity> wrapper) {
		  Page<SaiqianbianpaiView> page =new Query<SaiqianbianpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SaiqianbianpaiVO> selectListVO(Wrapper<SaiqianbianpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SaiqianbianpaiVO selectVO(Wrapper<SaiqianbianpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SaiqianbianpaiView> selectListView(Wrapper<SaiqianbianpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SaiqianbianpaiView selectView(Wrapper<SaiqianbianpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
