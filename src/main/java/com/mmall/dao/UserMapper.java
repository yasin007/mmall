package com.mmall.dao;

import com.mmall.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 检查用户名是否存在
     *
     * @param username
     * @return
     */
    int checkUsername(String username);

    /**
     * 检查邮箱是否存在
     *
     * @param email
     * @return
     */
    int checkEmail(String email);

    /**
     * 查询是否密码是否正确
     *
     * @param username
     * @param password
     * @return
     */
    User selectLogin(@Param("username") String username, @Param("password") String password);

    /**
     * 查找问题
     *
     * @param username
     * @return
     */
    String selectQuestionByUsername(String username);

    /**
     * 查询用户答案是否正确
     *
     * @param username
     * @param question
     * @param answer
     * @return
     */
    int checkAnswer(@Param("username") String username, @Param("question") String question, @Param("answer") String answer);

    /**
     * 更新密码
     *
     * @param username
     * @param passwordNew
     * @return
     */
    int updatePasswordByUsername(@Param("username") String username, @Param("passwordNew") String passwordNew);


    /**
     * 查询密码是否正确
     *
     * @param password
     * @param userId
     * @return
     */
    int checkPassword(@Param(value = "password") String password, @Param("userId") Integer userId);

    /**
     * 查询当前邮箱是否存在
     *
     * @param email
     * @param userId
     * @return
     */
    int checkEmailByUserId(@Param(value = "email") String email, @Param(value = "userId") Integer userId);


}