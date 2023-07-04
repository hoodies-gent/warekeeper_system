package com.wms.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wms.common.QueryPageParam;
import com.wms.common.Result;
import com.wms.entity.Good;
import com.wms.service.IGoodService;
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
@RequestMapping("/good")
public class GoodController {
    @Autowired
    private IGoodService goodService;

    @GetMapping("/list")
    public List<Good> list(){
        return goodService.list();
    }

    @PostMapping("/save")
    public boolean save(@RequestBody Good good){
        return goodService.save(good);
    }

    @PostMapping("/mod")
    public boolean mod(@RequestBody Good good){
        return goodService.updateById(good);
    }

    @PostMapping("/saveOrMod")
    public boolean saveOrMod(@RequestBody Good good){
        return goodService.saveOrUpdate(good);
    }

    @GetMapping("/delete")
    public boolean delete(Integer id){
        return goodService.removeById(id);
    }

    @PostMapping("/login")
    public Result login(@RequestBody Good good){
        List list = goodService.lambdaQuery()
                .eq(Good::getName,good.getName())
                .eq(Good::getId,good.getId()).list();
        return list.size() > 0?Result.suc(list.get(0),1L):Result.fail();
    }

    @PostMapping("/list_p")
    public List<Good> list_p(@RequestBody Good good){
        LambdaQueryWrapper<Good>  lambdaQueryWrapper = new LambdaQueryWrapper();
        lambdaQueryWrapper.like(Good::getName,good.getName());
        return goodService.list(lambdaQueryWrapper);
    }

    @PostMapping("/list_Page")
    public Result list_Page(@RequestBody QueryPageParam queryPageParam){
        System.out.println(queryPageParam);
        System.out.println("num===" + queryPageParam.getPageNum());
        System.out.println("size===" + queryPageParam.getPageSize());

        HashMap param = queryPageParam.getParam();
        //System.out.println("name===" + (String)param.get("name"));

        Page<Good> page = new Page<>(queryPageParam.getPageNum(),queryPageParam.getPageSize());

        LambdaQueryWrapper<Good>  lambdaQueryWrapper = new LambdaQueryWrapper();
        lambdaQueryWrapper.like(Good::getName,(String)param.get("name"));
        IPage result = goodService.page(page,lambdaQueryWrapper);

        //System.out.println("total==" + result.getTotal());
        if(result.getTotal() == 0) return Result.fail();
        else return Result.suc(result.getRecords(), result.getTotal());
    }

}

