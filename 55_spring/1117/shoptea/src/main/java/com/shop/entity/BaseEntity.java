package com.shop.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@EntityListeners(value={AuditingEntityListener.class})
// Auditing 을 적용하기 위한 EntityListeners 어노테이션을 추가
@MappedSuperclass // 공통 매핑 정보가 필요할 때
@Getter
@Setter
public abstract class BaseEntity extends BaseTimeEntity {

    @CreatedBy
    @Column(updatable = false)
    private LocalDateTime regTime;

    @LastModifiedBy
    private LocalDateTime updateTime;

    // BaseTimeEntity 상속 받고 있으므로 등록일, 수정일, 등록자, 수정자를
    // 모두 갖는 BaseEntity를 완성, 이를 상속받아 상용


}
