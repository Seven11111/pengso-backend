package com.yupi.springbootinit.datasource;

import com.yupi.springbootinit.model.enums.SearchTypeEnum;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Mr.Peng
 * @version 1.0
 * @description: TODO
 * @date 2024/1/20 21:01
 */
@Component
public class DataSourceRegistry {
    @Resource
    private PostDataSource postDataSource;

    @Resource
    private PictureDataSource pictureDataSource;

    @Resource
    private UserDataSource userDataSource;


    Map<String, DataSource<T>> typeDataSourceMap;

    @PostConstruct
    public void doInitialize() {
        typeDataSourceMap = new HashMap() {{
            put(SearchTypeEnum.POST.getValue(), postDataSource);
            put(SearchTypeEnum.PICTURE.getValue(), pictureDataSource);
            put(SearchTypeEnum.USER.getValue(), userDataSource);
        }};
    }


    public DataSource<T> getDataSourceByType(String type) {
        if(typeDataSourceMap == null) {
            return null;
        }
        return typeDataSourceMap.get(type);
    }
}
