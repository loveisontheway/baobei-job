package com.baobei.job.executor.constants;

/**
 * 用于代码生成的项目常量
 *
 * @author jiangjialiang on 2018/06/05
 */
public final class ProjectConstant {
    /** 项目基础包名称，根据项目修改 */
    public static final String BASE_PACKAGE = ProjectConstant.getBasePackage();
    /** Domain所在包 */
    public static final String DOMAIN_PACKAGE = BASE_PACKAGE + ".domain";
    /** Mapper所在包 */
    public static final String MAPPER_PACKAGE = BASE_PACKAGE + ".mapper.first";
    /** Service所在包 */
    public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service.first";
    /** XML所在路径 */
    public static final String XML_PACKAGE = "mybatis/mapper/first";
    /** ServiceImpl所在包 */
    public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";
    /** DTO所在包 */
    public static final String DTO_PACKAGE = BASE_PACKAGE + ".dto";
    /** Controller所在包 */
    public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".web";
    /** JobHandler所在包 */
    public static final String JOBHANDLER_PACKAGE = BASE_PACKAGE + ".jobhandler";
    /** 所在项目名称 */
    public static final String PROJECT_NAME = ProjectConstant.getProjectName();

    /** 获取项目名的依据 */
    private static final String TARGET = "target";

    /**
     * 获取项目基础包路径
     * @return String 包路径
     */
    private static String getBasePackage() {
        String packageName = ProjectConstant.class.getPackage().getName();
        return packageName.substring(0, packageName.lastIndexOf("."));
    }

    /**
     * 获取项目名
     * @return String 包路径
     */
    private static String getProjectName() {
        String path = ProjectConstant.class.getResource("/").getFile().toString();
        String[] ps = path.split("/");
        String projectName = "";
        for (int i = 0; i < ps.length; i++) {
            if (ProjectConstant.TARGET.equals(ps[i])) {
                projectName = ps[i - 1];
                break;
            }
        }
        return "/"+projectName;
    }

}
