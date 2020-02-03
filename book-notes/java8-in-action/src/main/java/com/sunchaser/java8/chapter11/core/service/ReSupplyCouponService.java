package com.sunchaser.java8.chapter11.core.service;

import com.sunchaser.java8.chapter11.model.UserInfoModel;

import java.util.Map;

/**
 * @author sunchaser
 * @date 2019/9/8
 * @description 基础Service
 */
public interface ReSupplyCouponService {
    /**
     * 查询用户信息
     * @param uId 用户UID
     * @return 用户信息model
     */
    UserInfoModel queryUserInfo(String uId);

    /**
     * 补发劵操作
     * @param couponId 优惠券ID
     * @param uId 用户ID
     * @return 补发结果：成功或失败
     */
    Boolean reSupplyCoupon(String couponId, String uId);

    /**
     * 补发劵操作
     * @param couponId 优惠券ID
     * @param uId 用户ID
     * @return [UID,"成功或失败"]，返回对应UID。
     */
    Map<String,Object> reSupplyCouponWithUid(String couponId, String uId);
}