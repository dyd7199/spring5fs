package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import spring.*;

@Configuration
@ComponentScan(basePackages = {"spring","spring2"})
public class AppCtx {
//    @Bean
//    public MemberDao memberDao2(){
//        MemberDao memberDao = new MemberDao();
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
