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


import com.dao.TeshuduiyuanDao;
import com.entity.TeshuduiyuanEntity;
import com.service.TeshuduiyuanService;
import com.entity.vo.TeshuduiyuanVO;
import com.entity.view.TeshuduiyuanView;

@Service("teshuduiyuanService")
public class TeshuduiyuanServiceImpl extends ServiceImpl<TeshuduiyuanDao, TeshuduiyuanEntity> implements TeshuduiyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TeshuduiyuanEntity> page = this.selectPage(
                new Query<TeshuduiyuanEntity>(params).getPage(),
                new EntityWrapper<TeshuduiyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TeshuduiyuanEntity> wrapper) {
		  Page<TeshuduiyuanView> page =new Query<TeshuduiyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TeshuduiyuanVO> selectListVO(Wrapper<TeshuduiyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TeshuduiyuanVO selectVO(Wrapper<TeshuduiyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TeshuduiyuanView> selectListView(Wrapper<TeshuduiyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TeshuduiyuanView selectView(Wrapper<TeshuduiyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
