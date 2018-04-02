package com.rongdu.cashloan.core.common.util;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.util.Map;

/**
 * 百度磐金融服务请求工具类
 */
public class BaiduUtil {

    public static String getBaiduSign(String identity, long datetime, String name, String phone, String reqid,String serviceId,String spNo,String key){
        StringBuilder sb = new StringBuilder();
        sb.append("datetime="+datetime);
        sb.append("&identity="+identity);
        sb.append("&name="+name);
        sb.append("&phone="+phone);
        sb.append("&reqid="+reqid);
        sb.append("&service_id="+serviceId);
        sb.append("&sign_type=1");
        sb.append("&sp_no="+spNo);
        sb.append("&key="+key);
        return MD5Utils.MD5Encrpytion(sb.toString());
    }

    public static String sendBaidu(Map<String, String> param,String baiduBlacklistUrl){
        // 创建Httpclient对象
        CloseableHttpClient httpclient = HttpClients.createDefault();

        String resultString = "";
        CloseableHttpResponse response = null;
        try {
            // 创建uri
            URIBuilder builder = new URIBuilder(baiduBlacklistUrl);
            if (param != null) {
                for (String key : param.keySet()) {
                    builder.addParameter(key, param.get(key));
                }
            }
            URI uri = builder.build();

            // 创建http GET请求
            HttpGet httpGet = new HttpGet(uri);

            // 执行请求
            response = httpclient.execute(httpGet);
            // 判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == 200) {
                resultString = EntityUtils.toString(response.getEntity(), "UTF-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return resultString;
    }

}
