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
 * 赛前编排
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
@TableName("saiqianbianpai")
public class SaiqianbianpaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SaiqianbianpaiEntity() {
		
	}
	
	public SaiqianbianpaiEntity(T t) {
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
	 * 比塞名称
	 */
					
	private String bisaimingcheng;
	
	/**
	 * 比赛项目
	 */
					
	private String bisaixiangmu;
	
	/**
	 * 队员账号
	 */
					
	private String duiyuanzhanghao;
	
	/**
	 * 队员姓名
	 */
					
	private String duiyuanxingming;
	
	/**
	 * 号码编制
	 */
					
	private String haomabianzhi;
	
	/**
	 * 赛次设置
	 */
					
	private String saicishezhi;
	
	/**
	 * 赛前分组
	 */
					
	private String saiqianfenzu;
	
	/**
	 * 编排时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date bianpaishijian;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	
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
	 * 设置：比塞名称
	 */
	public void setBisaimingcheng(String bisaimingcheng) {
		this.bisaimingcheng = bisaimingcheng;
	}
	/**
	 * 获取：比塞名称
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
	 * 设置：号码编制
	 */
	public void setHaomabianzhi(String haomabianzhi) {
		this.haomabianzhi = haomabianzhi;
	}
	/**
	 * 获取：号码编制
	 */
	public String getHaomabianzhi() {
		return haomabianzhi;
	}
	/**
	 * 设置：赛次设置
	 */
	public void setSaicishezhi(String saicishezhi) {
		this.saicishezhi = saicishezhi;
	}
	/**
	 * 获取：赛次设置
	 */
	public String getSaicishezhi() {
		return saicishezhi;
	}
	/**
	 * 设置：赛前分组
	 */
	public void setSaiqianfenzu(String saiqianfenzu) {
		this.saiqianfenzu = saiqianfenzu;
	}
	/**
	 * 获取：赛前分组
	 */
	public String getSaiqianfenzu() {
		return saiqianfenzu;
	}
	/**
	 * 设置：编排时间
	 */
	public void setBianpaishijian(Date bianpaishijian) {
		this.bianpaishijian = bianpaishijian;
	}
	/**
	 * 获取：编排时间
	 */
	public Date getBianpaishijian() {
		return bianpaishijian;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}

}
