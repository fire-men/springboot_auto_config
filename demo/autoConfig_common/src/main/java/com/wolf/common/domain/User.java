package com.wolf.common.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jingjing520
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
   private String userName;
   private String password;
}
