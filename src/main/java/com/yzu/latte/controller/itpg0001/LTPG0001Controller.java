package com.yzu.latte.controller.itpg0001;

import com.yzu.latte.common.result.CommonResult;
import com.yzu.latte.domain.service.itpg0001.LTPG0001Service;
import com.yzu.latte.domain.service.itpg0001.LTPG0001ServiceRequest;


import com.yzu.latte.domain.service.itpg0001.LTPG0001ServiceResponse;
import org.dozer.DozerBeanMapperBuilder;
import org.dozer.Mapper;
import org.dozer.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "coffee", method = RequestMethod.POST)
public class LTPG0001Controller {

    @Autowired
    LTPG0001Service ltpg0001Service;

    /**
     * 对象拷贝注入
     */
    @Inject
    Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    @RequestMapping(value = "latte01")
    public CommonResult<LTPG0001ServiceResponse> login(@RequestBody LTPG0001Resource resource) {

        LTPG0001ServiceRequest request = mapper.map(resource, LTPG0001ServiceRequest.class);

        LTPG0001ServiceResponse serviceResponse = ltpg0001Service.lattePage0001Service(request);

        return CommonResult.success(serviceResponse);
    }
}
