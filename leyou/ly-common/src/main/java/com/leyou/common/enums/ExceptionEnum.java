package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Getter
@AllArgsConstructor
public enum ExceptionEnum {
    BRAND_NOT_FOUND(404,"品牌不存在！！"),
    CATEGORY_NOT_FOND(404,"商品分类没查到")
    ;
    private int code;
    private String msg;

}
