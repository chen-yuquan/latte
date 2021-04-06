package com.yzu.latte.domain.service.itpg0001;

import com.yzu.latte.domain.repository.itpg0001.LTPG0001Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service
@Transactional
public class LTPG0001ServiceImpl implements LTPG0001Service {

    @Autowired
    LTPG0001Repository ltpg0001Repository;

    @Override
    public LTPG0001ServiceResponse lattePage0001Service(LTPG0001ServiceRequest request) {

        LTPG0001ServiceResponse response = new LTPG0001ServiceResponse();

        int memberLevel = ltpg0001Repository.selectMemberLevelFromUser(request.getUserID(), request.getPassword());

        response.setMemeberLevel(memberLevel);

        return response;
    }
}
