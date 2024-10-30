package org.mirza.springurlshortener.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.Instant;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "short_urls")
public class ShortUrl {
    @Id
    public Integer id;

    @Column(value = "short_url")
    public String shortUrl;

    @Column(value = "original_url")
    public String originalUrl;

    @Column(value = "created_at")
    public Instant createdAt;

    @Column(value = "access_count")
    public Integer accessCount;
}