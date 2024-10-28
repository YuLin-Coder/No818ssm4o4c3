package com.entity.view;

import com.entity.SaishichengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 赛事成绩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
@TableName("saishichengji")
public class SaishichengjiView  extends SaishichengjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SaishichengjiView(){
	}
 
 	public SaishichengjiView(SaishichengjiEntity saishichengjiEntity){
 	try {
			BeanUtils.copyProperties(this, saishichengjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
