package cn.jbone.sys.service.model.menu;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import java.util.List;

@Data
public class CreateMenuModel {
    private Integer systemId;
    private Integer pid;
    @NotBlank(message = "名字不能为空")
    private String name;
    @NotBlank(message = "URL不能为空")
    private String url;
    private String target;
    private String icon;
    private long orders;
}
