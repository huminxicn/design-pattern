package com.huminxi.builder;

/**
 * Main 类是 Builder 模式的测试程序。我们可以使用如下的命令来编写相应格式的文档:
 * <p>
 * > java Main plain 编写纯文本文档
 * > java Main html 编写 HTML 格式的文档
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/17 14:44
 */
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
//            usage();
            System.exit(0);
        }
        if (args[0].equals("plain")) {
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.construct();
            System.out.println(textBuilder.getResult());
        } else if (args[0].equals("html")) {
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            System.out.println(htmlBuilder.getResult() + " 文件编写完成");
        } else {
//            usage();
            System.out.println("Do nothing");
            System.exit(0);
        }
    }
}
