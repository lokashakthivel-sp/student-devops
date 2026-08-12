package com.ls.student;
import com.mpatric.mp3agic.*;
import java.io.IOException;
import java.nio.file.Path;
public class Sub {
    public static String getArtist(Path path) {
        try {
            Mp3File mp3file = new Mp3File(path);
            ID3v2 id3v2Tag = mp3file.getId3v2Tag();
            if (id3v2Tag != null) {
                String albumArtist = id3v2Tag.getAlbumArtist();
                return albumArtist != null ? albumArtist : id3v2Tag.getArtist();
            }
            return null;
        } catch (IOException | UnsupportedTagException | InvalidDataException e) {
            return null;
        }
    }
}
