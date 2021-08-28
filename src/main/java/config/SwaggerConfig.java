package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * @Configuration  表明这是一个配置类
 * @EnableSwagger2WebFlux 开启swagger功能
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 使用swagger需要创建一个摘要 Docket
     * 摘要参数如下
     * 文档类型 使用swagger2   DocumentationType.SWAGGER_2
     * 文档使用了一系列选择器   有两个，api和path
     * select() 设置apis()和paths()
     * apis() 查找生成了的所有controller接口
     *     RequestHandlerSelectors.any()这是代表接收所有
     *     RequestHandlerSelectors.basePackage（“ 输入controller包路径”） 这表示接收指定的包下类
     * paths() 再找到的接口中进行筛选
     *
     * @return
     */
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.seven.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    /**
     * 自定义文档介绍
     * 通过ApiInfoBuilder创建ApiInfo
     * 参数可以设置 title（标题） description（描述） version（版本） 等等 最后build（）生成
     * @return
     */

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("这是第七组第二个项目")
                .description("这是一个简单的描述")
                .version("1.0")
                .build();
    }
}
