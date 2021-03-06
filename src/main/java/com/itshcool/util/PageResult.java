package com.itshcool.util;

import java.util.List;
import com.jfinal.plugin.activerecord.Page;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PageResult<T> {
	
	// 返回状态码
	private Integer code;
	// 数组总条数
	private Integer count;
	// 提示信息
	private String msg;
	// 数据列表
	private List<T> data;
	
	
	public PageResult(Page<T> data) {
		this.code = ResultCode.PAGE_SUCCESS.getCode();
		this.msg = ResultCode.PAGE_SUCCESS.getMessage();
		this.count = data.getTotalRow();
		this.data =data.getList();
	}
}
