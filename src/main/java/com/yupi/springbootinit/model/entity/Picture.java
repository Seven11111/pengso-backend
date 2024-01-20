package com.yupi.springbootinit.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Mr.Peng
 * @version 1.0
 * @description: 直接转发从网上查询的图片信息
 * @date 2024/1/19 14:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Picture implements Serializable {

    String title;

    String url;

    private static final long serialVersionUID = 1L;

}
