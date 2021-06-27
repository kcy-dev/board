package com.sb.DTO;

import org.springframework.lang.NonNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString(exclude="userName")
public class Member {
	@NonNull
	private String userId;
	private String password;
	private String userName;
}
