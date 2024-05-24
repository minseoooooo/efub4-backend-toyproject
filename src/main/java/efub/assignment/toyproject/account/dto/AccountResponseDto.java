package efub.assignment.toyproject.account.dto;


import efub.assignment.toyproject.account.domain.Account;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AccountResponseDto {
    private Long accountId;
    private String email;
    private String nickname;
//    private Date joinedDate;
    private LocalDateTime createdDate;



    public AccountResponseDto(Long accountId, String email, String nickname, Date joinedDate) {
        this.accountId = accountId;
        this.email = email;
        this.nickname = nickname;
//        this.joinedDate = joinedDate;
    }
    public static AccountResponseDto from(Account account) {
        return new AccountResponseDto(
                account.getAccountId(),
                account.getEmail(),
                account.getNickname(),
//                account.getJoinedDate());
                account.getCreatedDate());
    }
}