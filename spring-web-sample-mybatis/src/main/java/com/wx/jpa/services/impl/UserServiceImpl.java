package com.wx.jpa.services.impl;

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

import com.wx.jpa.entities.User;
import com.wx.jpa.repository.UserRepository;
import com.wx.jpa.services.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wuxinshui on 2017/1/12.
 */
@Service
public class UserServiceImpl implements UserService{
	@Resource
	private UserRepository userRepository;

	public void save(User user) {
		userRepository.save(user);
	}
}
