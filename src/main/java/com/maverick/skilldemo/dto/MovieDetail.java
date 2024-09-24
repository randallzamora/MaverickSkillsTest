package com.maverick.skilldemo.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MovieDetail {
    private Long id;
    private String title;
    private String imbId;
    private String detail;
}
