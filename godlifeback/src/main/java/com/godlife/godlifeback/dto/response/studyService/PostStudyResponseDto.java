package com.godlife.godlifeback.dto.response.studyService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.godlife.godlifeback.dto.response.ResponseCode;
import com.godlife.godlifeback.dto.response.ResponseDto;
import com.godlife.godlifeback.dto.response.ResponseMessage;

import lombok.Getter;

@Getter
public class PostStudyResponseDto extends ResponseDto{
    
    private PostStudyResponseDto(String code ,String message){
        super(code, message);
    }

    public static ResponseEntity<PostStudyResponseDto> success(){
        PostStudyResponseDto result = new PostStudyResponseDto(ResponseCode.SUCCESS,ResponseMessage.SUCCESS);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    public static ResponseEntity<ResponseDto> notExistStudy(){
        ResponseDto result = new ResponseDto(ResponseCode.NOT_EXIST_STUDY_ROOM, ResponseMessage.NOT_EXIST_STUDY_ROOM);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
