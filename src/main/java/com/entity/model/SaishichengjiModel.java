package com.entity.model;

import com.entity.SaishichengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 赛事成绩
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public class SaishichengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 比赛名称
	 */
	
	private String bisaimingcheng;
		
	/**
	 * 结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jieshushijian;
		
	/**
	 * 队员账号
	 */
	
	private String duiyuanzhanghao;
		
	/**
	 * 队员姓名
	 */
	
	private String duiyuanxingming;
		
	/**
	 * 赛事成绩
	 */
	
	private String saishichengji;
		
	/**
	 * 赛事排名
	 */
	
	private String saishipaiming;
		
	/**
	 * 得到奖项
	 */
	
	private String dedaojiangxiang;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
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
	 * 设置：结束时间
	 */
	 
	public void setJieshushijian(Date jieshushijian) {
		this.jieshushijian = jieshushijian;
	}
	
	/**
	 * 获取：结束时间
	 */
	public Date getJieshushijian() {
		return jieshushijian;
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
	 * 设置：赛事成绩
	 */
	 
	public void setSaishichengji(String saishichengji) {
		this.saishichengji = saishichengji;
	}
	
	/**
	 * 获取：赛事成绩
	 */
	public String getSaishichengji() {
		return saishichengji;
	}
				
	
	/**
	 * 设置：赛事排名
	 */
	 
	public void setSaishipaiming(String saishipaiming) {
		this.saishipaiming = saishipaiming;
	}
	
	/**
	 * 获取：赛事排名
	 */
	public String getSaishipaiming() {
		return saishipaiming;
	}
				
	
	/**
	 * 设置：得到奖项
	 */
	 
	public void setDedaojiangxiang(String dedaojiangxiang) {
		this.dedaojiangxiang = dedaojiangxiang;
	}
	
	/**
	 * 获取：得到奖项
	 */
	public String getDedaojiangxiang() {
		return dedaojiangxiang;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
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
