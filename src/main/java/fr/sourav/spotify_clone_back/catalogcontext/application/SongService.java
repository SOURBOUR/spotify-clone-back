package fr.sourav.spotify_clone_back.catalogcontext.application;

import fr.sourav.spotify_clone_back.catalogcontext.application.dto.ReadSongInfoDTO;
import fr.sourav.spotify_clone_back.catalogcontext.application.dto.SaveSongDTO;
import fr.sourav.spotify_clone_back.catalogcontext.application.mapper.SongContentMapper;
import fr.sourav.spotify_clone_back.catalogcontext.application.mapper.SongMapper;
import fr.sourav.spotify_clone_back.catalogcontext.domain.Song;
import fr.sourav.spotify_clone_back.catalogcontext.domain.SongContent;
import fr.sourav.spotify_clone_back.catalogcontext.repository.SongContentRepository;
import fr.sourav.spotify_clone_back.catalogcontext.repository.SongRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SongService {
    private final SongMapper songMapper;

    private final SongRepository songRepository;

    private final SongContentRepository songContentRepository;

    private final SongContentMapper songContentMapper;

    public SongService(SongMapper songMapper, SongRepository songRepository, SongContentRepository songContentRepository, SongContentMapper songContentMapper) {
        this.songMapper = songMapper;
        this.songRepository = songRepository;
        this.songContentRepository = songContentRepository;
        this.songContentMapper = songContentMapper;
    }

    public ReadSongInfoDTO create(SaveSongDTO saveSongDTO) {
        Song song = songMapper.saveSongDTOToSong(saveSongDTO);
        Song songSaved = songRepository.save(song);

        SongContent songContent = songContentMapper.saveSongDTOToSong(saveSongDTO);
        songContent.setSong(songSaved);

        songContentRepository.save(songContent);
        return songMapper.songToReadSongInfoDTO(songSaved);
    }
}
