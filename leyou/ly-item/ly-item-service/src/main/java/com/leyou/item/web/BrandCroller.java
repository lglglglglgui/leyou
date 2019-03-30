package com.leyou.item.web;

import com.leyou.common.vo.PageResult;
import com.leyou.item.pojo.Brand;
import com.leyou.item.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("brand")
public class BrandCroller {

    @Autowired
    private BrandService brandService;

    @RequestMapping("page")
    public ResponseEntity<PageResult<Brand>> queryBrandByPage(
            @RequestParam(value = "page",defaultValue ="1" )Integer page,  //当前页
            @RequestParam(value = "rows",defaultValue ="5" )Integer rows,   //每页记录数
            @RequestParam(value = "sortBy",required = false)String sortBy,  //更具什么排序
            @RequestParam(value = "desc",defaultValue ="false" )Boolean desc, //排序方式
            @RequestParam(value = "key",required = false)String key //查询的关键字
    ){

        return ResponseEntity.ok(brandService.queryBrandByPage(page,rows,sortBy,desc,key));
    }
}
