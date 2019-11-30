package cn.itcast.demo;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws IOException, TemplateException {
        // 1.创建一个配置对象
        Configuration config = new Configuration(Configuration.getVersion());
        // 2.设置模板所在目录
        config.setDirectoryForTemplateLoading(new File("G:\\PinyougouProjectDev\\freemarker\\src\\main\\resources"));
        // 3.设置字符集
        config.setDefaultEncoding("utf-8");
        // 4.获取模板对象
        Template template = config.getTemplate("test.ftl");
        // 5.创建数据模型(可能是对象，也可能是map)
        Map map = new HashMap();
        map.put("name", "张三 ");
        map.put("message", "欢迎来到神奇的品优购世界！");
        map.put("success",false);

        List goodsList=new ArrayList();
        Map goods1=new HashMap();
        goods1.put("name", "苹果");
        goods1.put("price", 5.8);
        Map goods2=new HashMap();
        goods2.put("name", "香蕉");
        goods2.put("price", 2.5);
        Map goods3=new HashMap();
        goods3.put("name", "橘子");
        goods3.put("price", 3.2);
        goodsList.add(goods1);
        goodsList.add(goods2);
        goodsList.add(goods3);
        map.put("goodsList", goodsList);


        //6.创建一个输出流对象
        Writer out = new FileWriter("G:\\PinyougouProjectDev\\fremakerOut\\test.html");
        // 7.输出静态页面
        template.process(map,out);
        //8.关闭流
        out.close();
    }
}
