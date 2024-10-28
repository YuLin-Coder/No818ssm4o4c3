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


import com.dao.BisaibaomingDao;
import com.entity.BisaibaomingEntity;
import com.service.BisaibaomingService;
import com.entity.vo.BisaibaomingVO;
import com.entity.view.BisaibaomingView;

@Service("bisaibaomingService")
public class BisaibaomingServiceImpl extends ServiceImpl<BisaibaomingDao, BisaibaomingEntity> implements BisaibaomingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BisaibaomingEntity> page = this.selectPage(
                new Query<BisaibaomingEntity>(params).getPage(),
                new EntityWrapper<BisaibaomingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BisaibaomingEntity> wrapper) {
		  Page<BisaibaomingView> page =new Query<BisaibaomingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BisaibaomingVO> selectListVO(Wrapper<BisaibaomingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BisaibaomingVO selectVO(Wrapper<BisaibaomingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BisaibaomingView> selectListView(Wrapper<BisaibaomingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BisaibaomingView selectView(Wrapper<BisaibaomingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
