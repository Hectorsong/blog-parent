package com.mszlu.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mszlu.blog.dao.dos.Archives;
import com.mszlu.blog.dao.pojo.Article;

import java.util.List;

public interface ArticleMapper extends BaseMapper<Article> {

    /**
     * 查询ms_article表，按照year，month进行group，统计哪年哪月的文章数量
     * @return
     */
    List<Archives> listArchives();
}
