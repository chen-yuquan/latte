package com.yzu.latte.domain.repository.itpg0001;


import org.apache.ibatis.annotations.Param;

public interface LTPG0001Repository {

    int selectMemberLevelFromUser(@Param("userID") String userID, @Param("password") String password);

}
