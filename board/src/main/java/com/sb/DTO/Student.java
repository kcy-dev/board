package com.sb.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@EqualsAndHashCode(of="studentNo")
public class Student {
	private int studentNo;
	private String name;
}
