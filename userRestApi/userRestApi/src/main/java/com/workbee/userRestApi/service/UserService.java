		
		package com.workbee.userRestApi.service;
		
		import java.util.List;
		
		import javax.transaction.Transactional;
		
		import org.springframework.beans.factory.annotation.Autowired;
		import org.springframework.beans.factory.annotation.Qualifier;
		import org.springframework.stereotype.Service;
		
		import com.workbee.userRestApi.dao.UserDao;
		import com.workbee.userRestApi.dao.UserRepository;
		import com.workbee.userRestApi.entity.User;
		
		@Service("userService")
		public class UserService {
		
			@Autowired
			@Qualifier("userDao")
			 private UserDao userDao;
		@Autowired
		private UserRepository userRepository;
		
		
		public User findByEmailAndPassword(String email, String password) {
			return  userRepository.findByEmailAndPassword(email, password);
		}
		
		
		
		
		
		
		
		
		public void save(User user) {
			userRepository.save(user);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	@Transactional
			public User getUserById(long userId) {
		
				return userDao.selectUserById(userId);
			}
		
			@Transactional
			public void addUser(User user) {
				userDao.insertUser(user);
			}
		
			/*@Transactional
			public void modifyUser(User user) {
				userDao.updateUser(user);
			}
		
			@Transactional
			public List<User> getAllUser() {
				return userDao.selectAllUser();
		
			}
		
			@Transactional
			public void removeUser(long userId) {
				userDao.deleteUser(userId);
		
			}*/
		
			/*@Autowired
		public User create(User user) { 
			return userRepository.save(user);
		}
			*/
		}
