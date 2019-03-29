package com.leyou.item.service;

import com.leyou.item.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandService {

    @Autowired
    private BrandMapper brandMapper;
}
