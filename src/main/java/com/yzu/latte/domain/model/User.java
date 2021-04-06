package com.yzu.latte.domain.model;

import lombok.Data;

/**
 * 用户信息类
 *
 * @author yuquan.chen
 * 版权：陈育泉本人所有
 */

@Data
public class User {

    /**
     * 统一用户编码
     */
    private String memberID;

    /**
     * 登录账号
     */
    private String userID;

    /**
     * 登录密码
     */
    private String password;


    /**
     * 出生年月日
     */
    private String birthday;

    /**
     * 用户性别
     * 0：男性 1：女性
     */
    private Integer sex;

    /**
     * 姓
     */
    private String familyName;

    /**
     * 名
     */
    private String givenName;

    /**
     * 手机号码
     */
    private Integer phone;

    /**
     * 邮箱地址
     */
    private String mailAddress;

    /**
     * 用户住址
     */
    private String userAddress;

    /**
     * 用户状态 0：已创建 1：创建成功 2：已锁定 9：已退出
     */
    private Integer state;


    /**
     * 账户状态 0：正常 1：注销
     */
    private String delFlg;

    /**
     * 创建者
     */
    private String creator;

    /**
     * 创建时间
     */
    private String creatorTime;

    /**
     * 更新者
     */
    private String updater;

    /**
     * 更新时间
     */
    private String updaterTime;

    /**
     * 用户权限
     */
    private Integer role;

}