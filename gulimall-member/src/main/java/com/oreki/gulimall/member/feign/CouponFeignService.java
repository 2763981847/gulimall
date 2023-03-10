package com.oreki.gulimall.member.feign;

import com.oreki.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author Fu Qiujie
 * @since 2023/2/28
 */
@FeignClient(name = "gulimall-coupon", path = "coupon/coupon")
public interface CouponFeignService {

}
