package com.se.HomeRenting.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.persistence.*;

@Data
@Entity
@Table(name = "userrent")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})

public class Forrent {
    private Integer userid;
    //用户编号

    private Integer houseid;
    //房屋编号

    private Integer houseelevator;
    //有无电梯

    private Integer housejoinrent;
    //是否合租

}
