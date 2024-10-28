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


import com.dao.QiquanxinxiDao;
import com.entity.QiquanxinxiEntity;
import com.service.QiquanxinxiService;
import com.entity.vo.QiquanxinxiVO;
import com.entity.view.QiquanxinxiView;

@Service("qiquanxinxiService")
public class QiquanxinxiServiceImpl extends ServiceImpl<QiquanxinxiDao, QiquanxinxiEntity> implements QiquanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QiquanxinxiEntity> page = this.selectPage(
                new Query<QiquanxinxiEntity>(params).getPage(),
                new EntityWrapper<QiquanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QiquanxinxiEntity> wrapper) {
		  Page<QiquanxinxiView> page =new Query<QiquanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QiquanxinxiVO> selectListVO(Wrapper<QiquanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QiquanxinxiVO selectVO(Wrapper<QiquanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QiquanxinxiView> selectListView(Wrapper<QiquanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QiquanxinxiView selectView(Wrapper<QiquanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
