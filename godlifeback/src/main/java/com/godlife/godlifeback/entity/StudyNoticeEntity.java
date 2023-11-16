package com.godlife.godlifeback.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.godlife.godlifeback.dto.request.study.PostNoticeRequestDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="study_notice")
@Table(name="study_notice")
public class StudyNoticeEntity {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int noticeNumber;
    private int studyNumber;
    private String noticeContent;

    public StudyNoticeEntity(PostNoticeRequestDto dto, Integer studyNumber){
        this.studyNumber = studyNumber;
        this.noticeContent = dto.getNoticeContent();
    }

}
