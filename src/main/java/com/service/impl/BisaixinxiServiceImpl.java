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


import com.dao.BisaixinxiDao;
import com.entity.BisaixinxiEntity;
import com.service.BisaixinxiService;
import com.entity.vo.BisaixinxiVO;
import com.entity.view.BisaixinxiView;

@Service("bisaixinxiService")
public class BisaixinxiServiceImpl extends ServiceImpl<BisaixinxiDao, BisaixinxiEntity> implements BisaixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BisaixinxiEntity> page = this.selectPage(
                new Query<BisaixinxiEntity>(params).getPage(),
                new EntityWrapper<BisaixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BisaixinxiEntity> wrapper) {
		  Page<BisaixinxiView> page =new Query<BisaixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BisaixinxiVO> selectListVO(Wrapper<BisaixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BisaixinxiVO selectVO(Wrapper<BisaixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BisaixinxiView> selectListView(Wrapper<BisaixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BisaixinxiView selectView(Wrapper<BisaixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
