package com.wx.jpa.repository;

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
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wuxinshui on 2017/1/12.
 */
public interface UserRepository extends JpaRepository<User,Integer> {

	User findById(int i);

	User findByChangUser(String sl1);
}
