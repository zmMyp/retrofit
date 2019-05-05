package com.darren.architect_day33.simple1;

import com.darren.architect_day33.simple2.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by hcDarren on 2017/12/16.
 * 请求后台访问数据的 接口类
 */
public interface ServiceApi {
    // 接口涉及到解耦，userLogin 方法是没有任何实现代码的
    // 如果有一天要换 GoogleHttp

    @GET("LoginServlet")// 登录接口 GET(相对路径)
    Call<Result<UserInfo>> userLogin(
            // @Query(后台需要解析的字段)
            @Query("userName") String userName,
            @Query("password") String userPwd);

    // POST

    // 上传文件怎么用？
}
