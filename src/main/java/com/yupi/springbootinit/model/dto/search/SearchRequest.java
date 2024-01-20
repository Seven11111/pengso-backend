package com.yupi.springbootinit.model.dto.search;

import com.yupi.springbootinit.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author Mr.Peng
 * @version 1.0
 * @description: TODO
 * @date 2024/1/19 15:38
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class SearchRequest extends PageRequest implements Serializable {
    /**
     * 搜索词
     */
    private String searchText;

    /**
     * @description: 类型
     * @author 类型
     * @date 2024/1/20 19:16
     * @version 1.0
     */
    private String type;

    private static final long serialVersionUID = 1L;

}
