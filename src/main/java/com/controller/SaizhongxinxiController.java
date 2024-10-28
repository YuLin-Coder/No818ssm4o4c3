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

import com.entity.SaizhongxinxiEntity;
import com.entity.view.SaizhongxinxiView;

import com.service.SaizhongxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 赛中信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
@RestController
@RequestMapping("/saizhongxinxi")
public class SaizhongxinxiController {
    @Autowired
    private SaizhongxinxiService saizhongxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,SaizhongxinxiEntity saizhongxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("duiyuan")) {
			saizhongxinxi.setDuiyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("caipanyuan")) {
			saizhongxinxi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<SaizhongxinxiEntity> ew = new EntityWrapper<SaizhongxinxiEntity>();
		PageUtils page = saizhongxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, saizhongxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,SaizhongxinxiEntity saizhongxinxi, HttpServletRequest request){
        EntityWrapper<SaizhongxinxiEntity> ew = new EntityWrapper<SaizhongxinxiEntity>();
		PageUtils page = saizhongxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, saizhongxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( SaizhongxinxiEntity saizhongxinxi){
       	EntityWrapper<SaizhongxinxiEntity> ew = new EntityWrapper<SaizhongxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( saizhongxinxi, "saizhongxinxi")); 
        return R.ok().put("data", saizhongxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(SaizhongxinxiEntity saizhongxinxi){
        EntityWrapper< SaizhongxinxiEntity> ew = new EntityWrapper< SaizhongxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( saizhongxinxi, "saizhongxinxi")); 
		SaizhongxinxiView saizhongxinxiView =  saizhongxinxiService.selectView(ew);
		return R.ok("查询赛中信息成功").put("data", saizhongxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        SaizhongxinxiEntity saizhongxinxi = saizhongxinxiService.selectById(id);
        return R.ok().put("data", saizhongxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        SaizhongxinxiEntity saizhongxinxi = saizhongxinxiService.selectById(id);
        return R.ok().put("data", saizhongxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SaizhongxinxiEntity saizhongxinxi, HttpServletRequest request){
    	saizhongxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(saizhongxinxi);

        saizhongxinxiService.insert(saizhongxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody SaizhongxinxiEntity saizhongxinxi, HttpServletRequest request){
    	saizhongxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(saizhongxinxi);

        saizhongxinxiService.insert(saizhongxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SaizhongxinxiEntity saizhongxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(saizhongxinxi);
        saizhongxinxiService.updateById(saizhongxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        saizhongxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<SaizhongxinxiEntity> wrapper = new EntityWrapper<SaizhongxinxiEntity>();
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

		int count = saizhongxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
