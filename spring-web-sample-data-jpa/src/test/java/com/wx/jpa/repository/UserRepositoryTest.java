package com.wx.jpa.repository;

import com.wx.jpa.entities.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;


/**
 * Copyright [2017$] [Wuxinshui]
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * Created by wuxinshui on 2017/1/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;

	private int id=2;

	@Test
	public void test1(){
		User user=new User("SL1","123",new Date(),"");
		userRepository.save(user);
		System.out.println("save success");
		//user 中包含Id
		System.out.println(user);
	}

	@Test
	public void test2(){
		for (User user:userRepository.findAll()) {
			System.out.println(user);
		}
		System.out.println("search all success");
	}

	@Test
	public void test3(){
		System.out.println(userRepository.findOne(10));
		System.out.println(userRepository.findById(10));
		System.out.println(userRepository.findByChangUser("SL21"));
		System.out.println("search one success");
	}

	@Test
	public void test4(){
		User user=new User("SL11","123",new Date(),"");
		user.setId(6);
		userRepository.save(user);
		test3();
		System.out.println("update success");
		System.out.println(user);
	}

	@Test
	public void test5(){
		userRepository.delete(6);
		test3();
		System.out.println("delete success");
	}
}