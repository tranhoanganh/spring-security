package com.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokenDto extends BaseDto {
    private String token;
    private Integer userid;
    private Integer expire;
    private UserDto user;
}
