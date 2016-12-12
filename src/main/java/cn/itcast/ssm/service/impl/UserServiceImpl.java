package cn.itcast.ssm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itcast.ssm.mapper.UserMapper;
import cn.itcast.ssm.po.User;
import cn.itcast.ssm.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userTMapper;
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return this.userTMapper.selectByPrimaryKey(id);
	}

}
