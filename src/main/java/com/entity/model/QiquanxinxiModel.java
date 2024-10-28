package com.entity.model;

import com.entity.QiquanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 弃权信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-24 19:14:37
 */
public class QiquanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
