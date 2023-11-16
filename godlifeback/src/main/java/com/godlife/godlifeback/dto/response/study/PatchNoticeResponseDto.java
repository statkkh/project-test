package com.godlife.godlifeback.dto.response.study;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.godlife.godlifeback.dto.response.ResponseCode;
import com.godlife.godlifeback.dto.response.ResponseDto;
import com.godlife.godlifeback.dto.response.ResponseMessage;

import lombok.Getter;

@Getter
public class PatchNoticeResponseDto extends ResponseDto{
    
    private PatchNoticeResponseDto(String code, String message){
        super(code, message);
    }

    public static ResponseEntity<PatchNoticeResponseDto> success(){
        PatchNoticeResponseDto result = new PatchNoticeResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}