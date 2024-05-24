package efub.assignment.toyproject.post.dto;


import efub.assignment.toyproject.account.domain.Account;
import efub.assignment.toyproject.post.domain.Post;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PostRequestDto {
    @NotBlank(message = "계정 id는 필수입니다.")
    private String accountId;

    @NotBlank(message = "제목은 필수입니다.")
    private String title;

    @NotBlank(message = "내용은 필수입니다.")
    private String content;

    public Post toEntity(Account account){
        return Post.builder()
                .account(account)
                .title(this.title)
                .content(this.content)
                .content(content)
                .build();
    }
}
