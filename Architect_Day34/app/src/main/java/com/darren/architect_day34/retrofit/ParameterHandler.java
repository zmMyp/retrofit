package com.darren.architect_day34.retrofit;

import com.darren.architect_day34.RequestBuilder;

/**
 * Created by hcDarren on 2017/12/17.
 */

public interface ParameterHandler<T> {
    public void apply(RequestBuilder requestBuilder,T value);

    // 很多策略，Query ,Part , QueryMap ,Field 等等
    class Query<T> implements ParameterHandler<T>{
        private String key; // 保存 就是参数的 key = userName ,password
        public Query(String key){
            this.key = key;
        }

        @Override
        public void apply(RequestBuilder requestBuilder,T value) {
            // 添加到request中 // value -> String 要经过一个工厂
            requestBuilder.addQueryName(key,value.toString());
        }
    }
    // 还有一些其他

}
