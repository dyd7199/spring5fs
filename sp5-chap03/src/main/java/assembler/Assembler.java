package assembler;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberRegisterService;

public class Assembler {


    private MemberDao memberDao;
    private MemberRegisterService memberRegSvc;
    private ChangePasswordService changePwdSvc;

    public Assembler() {

        memberDao = new MemberDao();
        memberRegSvc = new MemberRegisterService(memberDao);
        changePwdSvc = new ChangePasswordService();
        changePwdSvc.setMemberDao(memberDao);

    }

    public MemberDao getMemberDao() {
        return memberDao;
    }

    public MemberRegisterService getMemberRegSvc() {
        return memberRegSvc;
    }

    public ChangePasswordService getChangePwdSvc() {
        return changePwdSvc;
    }
}
