package com.wms.service.impl;

import com.wms.entity.Good;
import com.wms.mapper.GoodMapper;
import com.wms.service.IGoodService;
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
public class GoodServiceImpl extends ServiceImpl<GoodMapper, Good> implements IGoodService {

}
