/*
 * Copyright (C), 2002-2013
 * FileName: HttpClientUtil.java
 * Author:   zhuliang
 * Date:     2013-3-27 上午00:00:00
 */
package hotel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.FormBodyPart;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HttpContext;

/**
 * 
 * http发送工具
 * 
 * @author zhuliang
 */
public final class HttpClientUtil {
	/**
	 * 
	 */
	private static final String POST_REQDATA_ERRMSG = "postRequestData数据出错:";

	/**
	 * 
	 */
	private static PoolingHttpClientConnectionManager pccm = null;

	/**
	 * 
	 */
	private static HttpClient httpClient = null;

	/**
	 * 
	 */
	private static int errorCount = 0;

	/**
	 * 
	 */
	private static final int ERROR_MAX_COUNT = 100;

	/**
	 * 
	 * 初始化
	 * 
	 */
	public synchronized static HttpClient init() {
		try {
			if (httpClient != null && errorCount < ERROR_MAX_COUNT) {
				return httpClient;
			}

			if (pccm != null) {
				pccm.shutdown();
			}

			SSLContext ctx = SSLContext.getInstance("TLS");
			X509TrustManager tm = new X509TrustManager() {

				public java.security.cert.X509Certificate[] getAcceptedIssuers() {
					return null;
				}

				public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType)
						throws java.security.cert.CertificateException {
				}

				public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType)
						throws java.security.cert.CertificateException {
				}
			};
			ctx.init(null, new TrustManager[] { tm }, null);
			SSLConnectionSocketFactory ssf = new SSLConnectionSocketFactory(ctx,
					SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);

			// 设置访问协议
			Registry<ConnectionSocketFactory> schreg = RegistryBuilder.<ConnectionSocketFactory> create()
					.register("http", PlainConnectionSocketFactory.getSocketFactory()).register("https", ssf).build();

			pccm = new PoolingHttpClientConnectionManager(schreg);
			pccm.setDefaultMaxPerRoute(2000); // 每个主机的最大并行链接数
			pccm.setMaxTotal(10000); // 客户端总并行链接最大数

			httpClient = HttpClients.custom().setConnectionManager(pccm).build();
		} catch (Exception e) {
			httpClient = HttpClients.createDefault();
		}
		errorCount = 0;
		return httpClient;
	}

	public static String postData(String url, String data, Map<String, String> headers) {
		return postData(url, data, null, null, headers, null, null, null);
	}

	/**
	 * 
	 * 发送http请求
	 * 
	 * @param url
	 *            请求地址
	 * @param data
	 *            请求报文
	 * @return 返回报文
	 */
	public static String postData(String url, String data, String charset) {
		return postData(url, data, null, null, null, null, null, charset);
	}

	/**
	 * 
	 * 发送http请求
	 * 
	 * @param url
	 *            请求地址
	 * @param data
	 *            请求报文
	 * @param contentType
	 *            contentType
	 * @return 返回报文
	 */
	public static String postData(String url, String data, ContentType contentType, String charset) {
		return postData(url, data, null, null, null, null, contentType, charset);
	}

	/**
	 * 
	 * 发送http请求
	 * 
	 * @param url
	 *            请求地址
	 * @param data
	 *            请求报文
	 * @param headers
	 *            请求头
	 * @return 返回报文
	 */
	public static String postData(String url, String data, Map<String, String> headers, String charset) {
		return postData(url, data, null, null, headers, null, null, charset);
	}

	/**
	 * 
	 * 发送http请求
	 * 
	 * @param url
	 *            请求地址
	 * @param formData
	 *            form数据
	 * @return 返回报文
	 */
	public static String postData(String url, Map<String, String> formData, String charset) {
		return postData(url, null, formData, null, null, null, null, charset);
	}

	/**
	 * 
	 * 发送http请求multipart/form-data
	 * 
	 * @param url
	 *            请求地址
	 * @param multipartformData
	 *            form数据
	 * @return 返回报文
	 */
	public static String postData(String url, List<FormBodyPart> multipartformData, String charset) {
		return postData(url, null, null, multipartformData, null, null, null, charset);
	}

	/**
	 * 
	 * 发送http请求
	 * 
	 * @param url
	 *            请求地址
	 * @param data
	 *            请求报文
	 * @param cookie
	 * @return 返回报文
	 */
	public static String postData(String url, String data, String cookie, String charset) {
		return postData(url, data, null, null, null, cookie, null, charset);
	}

	/**
	 * 
	 * 发送请求数据
	 * 
	 * @param url
	 *            请求地址
	 * @param data
	 *            请求数据
	 * @param formData
	 *            form数据
	 * @param multipartformData
	 *            multipartform数据
	 * @param headers
	 *            请求头
	 * @param cookie
	 *            cookie
	 * @param contentType
	 *            contentType
	 * @return 返回报文
	 */
	public static String postData(String url, String data, Map<String, String> formData,
			List<FormBodyPart> multipartformData, Map<String, String> headers, String cookie, ContentType contentType,
			String charset) {
		try {
			if (httpClient == null || errorCount > ERROR_MAX_COUNT) {
				httpClient = init();
			}
			// 请求开始时间
			long beginTime = System.currentTimeMillis();
			// 发送请求
			HttpResponse response = getResponse(httpClient, url, data, formData, multipartformData, headers, cookie,
					contentType, null);
			String result = readResponse(response.getEntity(), charset);
			// 打印日志

			return result;
		} catch (Exception e) {
			errorCount++;
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 
	 * 获取响应
	 * 
	 * @param httpclient
	 * @param url
	 * @param data
	 * @param formData
	 * @param headers
	 * @param cookie
	 * @param localContext
	 * @return
	 */
	private static HttpResponse getResponse(HttpClient httpclient, String url, String data,
			Map<String, String> formData, List<FormBodyPart> multipartFormData, Map<String, String> headers,
			String cookie, ContentType contentType, HttpContext localContext) throws Exception {
		HttpPost httppost = new HttpPost(url);
		if (data != null) {
			StringEntity reqEntity = null;
			if (contentType == null) {
				reqEntity = new StringEntity(data, ContentType.create("text/html", Consts.UTF_8));
			} else {
				reqEntity = new StringEntity(data, contentType);
			}
			httppost.setEntity(reqEntity);
		} else if (formData != null) {
			List<NameValuePair> formparams = new ArrayList<NameValuePair>();
			for (Map.Entry<String, String> entry : formData.entrySet()) {
				formparams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
			}
			if (null != formparams) {
				UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, Consts.UTF_8);
				httppost.setEntity(entity);
			}
		} else if (multipartFormData != null) {
			MultipartEntityBuilder builder = MultipartEntityBuilder.create();
			for (FormBodyPart formBodyPart : multipartFormData) {
				builder.addPart(formBodyPart.getName(), formBodyPart.getBody());
			}
			httppost.setEntity(builder.build());
		}
		if (null != headers) {
			for (Map.Entry<String, String> entry : headers.entrySet()) {
				httppost.addHeader(entry.getKey(), entry.getValue());
			}
		}
		if (null != cookie) {
			httppost.addHeader("Cookie", cookie);
		}
		return httpclient.execute(httppost, localContext);

	}

	/**
	 * 
	 * 读取返回
	 * 
	 * @param resEntity
	 * @return String 返回
	 */
	private static String readResponse(HttpEntity resEntity, String charset) {
		if (null == charset) {
			charset = "utf-8";
		}
		StringBuffer res = new StringBuffer();
		BufferedReader reader = null;
		try {
			if (resEntity == null) {
				return null;
			}

			reader = new BufferedReader(new InputStreamReader(resEntity.getContent(), charset));
			String line = null;

			while ((line = reader.readLine()) != null) {
				res.append(line);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		// logger.info(res.toString());
		return res.toString();
	}

	public static InputStream downloadFile(String url) {
		try {
			if (httpClient == null) {
				httpClient = init();
			}
			HttpGet httpget = new HttpGet(url);
			HttpResponse response = httpClient.execute(httpget);

			HttpEntity entity = response.getEntity();
			InputStream is = entity.getContent();
			return is;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static String getHtml(String url, Map<String, String> headers) {
		if (httpClient == null || errorCount > ERROR_MAX_COUNT) {
			httpClient = init();
		}
		HttpGet httpGet = new HttpGet(url);
		String result = "";
		HttpResponse response;
		try {
			if (null != headers) {
				for (Map.Entry<String, String> entry : headers.entrySet()) {
					httpGet.addHeader(entry.getKey(), entry.getValue());
				}
			}
			response = httpClient.execute(httpGet);
			result = readResponse(response.getEntity(), null);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}
}
