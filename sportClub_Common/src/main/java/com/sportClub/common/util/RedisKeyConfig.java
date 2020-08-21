package com.sportClub.common.util;

public class RedisKeyConfig {
    //令牌
    public static final String PHONE_TOKEN="voter:phone:";//后面追加phone 值存储令牌
    public static final String TOKEN_USER="voter:token:";//后面追加令牌 值存储用户信息
    public static final String TOKEN_EMAIL="voter:text:";//后面追加邮箱

    public static final String TOKEN_EMAILD="voter:recemail:";//后面追加邮箱

    public static final String PHONE_FOR="voter:for:phone:";//后面跟手机号 冻结的账号
    public static final String PHONE_ERROR="voter:error:phone:";//后面跟手机号和时间戳

    //有效期
    public static final int TOKEN_TIME=60*24*30*60; //令牌有效期 单位秒
    public static final int TOKENS_EMAIL=3*60; //邮箱有效期
}
