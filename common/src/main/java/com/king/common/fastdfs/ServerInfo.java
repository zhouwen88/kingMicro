
package com.king.common.fastdfs;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * @author King chen
 * @emai 396885563@qq.com
 * @data2018年2月28日
 */
public class ServerInfo
{
	protected String ip_addr;
	protected int port;
	
/**
* Constructor
* @param ip_addr address of the server
* @param port the port of the server
*/
	public ServerInfo(String ip_addr, int port)
	{
		this.ip_addr = ip_addr;
		this.port = port;
	}
	
/**
* return the ip address
* @return the ip address
*/
	public String getIpAddr()
	{
		return this.ip_addr;
	}
	
/**
* return the port of the server
* @return the port of the server
*/
	public int getPort()
	{
		return this.port;
	}
	
/**
* connect to server
* @return connected Socket object
*/
	public Socket connect() throws IOException
	{
		Socket sock = new Socket();
		sock.setReuseAddress(true);
		sock.setSoTimeout(ClientGlobal.g_network_timeout);
		sock.connect(new InetSocketAddress(this.ip_addr, this.port), ClientGlobal.g_connect_timeout);
		return sock;
	}
}
