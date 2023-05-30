package cart.member.presentation;

import cart.member.infrastructure.persistence.dao.MemberDao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    private final MemberDao memberDao;

    public MemberController(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @PostMapping("/members")
    ResponseEntity<String> signUp(
            @RequestBody SignUpRequest request
    ) {
        memberDao.addMember(request.toMember());
        return ResponseEntity.ok("OK!");
    }
}
