package conclusiondio.domain.model;

import jakarta.persistence.Entity;

@Entity (name = "tb_post")
public class Post {
    private String photo;
    private String caption;
}
