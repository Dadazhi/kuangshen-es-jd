package com.kuang.kuangshenesjd.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Content {
    
    private String title;
    private String img;
    private String price;
    
    // 可以自行扩张
}
