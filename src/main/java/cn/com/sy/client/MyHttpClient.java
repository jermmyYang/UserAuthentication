package cn.com.sy.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import cn.com.sy.constants.AppConstants;

/**
 * HttpClient
 * 
 * @author Administrator
 * 
 */
@SuppressWarnings("deprecation")
public class MyHttpClient {

	private static HttpClient httpClient = new DefaultHttpClient();

	public static void httpGet(String url, Map<String, String> requestParams) throws ClientProtocolException, IOException {

		 HttpGet  httpGet = null;
		try {
			// 参数设置
			if(requestParams!=null){
				StringBuilder builder = new StringBuilder(url);
				builder.append("?");
				for (Map.Entry<String, String> entry : requestParams.entrySet()) {
					builder.append((String) entry.getKey());
					builder.append("=");
					builder.append((String) entry.getValue());
					builder.append("&");
				}
				String tmpUrl = builder.toString();
				tmpUrl = tmpUrl.substring(0, tmpUrl.length() - 1);
                url = tmpUrl;
			}
			
			httpGet = new HttpGet(url);
			HttpResponse response = httpClient.execute(httpGet);
			HttpEntity entity = response.getEntity();
			System.out.println(response);
			
		} finally {
			if (httpGet != null) {
				httpGet.abort();
			}
		}

	}
	
	public static void main(String[] args) {
		
		

		Map<String, String> requestParams = new HashMap<String, String>();
		
		
		requestParams.put("mobile", "13524937324");
		requestParams.put("password", "200804yang");
		requestParams.put("account", "cf_jermmy");
		requestParams.put("method", "Submit");
		int random = 2134;
		String message = AppConstants.MESSAGE.replace("${code}", random+"");
		requestParams.put("content", message);
		
		try {
			MyHttpClient.httpGet("http://106.ihuyi.cn/webservice/sms.php?method=Submit&account=cf_jermmy&password=200804yang&mobile=13524937324&content=您的验证码是：123434。请不要把验证码泄露给其他人。", requestParams);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
