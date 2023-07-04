package com.wms.service.impl;

import com.wms.entity.Logs;
import com.wms.mapper.LogsMapper;
import com.wms.service.ILogsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author losingways
 * @since 2023-07-04
 */
@Service
public class LogsServiceImpl extends ServiceImpl<LogsMapper, Logs> implements ILogsService {

}
