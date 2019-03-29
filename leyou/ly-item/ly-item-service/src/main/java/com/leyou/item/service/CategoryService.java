package com.leyou.item.service;

import com.leyou.common.advice.LyException;
import com.leyou.common.enums.ExceptionEnum;
import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;


    public List<Category> queryCategoryListByPid(Long id) {
        Category t=new Category();
        t.setParentId(id);
        List<Category> list = categoryMapper.select(t);
        if(CollectionUtils.isEmpty(list)){
            throw  new LyException(ExceptionEnum.CATEGORY_NOT_FOND);
        }
        return list;
    }
}
