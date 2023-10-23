package conclusiondio.domain.model;

import jakarta.persistence.Entity;

@Entity (name = "tb_update")
public class Update {
    private String icon;
    private String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }
}
