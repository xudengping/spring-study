package xdp.test.spring.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao2 implements IUserDao{

	@Override
	public void save() {
		System.out.println("UserDao2 save");
		
	}

}
