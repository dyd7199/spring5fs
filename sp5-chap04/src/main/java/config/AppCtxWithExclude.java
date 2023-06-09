package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import spring.MemberPrinter;
import spring.MemberSummaryPrinter;
import spring.VersionPrinter;

@Configuration
@ComponentScan(basePackages = {"spring"}
                , excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {}))
public class AppCtxWithExclude {
//    @Bean
//    public MemberDao memberDao(){
//        return new MemberDao();
//    }
//    @Bean
//    public MemberRegisterService memberRegisterService(){
//        return new MemberRegisterService(memberDao());
//    }
//    @Bean
//    public ChangePasswordService changePwdSvc(){
//        return new ChangePasswordService();
//    }
    @Bean
    @Qualifier("printer")
    public MemberPrinter memberPrinter1(){
        return new MemberPrinter();
    }
    @Bean
    @Qualifier("summaryPrint")
    public MemberSummaryPrinter memberPrinter2(){
        return new MemberSummaryPrinter();
    }

//    @Bean
//    public MemberListPrinter listPrinter(){
//        return new MemberListPrinter(memberDao(),memberPrinter1());
//    }

//    @Bean
//    public MemberInfoPrinter infoPrinter(){
//        MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
//        infoPrinter.setPrinter(memberPrinter2());
//        return new MemberInfoPrinter();
//    }
    @Bean
    public VersionPrinter versionPrinter(){
        VersionPrinter versionPrinter = new VersionPrinter();
        versionPrinter.setMajorVersion(5);;
        versionPrinter.setMinorVersion(0);
        return versionPrinter;
    }
}
