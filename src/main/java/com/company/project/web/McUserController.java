package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.McUser;
import com.company.project.service.McUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by ergou on 2017/11/03.
*/
@RestController
@RequestMapping("/mc/user")
public class McUserController {
    @Resource
    private McUserService mcUserService;

    @PostMapping
    public Result add(@RequestBody McUser mcUser) {
        mcUserService.save(mcUser);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        mcUserService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping
    public Result update(@RequestBody McUser mcUser) {
        mcUserService.update(mcUser);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable long id) {
        McUser mcUser = mcUserService.findById(id);
        return ResultGenerator.genSuccessResult(mcUser);
    }

    @GetMapping
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<McUser> list = mcUserService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
