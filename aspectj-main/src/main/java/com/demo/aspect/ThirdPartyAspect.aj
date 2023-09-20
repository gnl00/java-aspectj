package com.demo.aspect;

import com.demo.ThirdPartyService;

public aspect ThirdPartyAspect {
    // call 表示在代码被调用的地方织入
    pointcut callTest(ThirdPartyService thirdParty) :
            call(boolean ThirdPartyService.test()) && target(thirdParty);

    before(ThirdPartyService thirdParty) :
        callTest(thirdParty) {
            System.out.println("ThirdPartyAspect ==> before call");
    }

    after(ThirdPartyService thirdParty) :
        callTest(thirdParty) {
            System.out.println("ThirdPartyAspect ==> after call");
    }
}