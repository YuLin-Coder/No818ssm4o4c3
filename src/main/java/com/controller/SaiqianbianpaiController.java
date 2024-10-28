package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.SaiqianbianpaiEntity;
import com.entity.view.SaiqianbianpaiView;

import com.service.SaiqianbianpaiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 赛前编排
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
@RestController
@RequestMapping("/saiqianbianpai")
public class SaiqianbianpaiController {
    @Autowired
    private SaiqianbianpaiService saiqianbianpaiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SaiqianbianpaiEntity saiqianbianpai, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("duiyuan")) {
			saiqianbianpai.setDuiyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("caipanyuan")) {
			saiqianbianpai.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<SaiqianbianpaiEntity> ew = new EntityWrapper<SaiqianbianpaiEntity>();
		PageUtils page = saiqianbianpaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, saiqianbianpai), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,SaiqianbianpaiEntity saiqianbianpai, HttpServletRequest request){
        EntityWrapper<SaiqianbianpaiEntity> ew = new EntityWrapper<SaiqianbianpaiEntity>();
		PageUtils page = saiqianbianpaiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, saiqianbianpai), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SaiqianbianpaiEntity saiqianbianpai){
       	EntityWrapper<SaiqianbianpaiEntity> ew = new EntityWrapper<SaiqianbianpaiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( saiqianbianpai, "saiqianbianpai")); 
        return R.ok().put("data", saiqianbianpaiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SaiqianbianpaiEntity saiqianbianpai){
        EntityWrapper< SaiqianbianpaiEntity> ew = new EntityWrapper< SaiqianbianpaiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( saiqianbianpai, "saiqianbianpai")); 
		SaiqianbianpaiView saiqianbianpaiView =  saiqianbianpaiService.selectView(ew);
		return R.ok("查询赛前编排成功").put("data", saiqianbianpaiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        SaiqianbianpaiEntity saiqianbianpai = saiqianbianpaiService.selectById(id);
        return R.ok().put("data", saiqianbianpai);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        SaiqianbianpaiEntity saiqianbianpai = saiqianbianpaiService.selectById(id);
        return R.ok().put("data", saiqianbianpai);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SaiqianbianpaiEntity saiqianbianpai, HttpServletRequest request){
    	saiqianbianpai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(saiqianbianpai);

        saiqianbianpaiService.insert(saiqianbianpai);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SaiqianbianpaiEntity saiqianbianpai, HttpServletRequest request){
    	saiqianbianpai.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(saiqianbianpai);

        saiqianbianpaiService.insert(saiqianbianpai);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SaiqianbianpaiEntity saiqianbianpai, HttpServletRequest request){
        //ValidatorUtils.validateEntity(saiqianbianpai);
        saiqianbianpaiService.updateById(saiqianbianpai);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        saiqianbianpaiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<SaiqianbianpaiEntity> wrapper = new EntityWrapper<SaiqianbianpaiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("duiyuan")) {
			wrapper.eq("duiyuanzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("caipanyuan")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = saiqianbianpaiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
