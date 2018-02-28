
package com.king.common.fastdfs;

import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * @author King chen
 * @emai 396885563@qq.com
 * @data2018年2月28日
 */
public abstract class StructBase
{
	protected static class FieldInfo
	{
		protected String name;
		protected int offset;
		protected int size;
		
		public FieldInfo(String name, int offset, int size)
		{
			this.name = name;
			this.offset = offset;
			this.size = size;
		}
	}
	
/**
* set fields
* @param bs byte array
* @param offset start offset
*/
	public abstract void setFields(byte[] bs, int offset);
	
	protected String stringValue(byte[] bs, int offset, FieldInfo filedInfo)
	{
		try
		{
			return (new String(bs, offset + filedInfo.offset, filedInfo.size, ClientGlobal.g_charset)).trim();
		}
		catch(UnsupportedEncodingException ex)
		{
			ex.printStackTrace();
			return null;
		}
	}
	
	protected long longValue(byte[] bs, int offset, FieldInfo filedInfo)
	{
		return ProtoCommon.buff2long(bs, offset + filedInfo.offset);
	}
	
	protected int intValue(byte[] bs, int offset, FieldInfo filedInfo)
	{
		return (int)ProtoCommon.buff2long(bs, offset + filedInfo.offset);
	}
	
	protected byte byteValue(byte[] bs, int offset, FieldInfo filedInfo)
	{
		return bs[offset + filedInfo.offset];
	}

	protected boolean booleanValue(byte[] bs, int offset, FieldInfo filedInfo)
	{
		return bs[offset + filedInfo.offset] != 0;
	}
	
	protected Date dateValue(byte[] bs, int offset, FieldInfo filedInfo)
	{
		return new Date(ProtoCommon.buff2long(bs, offset + filedInfo.offset) * 1000);
	}
}
