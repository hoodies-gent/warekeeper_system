package com.wms.controller;


import com.wms.common.QueryPageParam;
import com.wms.common.Result;
import com.wms.entity.Companys;
import com.wms.entity.Staffs;
import com.wms.service.IStaffsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author losingways
 * @since 2023-07-04
 */
@RestController
@RequestMapping("/staffs")
public class StaffsController {
    @Autowired
    private IStaffsService staffsService;
    @GetMapping("/list")
    public List<Staffs> list(){
        return staffsService.list();
    }

    @PostMapping("/Staffs_Login")
    public Result login(@RequestBody QueryPageParam queryPageParam){
        HashMap param = queryPageParam.getParam();
        String name = (String)param.get("userName");
        String password = (String)param.get("password");
        List list = staffsService.lambdaQuery()
                .eq(Staffs::getUserName,name)
                .eq(Staffs::getPassword,password).list();
        return list.size()>0?Result.suc(list.get(0),1L):Result.fail();
    }
}
