package com.monkeybeat.loginservice.feignInterface;

import com.monkeybeat.loginservice.RequestDTO.UserRequestDTO;
import com.monkeybeat.loginservice.constants.MicroServiceConstants;
import com.monkeybeat.loginservice.responseDTO.UserResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = MicroServiceConstants.AdminMicroServiceConstants.BASE)
@Service
@RequestMapping(value = MicroServiceConstants.BASE_API)
public interface AdminInterface {

    @RequestMapping(value = MicroServiceConstants.AdminMicroServiceConstants.SEARCH_ADMIN)
    UserResponseDTO searchAdmin(@RequestBody UserRequestDTO requestDTO);

    @RequestMapping(value = MicroServiceConstants.AdminMicroServiceConstants.UPDATE_ADMIN)
    void updateAdmin(@RequestBody UserResponseDTO responseDTO);
}
