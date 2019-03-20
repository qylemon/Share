package com.lemon.demo.core.Druid;


import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @Author: Qy
 * @Date: 2019-02-05 21:28
 */
@WebFilter(
        filterName="druidWebStatFilter",
        urlPatterns= {"/*"},
        initParams= {
                @WebInitParam(name="exclusions",value="*.js,*.jpg,*.png,*.gif,*.ico,*.css,/druid/*")//配置本过滤器放行的请求后缀
        }
)
public class DruidStatFilter extends WebStatFilter {

}
