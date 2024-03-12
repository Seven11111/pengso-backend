package com.yupi.springbootinit.job.once;

import cn.hutool.core.collection.CollUtil;
import com.yupi.springbootinit.esdao.PostEsDao;
import com.yupi.springbootinit.mapper.PostMapper;
import com.yupi.springbootinit.model.dto.post.PostEsDTO;
import com.yupi.springbootinit.model.entity.Post;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mr.Peng
 * @version 1.0
 * @description: TODO
 * @date 2024/1/23 16:05
 */
// 消除Component注解执行
//@Component
@Slf4j
public class InitPostToEs implements CommandLineRunner {
    @Resource
    private PostMapper postMapper;

    @Resource
    private PostEsDao postEsDao;
    @Override
    public void run(String... args) {
        // 查询所有的数据
        List<Post> postList = postMapper.selectList(null);
        if (CollUtil.isEmpty(postList)) {
            log.info("no inc post");
            return;
        }
        List<PostEsDTO> postEsDTOList = postList.stream()
                .map(PostEsDTO::objToDto)
                .collect(Collectors.toList());
        final int pageSize = 500;
        int total = postEsDTOList.size();
        log.info("InitPostToEs start, total {}", total);
        for (int i = 0; i < total; i += pageSize) {
            int end = Math.min(i + pageSize, total);
            log.info("sync from {} to {}", i, end);
            postEsDao.saveAll(postEsDTOList.subList(i, end));
        }
        log.info("InitPostToEs end, total {}", total);

    }
}
