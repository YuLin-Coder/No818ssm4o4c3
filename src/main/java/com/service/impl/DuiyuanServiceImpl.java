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


import com.dao.DuiyuanDao;
import com.entity.DuiyuanEntity;
import com.service.DuiyuanService;
import com.entity.vo.DuiyuanVO;
import com.entity.view.DuiyuanView;

@Service("duiyuanService")
public class DuiyuanServiceImpl extends ServiceImpl<DuiyuanDao, DuiyuanEntity> implements DuiyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DuiyuanEntity> page = this.selectPage(
                new Query<DuiyuanEntity>(params).getPage(),
                new EntityWrapper<DuiyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DuiyuanEntity> wrapper) {
		  Page<DuiyuanView> page =new Query<DuiyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DuiyuanVO> selectListVO(Wrapper<DuiyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DuiyuanVO selectVO(Wrapper<DuiyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DuiyuanView> selectListView(Wrapper<DuiyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DuiyuanView selectView(Wrapper<DuiyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
