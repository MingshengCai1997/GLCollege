package com.sheng.mpdemo.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class MyMateHandler implements MetaObjectHandler {
    /**
     * 使用mp实现添加的操纵，这个方法就会执行
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        // 属性名称是createTime，【也就是我们要自动填充的字段属性】值是new Date(),最后一个是元数据（表示数据的数据）
        this.setFieldValByName("createTime",new Date(),metaObject);
        this.setFieldValByName("updateTime",new Date(),metaObject);

        this.setFieldValByName("version",1,metaObject);
    }

    /**
     * 使用mp进行修改的时候就会执行这个方法
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }
}
