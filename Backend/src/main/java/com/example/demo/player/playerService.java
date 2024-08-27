package com.example.demo.player;
import java.util.List; // Import the List class
import org.springframework.stereotype.Service;


@Service
public class playerService {

    public List<player> getPlayer() {
		return List.of(
			new player(1L, "Kevin De Bruyne", "Belgium", "MF", 29, 25, 23, 2047.0, 6.0, 12.0, 0.0, 2.0, 0.0, 0.0, 0.0, "Manchester City"),
			new player(2L, "Mohamed Salah", "Egypt", "FW", 28, 25, 24, 2145.0, 17.0, 3.0, 4.0, 0.0, 0.0, 0.0, 0.0, "Liverpool"),
			new player(3L, "Harry Kane", "England", "FW", 27, 24, 24, 2145.0, 13.0, 11.0, 4.0, 0.0, 0.0, 0.0, 0.0, "Tottenham Hotspur"),
			new player(4L, "Bruno Fernandes", "Portugal", "MF", 26, 25, 24, 2145.0, 15.0, 10.0, 5.0, 0.0, 0.0, 0.0, 0.0, "Manchester United"),
			new player(5L, "Son Heung-min", "South Korea", "FW", 28, 24, 23, 2047.0, 13.0, 9.0, 0.0, 0.0, 0.0, 0.0, 0.0, "Tottenham Hotspur")
		);
	}

}
