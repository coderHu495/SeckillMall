package com.mall.seckill.exception;

import com.mall.seckill.enums.CodeMsg;

/**
 * 全局异常类
 */
public class GlobalException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private CodeMsg cm;

    public GlobalException(CodeMsg cm) {
        super(cm.toString());
        this.cm = cm;
    }

    public CodeMsg getCm() {
        return cm;
    }
}
