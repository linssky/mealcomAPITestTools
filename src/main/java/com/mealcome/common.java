package com.mealcome;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wuchaolin on 2019/5/15.
 */
public class common {
    /**以yyyyMMdd的格式返回一个string，
     * 主要用于创建文件夹*/
    public String getNowTime(){
        Date day=new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");//时间展示方式
        String time=df.format(day);//获取当前时间
        return time;
    }


    //对比上次获取sessionid的时间，如果在7天以内，则不保存
    public boolean isSaveSeesionID(String nowTime,String getExcelTime){
        boolean isSave=true;
        if (getExcelTime!=null||getExcelTime!=""){
            try {
                int nowtime = Integer.parseInt(nowTime);
                int getexceltime = Integer.parseInt(getExcelTime);
                isSave = (nowtime - getexceltime) < 6 ? false : true;
            }catch (Exception e){
                System.out.println("Excel获取的日期格式有问题！");
            }
        }
        return isSave;
    }
}
