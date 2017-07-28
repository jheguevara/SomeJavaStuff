import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity	
public class Score {
	
	@Override
	public String toString() {
		return "Score [id=" + id + ", wins=" + wins + ", losses=" + losses + ", ties=" + ties + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long id;
	public String wins;
	public String losses;
	public String ties;
	public String getWins() {
		return wins;
	}
	public void setWins(String wins) {
		this.wins = wins;
	}
	public String getLosses() {
		return losses;
	}
	public void setLosses(String losses) {
		this.losses = losses;
	}
	public String getTies() {
		return ties;
	}
	public void setTies(String ties) {
		this.ties = ties;
	}

}
