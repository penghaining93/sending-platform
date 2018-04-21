package com.gkhn.sendingplatform.module.prisontocourt.config.datasource;

import com.gkhn.sendingplatform.module.prisontocourt.constant.Prison;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
* @author: Phn
* @description:
* @date: 11:23 2018/1/21
*/
@Aspect
@Component
public class DynamicDataSourceAspect {

    @Before("@annotation(DataSource)")
    public void beforeSwitchDS(JoinPoint point){
        //获得当前访问的class
        Class<?> className = point.getTarget().getClass();
        //获得访问的方法名
        String methodName = point.getSignature().getName();
        //得到方法的参数的类型
        Class[] argClass = ((MethodSignature)point.getSignature()).getParameterTypes();
        String dataSource = DataSourceContextHolder.DEFAULT_DS;
        try {
            // 得到访问的方法对象
            Method method = className.getMethod(methodName, argClass);
            // 判断是否存在@DS注解
            if (method.isAnnotationPresent(DataSource.class)) {
                //根据监狱机构ID切换数据源 约定第一个参数是监狱机构ID
                Object[] parameters = point.getArgs();
                String parameter = parameters[0].toString();
                switch (parameter){
                    case Prison.DESHAN_ORG : dataSource = "deshan";  break;
                    case Prison.CHANGSHA_ORG : dataSource = "changsha";  break;
                    case Prison.YUEYANG_ORG : dataSource = "yueyang";  break;
                    case Prison.WULING_ORG : dataSource = "wuling";  break;
                    case Prison.YANNAN_ORG : dataSource = "yannan";  break;
                    case Prison.LOUDI_ORG : dataSource = "loudi";  break;
                    case Prison.CHISHAN_ORG : dataSource = "chishan";  break;
                    case Prison.YANBEI_ORG : dataSource = "yanbei";  break;
                    case Prison.SHAOYANG_ORG : dataSource = "shaoyang";  break;
                    case Prison.CHALING_ORG : dataSource = "chaling";  break;
                    case Prison.YONGZHOU_ORG : dataSource = "yongzhou";  break;
                    case Prison.DONGAN_ORG : dataSource = "dongan";  break;
                    case Prison.HUAIHUA_ORG : dataSource = "huaihua";  break;
                    case Prison.JISHOU_ORG : dataSource = "jishou";  break;
                    case Prison.JINSHI_ORG : dataSource = "jinshi";  break;
                    case Prison.WEIGUANSOU_ORG : dataSource = "weiguansuo";  break;
                    case Prison.HENGZHOU_ORG : dataSource = "hengzhou";  break;
                    case Prison.GUIYANG_ORG : dataSource = "guiyang";  break;
                    case Prison.CHENZHOU_ORG : dataSource = "chenzhou";  break;
                    case Prison.PINGTANG_ORG : dataSource = "pingtang";  break;
                    case Prison.WANGLING_ORG : dataSource = "wanling";  break;
                    case Prison.XINGCHENG_ORG : dataSource = "xingcheng";  break;
                    case Prison.CHANGKANG_ORG : dataSource = "changkang";  break;
                    case Prison.XIANGNAN_ORG : dataSource = "xiangnan";  break;
                    case Prison.NVZI_ORG : dataSource = "nvzi";  break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 切换数据源
        DataSourceContextHolder.setDB(dataSource);

    }


    @After("@annotation(DataSource)")
    public void afterSwitchDS(JoinPoint point){
        DataSourceContextHolder.clearDB();
    }
}
