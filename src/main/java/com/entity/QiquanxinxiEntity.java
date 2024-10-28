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
 * 弃权信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
@TableName("qiquanxinxi")
public class QiquanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QiquanxinxiEntity() {
		
	}
	
	public QiquanxinxiEntity(T t) {
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
	 * 队员账号
	 */
					
	private String duiyuanzhanghao;
	
	/**
	 * 队员姓名
	 */
					
	private String duiyuanxingming;
	
	/**
	 * 比赛名称
	 */
					
	private String bisaimingcheng;
	
	/**
	 * 比赛项目
	 */
					
	private String bisaixiangmu;
	
	/**
	 * 是否弃权
	 */
					
	private String shifouqiquan;
	
	/**
	 * 弃权原因
	 */
					
	private String qiquanyuanyin;
	
	/**
	 * 提交日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tijiaoriqi;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：队员账号
	 */
	public void setDuiyuanzhanghao(String duiyuanzhanghao) {
		this.duiyuanzhanghao = duiyuanzhanghao;
	}
	/**
	 * 获取：队员账号
	 */
	public String getDuiyuanzhanghao() {
		return duiyuanzhanghao;
	}
	/**
	 * 设置：队员姓名
	 */
	public void setDuiyuanxingming(String duiyuanxingming) {
		this.duiyuanxingming = duiyuanxingming;
	}
	/**
	 * 获取：队员姓名
	 */
	public String getDuiyuanxingming() {
		return duiyuanxingming;
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
	 * 设置：是否弃权
	 */
	public void setShifouqiquan(String shifouqiquan) {
		this.shifouqiquan = shifouqiquan;
	}
	/**
	 * 获取：是否弃权
	 */
	public String getShifouqiquan() {
		return shifouqiquan;
	}
	/**
	 * 设置：弃权原因
	 */
	public void setQiquanyuanyin(String qiquanyuanyin) {
		this.qiquanyuanyin = qiquanyuanyin;
	}
	/**
	 * 获取：弃权原因
	 */
	public String getQiquanyuanyin() {
		return qiquanyuanyin;
	}
	/**
	 * 设置：提交日期
	 */
	public void setTijiaoriqi(Date tijiaoriqi) {
		this.tijiaoriqi = tijiaoriqi;
	}
	/**
	 * 获取：提交日期
	 */
	public Date getTijiaoriqi() {
		return tijiaoriqi;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
