package com.sszzwwl.stan.controller;

import com.sszzwwl.stan.util.HttpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by muchu on 2016/4/1.
 *
 * RestController: 相当于Controller和ResponseBody两个注解。
 *
 *
 */
@RestController
@RequestMapping("/")
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping
    public ModelAndView index(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();

        String ipAddr = HttpUtil.getIpAddr(request);

        logger.info("访问者IP地址:{}",ipAddr);

        modelAndView.setViewName("index");

        return modelAndView;
    }
}
