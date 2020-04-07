package HTTP和API访问网址;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



import java.net.*;
import java.lang.*;


public class text {

	public static void main(String[] args) throws Exception {
		
			String s ="https://mp.weixin.qq.com/s/WOB0NaE-erzm9FTF5WG3-g";
			try {
				//第一步:创建一个URL
				URL url =new URL(s);
				//第二步：连接
				HttpURLConnection connection =(HttpURLConnection)url.openConnection();
				//读取数据（客户端）
				try(InputStream is =connection.getInputStream();){
				//预期返回一个html页面，并处理编码问题
				InputStreamReader isr =new InputStreamReader(is);
				StringBuilder sb = new StringBuilder();
				char[] c = new char[9999];
				int len=0;
				while((len=isr.read(c))>0) {
					sb.append(c,0,len);
				}
				System.out.println(sb);
				//开始爬取所有的图片
			String imgPattern ="<img\\s+.*?src=[\"']+([/\\w].+?)[\"']+[\\s/]";
			Pattern PImag =Pattern.compile(imgPattern);
			Matcher matcher =PImag.matcher(sb);
			while(matcher.find()) {
				String url1=matcher.group(1);
				int index =	 url1.indexOf('?');
				if(index>-1) {
					url1=url1.substring(0,index);
				}
				//System.out.println(url1);
				System.out.println("正在下载："+url1);
				downloadFile(url1);
				System.out.println("完成下载："+url1);
			}
			
				
			}catch(Exception e) {
				e.printStackTrace();
			}
	}catch(MalformedURLException e) {
		e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}

	
		public static void downloadFile(String url) {
			String fileName =url.substring(url.lastIndexOf('/')+1);
			try(FileOutputStream fos = new FileOutputStream("images/"+fileName)){
				//第一步：创建一个URL
				URL urlAdd = new URL(url);
				//第二步：连接
				HttpURLConnection connection =(HttpURLConnection)urlAdd.openConnection();
				//读取数据（客户端）
				InputStream is =connection.getInputStream();
				//创建一个文件
				byte[] buffer =new byte[4096];
				int len=0;
				while((len=is.read(buffer))>0) {
					fos.write(buffer,0,len);
				}
				fos.flush();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
}
