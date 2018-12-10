baobei-job ![alt tag](https://api.travis-ci.org/phishman3579/java-algorithms-implementation.svg?branch=master)
==============================

xxl-job revision. 基于[xxl-job](https://github.com/xuxueli/xxl-job)修改版，选用的执行器版本为Spring Boot(引入了多数据源配置，Swagger2，MyBatis Generator代码自动生成器，根据数据库表名生成对应的Domain、Mapper、Service、ServiceImpl、Controller、JobHandler、DTO、XML，简化开发).

## Table of Contents
+ [Environment](https://github.com/loveisontheway/baobei-job#Environment)
+ [Start](https://github.com/loveisontheway/baobei-job#Start)
+ [Project](https://github.com/loveisontheway/baobei-job#Project)
+ [Multi-datasource](https://github.com/loveisontheway/baobei-job#Multi-datasource)
+ [CodeGenerator](https://github.com/loveisontheway/baobei-job#CodeGenerator)

## Environment
+ `JDK:` 1.8+
+ `Tomcat:` 8.5.x
+ `XXL-JOB:` 2.0.2-SNAPSHOT
+ `Spring Boot:` 1.5.17
+ `MySQL:` 5.6+
+ `Swagger2:` 2.9.2
+ `MyBatis Generator:` 1.3.5

## Start
项目启动顺序:
1. 先启动 `baobei-job-admin` (任务调度中心)，访问地址：http://localhost:8080/baobei-job-admin.

2. 然后再启动`baobei-job-executor` 项目

## Project
| name | description |
| :------ | :------ |
| baobei-job-admin | 任务调度中心 |
| baobei-job-core | 公共jar包 |
| baobei-job-executor | 执行器，Spring Boot |

## Multi-datasource
多数据源实现，可以直接参考`com.baobei.job.executor.config`下的`DataSourceFirstConfig`类.

## CodeGenerator
在`com.baobei.job.executor.test`包下`CodeGenerator`类是MyBatis Generator自动生成代码器，直接运行Main方法即可。

```java
public static void main(String[] args) {
    /**
     * 单表名
     * 元素1: 表名 [不可为空，与MySQL表名保持一致]
     * 元素2: 自定义名称 [""或null 表示直接引用'元素1']
     * 元素3: 类注释描述 [""或null 表示无注释]
     * 元素4: 主键数据类型 [不可为空，默认Integer]
     */
    String[][] arrNames = {{"func", "", "函数", "String"}};
    // 多表名
/*    String[][] arrNames = {
        {"help_topic", "", "主题", "Integer"},
        {"func", "", "函数", "String"},
        {"plugin", "", "插件", "String"},
        {"tables_priv", "", "表", "String"}
    };*/
    genCode(arrNames);
}
```
