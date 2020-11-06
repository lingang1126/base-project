package com.out.project.specification;

import com.out.project.common.exception.LogicException;

/**
 * PackageName: com.gugu.business.core.specification.insuranceCase
 * FileName: CasePec.java
 * Description: TODO 案件业务规则
 * Copyright: Copyright (c)2020
 * Company: 估估网络科技有限公司
 *
 * @author zhaoqilong@gugu.com
 * @version 1.0, 2020-03-19
 */
public class TaskSpec {

    /**
     * 对象校验
     *
     * @param obj
     */
    public static void assertHanding(Object obj) {
        if (obj == null) {
            throw new LogicException("任务不存在");
        }

    }

}
