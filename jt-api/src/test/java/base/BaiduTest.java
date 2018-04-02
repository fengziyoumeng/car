package base;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.rongdu.cashloan.core.common.context.Global;
import com.rongdu.cashloan.core.common.util.BaiduUtil;
import com.rongdu.cashloan.core.common.util.StringUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BaiduTest {

    public static void main(String[] args) {

        String userId = "100";
        String name = "张炜凯";
        String phone = "18667143328";
        String id = "340111199511294535";

        Map<String,String> params = new HashMap<>();

        // 获取百度磐石金融合作码和秘钥


        String spNo = "1300141612";
        String key = "4a4bc1cd2f95a1b1b27095f94cba21efd2755ed3";
        String url = "https://jrws.baidu.com/risk/api/info/search";

        //封装百度黑名单需要的参数
        long dataTime = new Date().getTime();
        params.put("sp_no",spNo);
        params.put("service_id","1001");
        params.put("datetime",dataTime+"");
        params.put("reqid",userId);
        params.put("sign_type","1");
        params.put("sign", BaiduUtil.getBaiduSign(id,dataTime,name,phone,userId,"1001",spNo,key));
        params.put("name",name);
        params.put("identity",id);
        params.put("phone",phone);
        String resp = BaiduUtil.sendBaidu(params,url);
        System.out.println(resp);
    }

}
