package com.bluepay.mytatis.generator;

import org.mybatis.generator.api.ShellRunner;

/**
 * 自动代码生成器
 */
public class Application {
    public static void main(String[] args) {
        System.out.println(Application.class.getResource("").getPath());
        args = new String[] { "-configfile", "/D:/workspace/walletserver/mybatisgenerator/target/classes/mybatis-generator-config.xml", "-overwrite" };
        ShellRunner.main(args);
    }
}
