package com.entity.view;

import com.entity.BisaixiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 比赛项目
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
@TableName("bisaixiangmu")
public class BisaixiangmuView  extends BisaixiangmuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BisaixiangmuView(){
	}
 
 	public BisaixiangmuView(BisaixiangmuEntity bisaixiangmuEntity){
 	try {
			BeanUtils.copyProperties(this, bisaixiangmuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
