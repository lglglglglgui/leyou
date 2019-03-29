package com.leyou.common.advice;

import com.leyou.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LyException extends RuntimeException {
    private ExceptionEnum exceptionEnums;

}
