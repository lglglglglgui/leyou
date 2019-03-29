package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Getter
@AllArgsConstructor
public enum ExceptionEnum {
    PRICE_CANNOT_NOT_NULL(400,"价格不能为空！！"),
    CATEGORY_NOT_FOND(404,"商品分类没查到")
    ;
    private int code;
    private String msg;

}