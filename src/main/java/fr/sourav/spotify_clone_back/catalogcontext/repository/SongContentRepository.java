package fr.sourav.spotify_clone_back.catalogcontext.repository;

import fr.sourav.spotify_clone_back.catalogcontext.domain.SongContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongContentRepository extends JpaRepository<SongContent, Long> {
}
