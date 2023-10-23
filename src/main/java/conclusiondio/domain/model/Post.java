package conclusiondio.domain.model;

import jakarta.persistence.Entity;

@Entity (name = "tb_post")
public class Post {
    private String photo;
    private String caption;

    public void setCaption(String caption) {
        this.caption = caption;
    }
    
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getCaption() {
        return caption;
    }

    public String getPhoto() {
        return photo;
    }
}
