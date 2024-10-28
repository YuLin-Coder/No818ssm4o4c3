package com.entity.view;

import com.entity.TeshuduiyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 特殊队员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
@TableName("teshuduiyuan")
public class TeshuduiyuanView  extends TeshuduiyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TeshuduiyuanView(){
	}
 
 	public TeshuduiyuanView(TeshuduiyuanEntity teshuduiyuanEntity){
 	try {
			BeanUtils.copyProperties(this, teshuduiyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
