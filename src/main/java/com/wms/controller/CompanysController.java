package com.wms.controller;


import com.wms.common.QueryPageParam;
import com.wms.common.Result;
import com.wms.entity.Companys;
import com.wms.entity.Good;
import com.wms.service.ICompanysService;
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
@RequestMapping("/companys")
public class CompanysController {
    @Autowired
    private ICompanysService companysService;

    @GetMapping("/list")
    public List<Companys> list(){
        return companysService.list();
    }

    @PostMapping("/Companys_Login")
    public Result login(@RequestBody QueryPageParam queryPageParam){
        HashMap param = queryPageParam.getParam();
        String name = (String)param.get("managerName");
        String password = (String)param.get("password");
        List list = companysService.lambdaQuery()
                .eq(Companys::getManagerName,name)
                .eq(Companys::getPassword,password).list();
        return list.size()>0?Result.suc(list.get(0),1L):Result.fail();
    }

}
