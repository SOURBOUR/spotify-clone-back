package fr.sourav.spotify_clone_back.catalogcontext.application.dto;

import fr.sourav.spotify_clone_back.catalogcontext.application.vo.SongAuthorVO;
import fr.sourav.spotify_clone_back.catalogcontext.application.vo.SongTitleVO;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public class ReadSongInfoDTO {
    private SongTitleVO title;

    private SongAuthorVO author;

    @NotNull
    private byte[] cover;

    @NotNull
    private String coverContentType;

    private boolean isFavorite;

    private UUID publicID;

    public SongTitleVO getTitle() {
        return title;
    }

    public void setTitle(SongTitleVO title) {
        this.title = title;
    }

    public SongAuthorVO getAuthor() {
        return author;
    }

    public void setAuthor(SongAuthorVO author) {
        this.author = author;
    }

    @NotNull
    public byte[] getCover() {
        return cover;
    }

    public void setCover(@NotNull byte[] cover) {
        this.cover = cover;
    }

    public @NotNull String getCoverContentType() {
        return coverContentType;
    }

    public void setCoverContentType(@NotNull String coverContentType) {
        this.coverContentType = coverContentType;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public UUID getPublicID() {
        return publicID;
    }

    public void setPublicID(UUID publicID) {
        this.publicID = publicID;
    }
}
