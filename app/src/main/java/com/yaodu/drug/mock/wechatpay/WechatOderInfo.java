package com.yaodu.drug.mock.wechatpay;

import com.tencent.mm.sdk.modelpay.PayReq;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * 微信orderinfo模拟,
 * 这里一般有服务器实现,
 * 这里使用了官方demo中的支付数据
 *
 * @author bobomee.
 *         wbwjx115@gmail.com
 */
public class WechatOderInfo {

  public static PayReq getWeixinPayReq(String payInfo) {
    try {
      PayReq req = new PayReq();
      JSONObject json = new JSONObject(payInfo);

      req.appId = json.getString("appid");
      req.partnerId = json.getString("partnerid");
      req.prepayId = json.getString("prepayid");
      req.nonceStr = json.getString("noncestr");
      req.timeStamp = json.getString("timestamp");
      req.packageValue = json.getString("package");
      req.sign = json.getString("sign");
      return req;
    } catch (JSONException e) {
      e.printStackTrace();
      return null;
    }
  }

}
