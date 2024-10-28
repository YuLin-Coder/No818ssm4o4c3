package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 比赛信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
@TableName("bisaixinxi")
public class BisaixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BisaixinxiEntity() {
		
	}
	
	public BisaixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 编号
	 */
					
	private String bianhao;
	
	/**
	 * 比赛名称
	 */
					
	private String bisaimingcheng;
	
	/**
	 * 比赛项目
	 */
					
	private String bisaixiangmu;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 比赛时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date bisaishijian;
	
	/**
	 * 文件
	 */
					
	private String wenjian;
	
	/**
	 * 比赛地点
	 */
					
	private String bisaididian;
	
	/**
	 * 比赛要求
	 */
					
	private String bisaiyaoqiu;
	
	/**
	 * 比赛内容
	 */
					
	private String bisaineirong;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：编号
	 */
	public void setBianhao(String bianhao) {
		this.bianhao = bianhao;
	}
	/**
	 * 获取：编号
	 */
	public String getBianhao() {
		return bianhao;
	}
	/**
	 * 设置：比赛名称
	 */
	public void setBisaimingcheng(String bisaimingcheng) {
		this.bisaimingcheng = bisaimingcheng;
	}
	/**
	 * 获取：比赛名称
	 */
	public String getBisaimingcheng() {
		return bisaimingcheng;
	}
	/**
	 * 设置：比赛项目
	 */
	public void setBisaixiangmu(String bisaixiangmu) {
		this.bisaixiangmu = bisaixiangmu;
	}
	/**
	 * 获取：比赛项目
	 */
	public String getBisaixiangmu() {
		return bisaixiangmu;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：比赛时间
	 */
	public void setBisaishijian(Date bisaishijian) {
		this.bisaishijian = bisaishijian;
	}
	/**
	 * 获取：比赛时间
	 */
	public Date getBisaishijian() {
		return bisaishijian;
	}
	/**
	 * 设置：文件
	 */
	public void setWenjian(String wenjian) {
		this.wenjian = wenjian;
	}
	/**
	 * 获取：文件
	 */
	public String getWenjian() {
		return wenjian;
	}
	/**
	 * 设置：比赛地点
	 */
	public void setBisaididian(String bisaididian) {
		this.bisaididian = bisaididian;
	}
	/**
	 * 获取：比赛地点
	 */
	public String getBisaididian() {
		return bisaididian;
	}
	/**
	 * 设置：比赛要求
	 */
	public void setBisaiyaoqiu(String bisaiyaoqiu) {
		this.bisaiyaoqiu = bisaiyaoqiu;
	}
	/**
	 * 获取：比赛要求
	 */
	public String getBisaiyaoqiu() {
		return bisaiyaoqiu;
	}
	/**
	 * 设置：比赛内容
	 */
	public void setBisaineirong(String bisaineirong) {
		this.bisaineirong = bisaineirong;
	}
	/**
	 * 获取：比赛内容
	 */
	public String getBisaineirong() {
		return bisaineirong;
	}

}
