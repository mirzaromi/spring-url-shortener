package org.mirza.springurlshortener.repository;

import org.mirza.springurlshortener.entity.ShortUrl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShortUrlRepository extends JpaRepository<Long, ShortUrl> {

}
