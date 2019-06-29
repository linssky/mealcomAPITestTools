package com.mealcome.Interface;

import com.mealcome.Info.resultsInfo;
import com.mealcome.Info.taskInfo;
import com.mealcome.Info.userInfo;

import java.util.List;

/**
 * Created by wuchaolin on 2019/5/14.
 *实现单个接口的测试流程
 */
public interface iAPITest {
    //多个接口循环测试的逻辑
    List<resultsInfo> forAPITest(List<taskInfo> taskInfos);

    //这里写单个接口测试的逻辑
//    resultsInfo oneAPITest(taskInfo task);

    userInfo oneAPITest(userInfo userInfo);
}
