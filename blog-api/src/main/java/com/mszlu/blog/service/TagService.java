package com.mszlu.blog.service;

import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.TagVo;

import java.util.List;

public interface TagService {
//    /**
//     * 通过文章Id查询Tags
//     * @param articleId
//     * @return
//     */
    List<TagVo> findTagsByArticleId(Long articleId);

    Result hots(int limit);
}
