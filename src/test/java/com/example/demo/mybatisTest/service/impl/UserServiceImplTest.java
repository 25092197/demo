package com.example.demo.mybatisTest.service.impl;

import com.example.demo.mybatisTest.dao.DeptDao;
import com.example.demo.mybatisTest.dao.RoleDao;
import com.example.demo.mybatisTest.dao.UserDao;
import com.example.demo.mybatisTest.entity.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImplTest.class);

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private DeptDao deptDao;

    @Autowired
    private UserDao userDao;

    @Test
    public void getUserByName() {
        System.out.println("______________________________");
    }



//    @Before
//    public void insertRoles(){
//        Roles r = new Roles("GLY","管理员");
//        roleDao.save(r);
//        Assert.assertNotNull(r.getId());
//        Depts d = new Depts("ZXYFB","咨询研发部");
//        deptDao.save(d);
//        Assert.assertNotNull(d.getId());
//    }

//    @Test
//    public void insert(){
//        Users u = new Users();
//        u.setName("张丽颖");
//        u.setSex("女");
//        u.setBirthday(new Date());
//
//        Depts d = deptDao.findByName("咨询研发部");
//        List<Roles> list = roleDao.findAll();
//
//        u.setDept(d);
//        u.setRoles(list);
//
//        userDao.save(u);
//    }


    @Test
    public void findUserPage(){
        Pageable  pageable = PageRequest.of(0,10,new Sort(Sort.Direction.ASC,"id"));
        Page<Users> page = userDao.findAll(pageable);
        for (Users u:page.getContent()){
            assert u.getRoles().size()>0:"length = 0";
            assert u.getDept()!=null:"dept is not exsit";
            logger.info("UserName:{},roleName:{},deptName:{}",u.getName(),u.getRoles().iterator().next().getName(),u.getDept().getName());
        }
    }
}