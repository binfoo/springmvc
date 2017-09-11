package org.binfoo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Test16MystarterApplication {

	@Value(value = "${book.author}")
	private String bookAuthor;

	@Value(value = "${book.name}")
	private String bookName;

	@Value(value = "${book.pinyin}")
	private String bookPinyin;


	@Autowired
	private BookBean bookBean;




	public static void main(String[] args) {
//		SpringApplication.run(Test16MystarterApplication.class, args);
		//默认启动方式

		SpringApplicationBuilder builder = new SpringApplicationBuilder(Test16MystarterApplication.class);
		builder.bannerMode(Banner.Mode.CONSOLE).run(args);
		//关闭Bunner
	}

	@RequestMapping(value = "/",produces = "text/plain;charset=UTF-8")
	public String index(){
		return "The BookName is "+bookName+";and Book Author is "+bookAuthor+";and Book PinYin is "+bookPinyin;
	}

	@RequestMapping(value = "/book")
	public String book(){
		return "Hello Spring Boot! The BookName is "+bookBean.getName()+";and Book Author is "+bookBean.getAuthor()
				+"and BookPrice is : " + bookBean.getPrice();
	}
			;

}
