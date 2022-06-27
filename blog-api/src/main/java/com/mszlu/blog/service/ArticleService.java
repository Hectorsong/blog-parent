package com.mszlu.blog.service;

import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.params.PageParams;

public interface ArticleService {
    /**
     * 分页查询  文章列表
     * @param pageParams
     * @return
     */
    Result listArticle(PageParams pageParams);

    /**
     * 查询ms_article表，根据view_counts（浏览数量）字段降序取limit
     * @param limit
     * @return
     */
    Result hotArticle(int limit);

    /**
     * 查询ms_article表，根据creat_date (创建时间) 字段降序取limit
     * @param limit
     * @return
     */
    Result newArticle(int limit);

    /**
     * 查询ms_article表，根据creat_date按照时间分组
     * @return
     */
    Result listArchives();
}
