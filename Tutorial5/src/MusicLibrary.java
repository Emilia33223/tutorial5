import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;

public class MusicLibrary {
    private final ArrayList<Playlist> playlists;
    private final ArrayList<String> tracks;
    private final String name;
    private final String owner;



    public MusicLibrary(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.playlists = new ArrayList<>();
        this.tracks = new ArrayList<String>();
    }

    public void addTrack(String track) {
        if (tracks.contains(track)) {
            tracks.add(track);

        }

        else {
            System.out.println("Track " + track + " not found");
        }

    }

    public void removeTrack(String track) {
        boolean isRemoved = tracks.remove(track);
        if (isRemoved) {
            System.out.println("Track " + track + " removed");
            for (Playlist playlist : playlists) {
                playlist.removeTrack(track);
            }
        }
        else {
            System.out.println("Track " + track + " not found");

        }
    }

    public void displayTracks() {
        for (String track : tracks) {
            System.out.println(track);
            System.out.println("Trucks in music library" + track);
        }
    }

    public Playlist findPlaylist(String playlistName) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equalsIgnoreCase(playlistName)) {
                return playlist;
            }
        }
        return null;

    }

    public void addTrackToPlaylist(String track, String playlistName) {
        Playlist playlist = findPlaylist(playlistName);
        if (playlist == null) {
            System.out.println("Playlist " + playlistName + " not found");
        }
        else{
            playlist.addTrack(track);
            System.out.println("Track " + track + " added to playlist " + playlistName);
        }
    }

    public void displayPlaylists() {
        for (Playlist playlist : playlists) {
            System.out.println(playlist.getName());

        }
    }

    public void searchTrack(String searchName) {
        for (Playlist playlist : playlists) {
            if (playlist.getName().equalsIgnoreCase(searchName)) {
                System.out.println(playlist.getName());

            }
        }
    }

    public int getTrackCount() {
        return tracks.size();
    }


    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }
}
