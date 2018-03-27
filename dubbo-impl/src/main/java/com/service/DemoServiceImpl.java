package com.service;

import com.baiten.DemoService;
import com.result.ReturnResult;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/3/25.
 */
@Service(value = "demoService")
public class DemoServiceImpl implements DemoService {

    public ReturnResult speak(String name) {

        ReturnResult returnResult;
        try {
            int i = 7/0;
            System.out.println("Hello," + name + "!");
            Object object = new Object();
            returnResult = new ReturnResult(object);
            return returnResult;
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ReturnResult("程序异常");
    }
}
