package com.yupi.springbootinit.datasource;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

public interface DataSource<T> {
    
    /**
     * @description: 搜索（新接入数据源必须实现）
     * @author 彭
     * @date 2024/1/20 20:24
     * @version 1.0
     */
    Page<T> doSearch(String searchText, long pageNum, long pageSize);
}
