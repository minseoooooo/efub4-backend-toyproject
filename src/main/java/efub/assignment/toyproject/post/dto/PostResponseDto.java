package efub.assignment.toyproject.post.dto;



import efub.assignment.toyproject.post.domain.Post;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PostResponseDto {
    private Long postId;
    private String writerName;
    private String title;
    private String content;
    private LocalDateTime createdDate;

    public static PostResponseDto from(Post post, String writerName){
        return new PostResponseDto(
                post.getPostId(),
                writerName,
                post.getTitle(),
                post.getContent(),
                post.getCreatedDate()
        );
    }
}
