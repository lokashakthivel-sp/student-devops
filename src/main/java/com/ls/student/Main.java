package com.ls.student;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: Mp3Util <path-to-mp3-file>");
            return;
        }
        Path mp3Path = Paths.get(args[0]);
        String artist = Sub.getArtist(mp3Path);
        if (artist != null) {
            System.out.println("Artist: " + artist);
        } else {
            System.out.println("Could not read artist from: " + mp3Path);
        }
    }
}
