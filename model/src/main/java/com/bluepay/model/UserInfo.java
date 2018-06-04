package com.bluepay.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class UserInfo implements Serializable {
    /**
     * 
     */
    private Long userId;

    /**
     * 邀请码
     */
    private String promotionCode;

    /**
     * 邀请码过期时间
     */
    private Date promotionCodeExpireDate;

    /**
     * 接受的邀请码
     */
    private String shareCode;

    /**
     * 支付密码
     */
    private String paymentPasswd;

    /**
     * 20位加密串中的secret
     */
    private String secret;

    /**
     * 
     */
    private String msisdn;

    /**
     * 
     */
    private String fbid;

    /**
     * 
     */
    private String lineid;

    /**
     * 从user center中获得
     */
    private String blueId;

    /**
     * 
     */
    private String imei;

    /**
     * 
     */
    private Byte payType;

    /**
     * 用户的coins*100
     */
    private String userCoins;

    /**
     * 用户折扣金额
     */
    private String purchaseSavedAmount;

    /**
     * 
     */
    private BigDecimal purchasedAmount;

    /**
     * -1:代表余额  -2 代表coins  其他代表银行卡
     */
    private String bankBdId;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    /**
     * 用户状态
     */
    private String userStatus;

    /**
     * 绑定邮箱
     */
    private String email;

    /**
     * 绑定的第二手机号码
     */
    private String backupMsisdn;

    /**
     * 日限
     */
    private BigDecimal dailyLimit;

    /**
     * 
     */
    private Date changeMainMsisdnTime;

    /**
     * 用户等级
     */
    private Byte userLevel;

    /**
     * 
     */
    private Date timeSharecode;

    /**
     * 好友的user_id
     */
    private Long friendId;

    /**
     * 
     */
    private String originImei;

    /**
     * user_info
     */
    private static final long serialVersionUID = 1L;
}