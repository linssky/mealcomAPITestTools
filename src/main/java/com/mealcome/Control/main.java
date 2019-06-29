package com.mealcome.Control;

import com.mealcome.Implement.performanceTest;
import com.mealcome.Info.excelInfo;
import com.mealcome.Info.userInfo;
import com.mealcome.Interface.iPerformanceTest;
import com.mealcome.Until.excelUntil;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuchaolin on 2019/5/15.
 */
public class main {
    public static void main(String[] args) throws IOException, InvalidFormatException {
        long startTime=System.currentTimeMillis();
        List<userInfo> userI=new ArrayList<userInfo>();
        excelUntil excelUntil=new excelUntil(excelInfo.USER_NAME_FORM, excelInfo.SHEET_NAME);
        iPerformanceTest PT=new performanceTest();
        List<userInfo> userInfos= excelUntil.getUserInfo();
        userI=PT.ThreadsTest(userInfos);
        excelUntil.updateUserInfo(userI);
        System.out.println(userI.toString());


        long endtTime=System.currentTimeMillis();
        long takeTime=(endtTime-startTime);//单位是ms
        System.out.println("本次测试总耗时："+takeTime*1.00/1000+"秒");

    }
}
