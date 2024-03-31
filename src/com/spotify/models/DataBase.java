package com.spotify.models;

import java.util.UUID;

public class DataBase {

    public static class BDsongs {
        private final UUID uuidSong = UUID.randomUUID();
        private String songName;
        private String artist;
        private String musicGender;
        private float duration;
        private String album;

        public UUID getuuidSong() { return uuidSong; }
        public String getSongName() {
            return songName;
        }
        public String getArtist() {
            return artist;
        }
        public String getMusicGender() { return musicGender; }
        public String getAlbum() {
            return album;
        }
        public float getDuration() {
            return duration;
        }

        public void Song (UUID uuidSong, String songName, String artist, String musicGender, String album, float duration){
            this.songName = songName;
            this.artist = artist;
            this.musicGender = musicGender;
            this.album = album;
            this.duration = duration;
        }
    }

    public static class BDusers {
        private final UUID uuidUser = UUID.randomUUID();
        private String userName;
        private String password;
        private String firstName;
        private String lastName;
        private int age;

        public UUID getuuidUser() {
            return uuidUser;
        }
        public String getUserName() {
            return userName;
        }
        public String getPassword() {
            return password;
        }
        public String getFirstName() { return firstName; }
        public String getLastName() {
            return lastName;
        }
        public int getAge() {
            return age;
        }

        public void Song (UUID uuidUser, String userName, String password, String firstName, String lastName, int age){
            this.userName = userName;
            this.password = password;
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }
    }

    public static class BDartist {
        private UUID uuidArtist = UUID.randomUUID();
        private String artistName;

        public UUID getuuidArtiste() {
            return uuidArtist;
        }
        public String getartistNamee() {
            return artistName;
        }

        public void Song (UUID uuidArtist, String artistName){
            this.artistName = artistName;
            this.uuidArtist = uuidArtist;
        }
    }

}