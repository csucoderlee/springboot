#spring-boot demo

##desciption
这是一个spring-boot的学习demo

##坑点
1.“Application类”是指SpringBoot项目入口类。这个类的位置很关键：
  如果Application类所在的包为：com.boot.app，则只会扫描com.boot.app包及其所有子包，如果service或dao所在包不在com.boot.app及其子包下，则不会被扫描！