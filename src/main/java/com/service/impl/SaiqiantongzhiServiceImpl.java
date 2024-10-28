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


import com.dao.SaiqiantongzhiDao;
import com.entity.SaiqiantongzhiEntity;
import com.service.SaiqiantongzhiService;
import com.entity.vo.SaiqiantongzhiVO;
import com.entity.view.SaiqiantongzhiView;

@Service("saiqiantongzhiService")
public class SaiqiantongzhiServiceImpl extends ServiceImpl<SaiqiantongzhiDao, SaiqiantongzhiEntity> implements SaiqiantongzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SaiqiantongzhiEntity> page = this.selectPage(
                new Query<SaiqiantongzhiEntity>(params).getPage(),
                new EntityWrapper<SaiqiantongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SaiqiantongzhiEntity> wrapper) {
		  Page<SaiqiantongzhiView> page =new Query<SaiqiantongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SaiqiantongzhiVO> selectListVO(Wrapper<SaiqiantongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SaiqiantongzhiVO selectVO(Wrapper<SaiqiantongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SaiqiantongzhiView> selectListView(Wrapper<SaiqiantongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SaiqiantongzhiView selectView(Wrapper<SaiqiantongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
