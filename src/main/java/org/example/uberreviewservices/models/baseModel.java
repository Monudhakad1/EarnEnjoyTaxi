package org.example.uberreviewservices.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
@MappedSuperclass
@Getter @Setter
@EntityListeners(AuditingEntityListener.class)
public abstract class baseModel {

    @Id  //this property makes the id property as a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // IDENTITY MEANS AUTO INCREMENT AND MANY MORE RESEARCH AND ADD THEM
    protected long id;


    @Column(nullable =false)
    @Temporal(TemporalType.TIMESTAMP) // tells spring about time date type
    @CreatedDate // this annotation tells spring only adjust creation
   protected Date createdAt;


    @Column(nullable =false)
    @Temporal(TemporalType.TIMESTAMP) // date property
    @LastModifiedDate
   protected Date updatedAt;
}
//relations hip in sql --- 1:1 , 1:many , may:many , many:one //sql support
// composition      verses    inheritance ---

