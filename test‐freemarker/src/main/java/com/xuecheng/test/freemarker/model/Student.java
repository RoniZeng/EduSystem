package com.xuecheng.test.freemarker.model;

import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.ToString;

/**
 * Created by 16114 on 2019/6/6.
 */
@Data
@ToString
public class Student {
    private String name;//姓名
    private int age;//年龄
    private Date birthday;//生日
    private Float money;//钱包
    private List<Student> friends;//朋友列表
    private Student bestFriend;//最好的朋友
}
