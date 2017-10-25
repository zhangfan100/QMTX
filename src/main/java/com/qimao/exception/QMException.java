package com.qimao.exception;

import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;

/**
 * 系统权限的
 * @author zhangfan
 * @date 2017年9月8日 上午11:10:53
 */
public class QMException extends RuntimeException
{

	/**
	 */
	private static final long serialVersionUID = 1L;

	public QMException()
	{
		super();
	}

	public QMException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public QMException(String message)
	{
		super(message);
	}
	
	public QMException(String message, Object ... param)
	{
		FormattingTuple arrayFormat = MessageFormatter.arrayFormat(message, param);
		throw new RuntimeException(arrayFormat.getMessage());
	}

}
