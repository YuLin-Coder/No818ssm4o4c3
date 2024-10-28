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


import com.dao.BisaixiangmuDao;
import com.entity.BisaixiangmuEntity;
import com.service.BisaixiangmuService;
import com.entity.vo.BisaixiangmuVO;
import com.entity.view.BisaixiangmuView;

@Service("bisaixiangmuService")
public class BisaixiangmuServiceImpl extends ServiceImpl<BisaixiangmuDao, BisaixiangmuEntity> implements BisaixiangmuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BisaixiangmuEntity> page = this.selectPage(
                new Query<BisaixiangmuEntity>(params).getPage(),
                new EntityWrapper<BisaixiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BisaixiangmuEntity> wrapper) {
		  Page<BisaixiangmuView> page =new Query<BisaixiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BisaixiangmuVO> selectListVO(Wrapper<BisaixiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BisaixiangmuVO selectVO(Wrapper<BisaixiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BisaixiangmuView> selectListView(Wrapper<BisaixiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BisaixiangmuView selectView(Wrapper<BisaixiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
