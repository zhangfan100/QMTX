package com.qimao.utils;

import java.io.Serializable;

/**
 * 返回数据的封装
 * @author zhangfan
 * @date 2017年9月7日 上午11:54:43
 */
public class ResponseData<T> implements Serializable
{

	private static final long serialVersionUID = -3408598774435409654L;

	/**状态码**/
	private int code = QMConstants.SUCCESS;
	/**返回的信息，异常错误时可以添加错误信息**/
	private String message = "success";
	/**返回的具体数据**/
	private T data;

	public ResponseData(T data) 
	{
		this.data=data;
	}
	
	public ResponseData(int code, String message, T data)
	{
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public void setCode(int code) 
	{
		this.code = code;
	}

	public void setSuccess(String msg) 
	{
		this.message = msg;
	}

	public void setData(T data) 
	{
		this.data = data;
	}

	public int getCode()
	{
		return code;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public T getData() 
	{
		return data;
	}

	@Override
	public String toString() {
		return "ResponseData [code=" + code + ", message=" + message + ",\r data=" + data
				+ "]";
	}
	
}
