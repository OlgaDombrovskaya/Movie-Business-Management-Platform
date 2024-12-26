package movie_platform;

import java.util.ArrayList;
import java.util.List;

public class Premiere {
        private int id;
        private String movieTitle;
        private String date;
        private String location;
        private int ticketCount;
        private List<String> guestList;

        public Premiere(int id, String movieTitle, String date, String location, int ticketCount) {
            this.id = id;
            this.movieTitle = movieTitle;
            this.date = date;
            this.location = location;
            this.ticketCount = ticketCount;
            this.guestList = new ArrayList<>();
        }

        public int getId() {
            return id;
        }

        public String getMovieTitle() {
            return movieTitle;
        }

        public String getDate() {
            return date;
        }

        public String getLocation() {
            return location;
        }

        public int getTicketCount() {
            return ticketCount;
        }

        public List<String> getGuestList() {
            return guestList;
        }

        public void sellTicket(int count) {
            if (count > ticketCount) {
                throw new IllegalArgumentException("Not enough tickets available.");
            }
            ticketCount -= count;
        }

        public void addGuest(String guestName) {
            guestList.add(guestName);
        }
    }
    