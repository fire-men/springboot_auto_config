package com.wolf.common.service.impl;

import com.wolf.common.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author jingjing520
 */
@Service("userServiceImpl")
public class IUserServiceImpl implements IUserService {
    @Override
    public void sayHello(String userName) {
        System.out.println("您好,"+userName);
    }
}
