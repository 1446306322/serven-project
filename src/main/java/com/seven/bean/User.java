package com.seven.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户")
public class User {
    @ApiModelProperty("身份证号")
    private Integer idcard;
    @ApiModelProperty("名字")
    private String name;
    private Integer phone;
    private String address;
}
