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

import com.entity.BisaibaomingEntity;
import com.entity.view.BisaibaomingView;

import com.service.BisaibaomingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 比赛报名
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
@RestController
@RequestMapping("/bisaibaoming")
public class BisaibaomingController {
    @Autowired
    private BisaibaomingService bisaibaomingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,BisaibaomingEntity bisaibaoming, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("duiyuan")) {
			bisaibaoming.setDuiyuanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<BisaibaomingEntity> ew = new EntityWrapper<BisaibaomingEntity>();
		PageUtils page = bisaibaomingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bisaibaoming), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,BisaibaomingEntity bisaibaoming, HttpServletRequest request){
        EntityWrapper<BisaibaomingEntity> ew = new EntityWrapper<BisaibaomingEntity>();
		PageUtils page = bisaibaomingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, bisaibaoming), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( BisaibaomingEntity bisaibaoming){
       	EntityWrapper<BisaibaomingEntity> ew = new EntityWrapper<BisaibaomingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( bisaibaoming, "bisaibaoming")); 
        return R.ok().put("data", bisaibaomingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(BisaibaomingEntity bisaibaoming){
        EntityWrapper< BisaibaomingEntity> ew = new EntityWrapper< BisaibaomingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( bisaibaoming, "bisaibaoming")); 
		BisaibaomingView bisaibaomingView =  bisaibaomingService.selectView(ew);
		return R.ok("查询比赛报名成功").put("data", bisaibaomingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        BisaibaomingEntity bisaibaoming = bisaibaomingService.selectById(id);
        return R.ok().put("data", bisaibaoming);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        BisaibaomingEntity bisaibaoming = bisaibaomingService.selectById(id);
        return R.ok().put("data", bisaibaoming);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BisaibaomingEntity bisaibaoming, HttpServletRequest request){
    	bisaibaoming.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(bisaibaoming);

        bisaibaomingService.insert(bisaibaoming);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody BisaibaomingEntity bisaibaoming, HttpServletRequest request){
    	bisaibaoming.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(bisaibaoming);

        bisaibaomingService.insert(bisaibaoming);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BisaibaomingEntity bisaibaoming, HttpServletRequest request){
        //ValidatorUtils.validateEntity(bisaibaoming);
        bisaibaomingService.updateById(bisaibaoming);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        bisaibaomingService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<BisaibaomingEntity> wrapper = new EntityWrapper<BisaibaomingEntity>();
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

		int count = bisaibaomingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
