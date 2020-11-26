package com.sheng.mpdemo.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class User {

    // mp自带的策略，生成19位的数值，数字类型使用这种策略;//@TableId(type = IdType.ID_WORKER_STR)
    // mp自带策略，字符串类型使用这种策略
    @TableId(type = IdType.ID_WORKER)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    @TableField(fill = FieldFill.INSERT)
    private Data createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Data updateTime;
}
