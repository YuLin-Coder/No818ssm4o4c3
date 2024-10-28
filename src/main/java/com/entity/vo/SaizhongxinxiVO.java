package com.entity.vo;

import com.entity.SaizhongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 赛中信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public class SaizhongxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 比赛名称
	 */
	
	private String bisaimingcheng;
		
	/**
	 * 比赛项目
	 */
	
	private String bisaixiangmu;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 队员账号
	 */
	
	private String duiyuanzhanghao;
		
	/**
	 * 队员姓名
	 */
	
	private String duiyuanxingming;
		
	/**
	 * 原号码编制
	 */
	
	private String yuanhaomabianzhi;
		
	/**
	 * 新号码编制
	 */
	
	private String xinhaomabianzhi;
		
	/**
	 * 原赛次
	 */
	
	private String yuansaici;
		
	/**
	 * 新赛次
	 */
	
	private String xinsaici;
		
	/**
	 * 原分组
	 */
	
	private String yuanfenzu;
		
	/**
	 * 新分组
	 */
	
	private String xinfenzu;
		
	/**
	 * 更改时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date genggaishijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
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
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
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
	 * 设置：原号码编制
	 */
	 
	public void setYuanhaomabianzhi(String yuanhaomabianzhi) {
		this.yuanhaomabianzhi = yuanhaomabianzhi;
	}
	
	/**
	 * 获取：原号码编制
	 */
	public String getYuanhaomabianzhi() {
		return yuanhaomabianzhi;
	}
				
	
	/**
	 * 设置：新号码编制
	 */
	 
	public void setXinhaomabianzhi(String xinhaomabianzhi) {
		this.xinhaomabianzhi = xinhaomabianzhi;
	}
	
	/**
	 * 获取：新号码编制
	 */
	public String getXinhaomabianzhi() {
		return xinhaomabianzhi;
	}
				
	
	/**
	 * 设置：原赛次
	 */
	 
	public void setYuansaici(String yuansaici) {
		this.yuansaici = yuansaici;
	}
	
	/**
	 * 获取：原赛次
	 */
	public String getYuansaici() {
		return yuansaici;
	}
				
	
	/**
	 * 设置：新赛次
	 */
	 
	public void setXinsaici(String xinsaici) {
		this.xinsaici = xinsaici;
	}
	
	/**
	 * 获取：新赛次
	 */
	public String getXinsaici() {
		return xinsaici;
	}
				
	
	/**
	 * 设置：原分组
	 */
	 
	public void setYuanfenzu(String yuanfenzu) {
		this.yuanfenzu = yuanfenzu;
	}
	
	/**
	 * 获取：原分组
	 */
	public String getYuanfenzu() {
		return yuanfenzu;
	}
				
	
	/**
	 * 设置：新分组
	 */
	 
	public void setXinfenzu(String xinfenzu) {
		this.xinfenzu = xinfenzu;
	}
	
	/**
	 * 获取：新分组
	 */
	public String getXinfenzu() {
		return xinfenzu;
	}
				
	
	/**
	 * 设置：更改时间
	 */
	 
	public void setGenggaishijian(Date genggaishijian) {
		this.genggaishijian = genggaishijian;
	}
	
	/**
	 * 获取：更改时间
	 */
	public Date getGenggaishijian() {
		return genggaishijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
