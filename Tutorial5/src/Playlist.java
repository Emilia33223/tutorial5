import java.util.ArrayList;

public class Playlist {

    private String name;
    private ArrayList<String> tracks;

    public Playlist(String name) {
        this.name = name;
        tracks = new ArrayList<>();

    }
    public String getName() {
        return this.name;
    }

    public void addTrack(String track) {
        if (!tracks.contains(track)) {
            this.tracks.add(track);
        } else {
            System.out.println("Track " + this.name + " already exists");

        }
    }
    public void removeTrack(String track) {
        boolean isRemoved = this.tracks.remove(track);
        if (!isRemoved) {
            System.out.println("Track " + this.name + " does not exist");
        }

    }

    public void displayPlaylist(){
        System.out.println("Playlist " + this.name);
        if (tracks.isEmpty()) {
            System.out.println("No tracks");

        } else {
            for (String track : tracks) {
                System.out.println("    " + track);
            }
        }
    }




    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<String> tracks) {
        this.tracks = tracks;
    }










    public void display(){
        System.out.println("Playlist " + this.name + " has " + this.tracks.size() + " tracks");
        if (this.tracks.isEmpty()) {
            System.out.println("Playlist " + this.name + " has no tracks");

        }
        else {
            for (String track : this.tracks) {
                System.out.println("  " + track);
            }
        }
    }



}
