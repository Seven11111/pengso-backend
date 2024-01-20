package com.yupi.springbootinit.model.vo;

import com.yupi.springbootinit.model.entity.Picture;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Mr.Peng
 * @version 1.0
 * @description: 聚合搜索
 *
 * @date 2024/1/19 15:40
 */
@Data
public class SearchVO implements Serializable {

    private List<UserVO> userList;

    private List<PostVO> postList;

    private List<Picture> pictureList;

    private static final long serialVersionUID = 1L;

}
