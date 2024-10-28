package com.entity.view;

import com.entity.SaiqiantongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 赛前通知
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
@TableName("saiqiantongzhi")
public class SaiqiantongzhiView  extends SaiqiantongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SaiqiantongzhiView(){
	}
 
 	public SaiqiantongzhiView(SaiqiantongzhiEntity saiqiantongzhiEntity){
 	try {
			BeanUtils.copyProperties(this, saiqiantongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
