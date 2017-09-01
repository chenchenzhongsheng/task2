package com.jnshu.controller;

import com.jnshu.model.User;
import com.jnshu.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    //使用日志
    private static Logger log = Logger.getLogger(UserController.class);
    //注入service
    @Autowired
    UserService userService;

    //列表查询
    @RequestMapping(value = "/a/student/userall", method = RequestMethod.GET)
    public String allCategory( Model model) {
        try {
            log.info("查找所有用户信息");
            List<User> userList = userService.list();
            int i = userList.size();
            log.info("当前用户数量为");
            System.out.println(i);
            model.addAttribute("user", userList);
            log.info("运行成功 " + userList);
        } catch (Exception e) {
            e.printStackTrace();
            log.info("出现异常");
            return "common/errorJson";
        }

        return "category/listJson";
    }

    @RequestMapping(value = "/a/student/user", method = RequestMethod.GET)
    public String detail1( Model model, Integer id) {
        // 判断传入的id 是否为数据库中存在的
        if (userService.get(id) != null) {
            try {
                log.info("根据id查询信息");
                log.info("查询id是" + id);
                User user = userService.get(id);
                //将数据绑定到model上，可以传入jsp页面
                model.addAttribute("category", user);
                log.info("得到的信息为" + user);
            } catch (Exception e) {
                e.printStackTrace();
                log.info("出现异常");
                return "common/errorJson";
            }
            return "category/categoryDataliJson";
        } else {
            log.info("数据库中没有此信息");
            return "common/errorParameterJson";
        }
    }

    //增加
    @RequestMapping(value = "/a/student/user", method = RequestMethod.POST)
    public String save(Model model, User user) {
        log.info("新增信息");
        //根据字段添加属性
        log.debug(user);
        userService.add(user);
        //再次查询 并且将其放入返回id的界面
        User user2 = userService.get(user.getId());
        //将数据绑定到model上，可以传入jsp页面
        model.addAttribute("category", user2);

        log.info("sucess");
        return "category/categoryDataliJson";
    }

    //删除
    @ResponseBody
    @RequestMapping(value = "/a/student/user", method = RequestMethod.DELETE)
    public String delete( int id) {
        if (userService.get(id) != null) {
            try {
                userService.delete(id);
            } catch (Exception e) {
                e.printStackTrace();
                return " error";
            }
            return "sucess";
        } else {
            log.info("数据库中没有此信息");
            return "error";
        }
    }

    //修改
    @RequestMapping(value = "/a/student/user", method = RequestMethod.PUT)
    public @ResponseBody
    List<User> contrl2 (HttpServletRequest request, HttpServletResponse response, Model model, User user){
        log.info("入参"+user);
     User user1 = new User();

     user1=userService.get(user.getId());
      // int i=this.userService.update(user);
        if(user.getName()!=null) {
            user1.setName(user.getName());
        } if(user.getQq()!=null) {
            user1.setQq(user.getQq());
        } if(user.getStyle()!=null) {
            user1.setStyle(user.getStyle());
        } if(user.getEstimated_time()!=null) {
            user1.setEstimated_time(user.getEstimated_time());
        } if(user.getGraduate_institutions()!=null) {
            user1.setGraduate_institutions(user.getGraduate_institutions());
        }if(user.getOnline_id()!=null) {
            user1.setOnline_id(user.getOnline_id());
        }if(user.getDaily_link()!=null) {
            user1.setDaily_link(user.getDaily_link());
        }if(user.getPledge()!=null) {
            user1.setPledge(user.getPledge());
        }if(user.getSenior_tutor()!=null) {
            user1.setSenior_tutor(user.getSenior_tutor());
        }if(user.getSource()!=null) {
            user1.setSource(user.getSource());
        }if(user.getCreate_at()!=null) {
            user1.setCreate_at(user.getCreate_at());
        } if(user.getUpdata_at()!=null) {
            user1.setUpdata_at(user.getUpdata_at());
        }
       userService.update(user1);
        log.info("出参"+user1);
        List<User> list=new ArrayList<User>();
        list.add(user1);
        log.info("list"+list);
        return  list;
    }
}



