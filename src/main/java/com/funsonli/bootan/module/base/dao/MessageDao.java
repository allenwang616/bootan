package com.funsonli.bootan.module.base.dao;

import com.funsonli.bootan.base.BaseDao;
import com.funsonli.bootan.module.base.entity.Message;
import org.springframework.stereotype.Repository;

/**
 * 消息数据处理层
 * @author Funsonli
 */
@Repository
public interface MessageDao extends BaseDao<Message, String> {

}
