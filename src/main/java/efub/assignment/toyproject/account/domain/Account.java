package efub.assignment.toyproject.account.domain;



import efub.assignment.toyproject.entity.BaseTimeEntity;
import efub.assignment.toyproject.post.domain.Post;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;



@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Account extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id", updatable = false)
    private Long accountId;

    @Column(nullable = false, length = 60)
    private String email;

    @Column(nullable = false)
    private String encodedPassword;

    @Column(nullable = false, updatable = false, length = 16)
    private String nickname;

//    @Column(name = "joined_date", updatable = false)
//    @Temporal(TemporalType.TIMESTAMP)
//    @CreatedDate // 추가
//    private Date joinedDate;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Post> postList = new ArrayList<>();



    @Builder // 객체 생성
    public Account(String email, String password, String nickname) {
        this.email = email;
        this.encodedPassword = password;
        this.nickname = nickname;
//        this.joinedDate = joinedDate;
    }



}
