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


import com.dao.SaizhongxinxiDao;
import com.entity.SaizhongxinxiEntity;
import com.service.SaizhongxinxiService;
import com.entity.vo.SaizhongxinxiVO;
import com.entity.view.SaizhongxinxiView;

@Service("saizhongxinxiService")
public class SaizhongxinxiServiceImpl extends ServiceImpl<SaizhongxinxiDao, SaizhongxinxiEntity> implements SaizhongxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SaizhongxinxiEntity> page = this.selectPage(
                new Query<SaizhongxinxiEntity>(params).getPage(),
                new EntityWrapper<SaizhongxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SaizhongxinxiEntity> wrapper) {
		  Page<SaizhongxinxiView> page =new Query<SaizhongxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SaizhongxinxiVO> selectListVO(Wrapper<SaizhongxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SaizhongxinxiVO selectVO(Wrapper<SaizhongxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SaizhongxinxiView> selectListView(Wrapper<SaizhongxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SaizhongxinxiView selectView(Wrapper<SaizhongxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
