package com.jiang.service;

import java.util.List;

import com.jiang.entity.User;


public interface UserService {
	
	//����id��ȡuser
	public User findById(int id);
	
	//��ѯ�����û���Ϣ
	public List<User> findAll();
	
	//��¼
	public boolean login(String username,String password);
	
	//ע��
	public int InsertUser(User user);
	
	//�����û��Ƿ����
	public boolean checkUser(String username);
}
