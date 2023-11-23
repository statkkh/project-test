package com.godlife.godlifeback.entity.primaryKey;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserAttendanceInformationListPk implements Serializable{
    @Column(name = "user_email")
    private String userEmail;
    @Column(name = "study_number")
    private int studyNumber;
}