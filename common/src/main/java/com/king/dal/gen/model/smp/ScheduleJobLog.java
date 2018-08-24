package com.king.dal.gen.model.smp;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;

import com.king.common.annotation.PropertyExt;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 定时执行日志
 * @author King chen
 * @email 396885563@qq.com
 * @date 2017年12月29日
 */
@ApiModel("定时任务日志")
public class ScheduleJobLog implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 日志id
	 */
	@Id
	@ApiModelProperty("任务日志id")
	@PropertyExt(isExport=false)
	private Long logId;
	
	/**
	 * 任务id
	 */
	@ApiModelProperty("任务id")
	@PropertyExt
	private Long jobId;
	
	/**
	 * spring bean名称
	 */
	@ApiModelProperty("spring bean名称")
	@PropertyExt
	private String beanName;
	
	/**
	 * 方法名
	 */
	@ApiModelProperty("方法名")
	@PropertyExt
	private String methodName;
	
	/**
	 * 参数
	 */
	@ApiModelProperty("参数")
	@PropertyExt
	private String params;
	
	/**
	 * 任务状态    0：成功    1：失败
	 */
	@ApiModelProperty("任务状态    0：成功    1：失败")
	@PropertyExt
	private Boolean status;
	
	/**
	 * 失败信息
	 */
	@ApiModelProperty("失败信息")
	@PropertyExt
	private String error;
	
	/**
	 * 耗时(单位：毫秒)
	 */
	@ApiModelProperty("耗时(单位：毫秒)")
	@PropertyExt
	private Integer times;
	
	/**
	 * 创建时间
	 */
	@ApiModelProperty("创建时间")
	@PropertyExt
	private Date createTime;

	public Long getLogId() {
		return logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public Integer getTimes() {
		return times;
	}

	public void setTimes(Integer times) {
		this.times = times;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
