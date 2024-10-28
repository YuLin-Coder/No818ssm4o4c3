package com.entity.view;

import com.entity.SaiqianbianpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 赛前编排
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
@TableName("saiqianbianpai")
public class SaiqianbianpaiView  extends SaiqianbianpaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SaiqianbianpaiView(){
	}
 
 	public SaiqianbianpaiView(SaiqianbianpaiEntity saiqianbianpaiEntity){
 	try {
			BeanUtils.copyProperties(this, saiqianbianpaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
