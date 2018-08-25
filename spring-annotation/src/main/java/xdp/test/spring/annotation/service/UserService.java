package xdp.test.spring.annotation.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import xdp.test.spring.annotation.dao.IUserDao;

@Service
public class UserService implements IUserService{
	
	@Autowired
	@Qualifier("userDao2")
	private IUserDao iuserDao;
//	
//	@Resource(name="userDao")
//	private IUserDao userDao;

	@Override
	public void save() {
		iuserDao.save();
		
	}
	
	

}
