package nju.edu.entity;
import org.springframework.data.domain.Persistable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@ToString
@EqualsAndHashCode
@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
public class BaseEntity implements Persistable<Long> {
    @Getter
    @Setter
    @Id
    @Column(name = "F_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Nullable
    @Column(name = "F_CREATED_AT")
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Nullable
    @Column(name = "F_LAST_MODIFIED_AT")
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Override
    public boolean isNew() {
        return null == getId();
    }

    @Override
    @Nullable
    public Long getId(){ return id;}

    public DateTime getCreatedDate() {

        return null == createdDate ? null : new DateTime(createdDate);
    }

    public void setCreatedDate(final DateTime createdDate) {

        this.createdDate = null == createdDate ? null : createdDate.toDate();
    }

    public DateTime getLastModifiedDate() {

        return null == lastModifiedDate ? null : new DateTime(lastModifiedDate);
    }

    public void setLastModifiedDate(final DateTime lastModifiedDate) {

        this.lastModifiedDate = null == lastModifiedDate ? null : lastModifiedDate.toDate();
    }
}
