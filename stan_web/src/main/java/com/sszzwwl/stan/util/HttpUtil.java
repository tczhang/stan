package com.sszzwwl.stan.util;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by muchu on 2016/4/1.
 */
public class HttpUtil {

    /**
     * Description: 获取访问者的IP地址
     * @param request
     * @return 访问者IP地址
     */
    public static String getIpAddr(HttpServletRequest request) {

        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        if (ip != null && ip.equals("0:0:0:0:0:0:0:1")){
            ip = "127.0.0.1";
        }
        return ip;
    }
}
