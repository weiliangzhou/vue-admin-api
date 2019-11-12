package com.yd.lottery.core.util;


import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;

/**
 *
 * @author ydcm
 * @date 2019/10/15
 */
public class ALiSmsUtils {

    private static final String REGION_ID = "cn-hangzhou";
    /**
     * 阿里后台key
     */
    private static final String ACCESS_KEY_ID = "*********************";
    /**
     * 阿里后台secret
     */
    private static final String ACCESS_KEY_SECRET = "****************";

    /**
     * 以下为短信发送常量，无需变更参数
     */
    private static final String DOMAIN = "dysmsapi.aliyuncs.com";
    private static final String VERSION = "2017-05-25";
    private static final String ACTION = "SendSms";
    private static final String SIGN_NAME = "通知短信";
    /**
     * 各类模板的模板Code(阿里云后台获取)
     */
    /**
     * 登录、注册短信模板code
     */
    private static final String LOGIN_TEMPLATE_CODE = "";

    private static int code = (int) ((Math.random()*9+1)*100000);


    /**
     * 发送注册短信
     *
     * @param phone
     *            手机号
     * @param code
     *            验证码
     * @return 是否发送成功
     * @author single-聪
     * @date 2019年7月18日
     * @version 1.0.1
     */
    public static String sendLoginSms(String phone, Integer code) {
        DefaultProfile profile = DefaultProfile.getProfile(REGION_ID, ACCESS_KEY_ID, ACCESS_KEY_SECRET);
        IAcsClient client = new DefaultAcsClient(profile);
        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain(DOMAIN);
        request.setVersion(VERSION);
        request.setAction(ACTION);
        request.putQueryParameter("RegionId", REGION_ID);
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", SIGN_NAME);
        request.putQueryParameter("TemplateCode", LOGIN_TEMPLATE_CODE);
        String templateParam = "{\"code\":\"" + code + "\"}";
        request.putQueryParameter("TemplateParam", templateParam);
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        // 此处未作返回值处理，默认成功，可以根据返回值判断是否成功给前台响应(黑名单)
        return templateParam;
    }

}
